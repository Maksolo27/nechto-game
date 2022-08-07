package com.example.nechtogame.services;

import com.example.nechtogame.core.CardType;
import com.example.nechtogame.core.GameMember;
import com.example.nechtogame.core.cards.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CardService {

    private static final int CARD_DECK_SIZE = 88;
    private static final int DEFAULT_NUMBER_OF_CARDS_IN_HAND = 4;
    private final BeanFactory beanFactory;
    private final PlayerService playerService;

    @Autowired
    CardService(BeanFactory beanFactory, PlayerService playerService) {
        this.beanFactory = beanFactory;
        this.playerService = playerService;
    }

    public List<AbstractEventCard> shuffleCards() {
        List<AbstractEventCard> cardList = fillDeck ();
        List<AbstractEventCard> resultCardList = new ArrayList<> ();
        boolean[] indexes = new boolean[cardList.size ()];
        for (int i = 0; i < cardList.size (); i++) {
            int randomIndex = (int) Math.floor(Math.random() * ( cardList.size () - 1) + 1);
            if (!indexes[randomIndex]) {
                resultCardList.add (cardList.get (randomIndex));
                indexes[randomIndex] = true;
            } else {
                int pseudoRandomIndex = findFalseInArray (indexes);
                resultCardList.add (cardList.get (pseudoRandomIndex));
                indexes[pseudoRandomIndex] = true;
            }
        }
        return resultCardList;
    }

    private int findFalseInArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                return i;
            }
        }
        return 0;
    }

    // TODO: Refactor
    private List<AbstractEventCard> fillDeck() {
        CardType[] cardTypes = CardType.values ();
        List<CardType> cardTypeList = new ArrayList<> ();
        for (CardType cardType : cardTypes) {
            int numberInDeck = cardType.getNumberInDeck ();
            for (int j = 0; j < numberInDeck - 1; j++) {
                cardTypeList.add (cardType);
            }
        }
        List<AbstractEventCard> cardDeck = new ArrayList<> ();
        for (CardType cardType : cardTypeList) {
            switch (cardType) {
                case AXE -> cardDeck.add (beanFactory.getBean (Axe.class));
                case ANALYZE -> cardDeck.add (beanFactory.getBean (Analyze.class));
                case WHISKEY -> cardDeck.add (beanFactory.getBean (Whiskey.class));
                case SUSPICION -> cardDeck.add (beanFactory.getBean (Suspicion.class));
                case FLAMETHROWER -> cardDeck.add (beanFactory.getBean (Flamethrower.class));
            }
        }
        return cardDeck;
    }

    public void distributeCards() {
        List<GameMember> memberList = playerService.getGameMemberList ();
        List<AbstractEventCard> cards = shuffleCards ();
        int j = 0;
        int k = 0;
        while (j < memberList.size ()) {
            GameMember member = memberList.get (j);
            for (int i = 0; i < DEFAULT_NUMBER_OF_CARDS_IN_HAND; i++) {
                member.addToCardList (cards.get (k));
                k++;
            }
            j++;
        }
    }

    public List<AbstractEventCard> getCardListOfGameMember(GameMember gameMember) {
        return gameMember.getCardList ();
    }


}
