package com.example.nechtogame.services;

import com.example.nechtogame.entities.CardType;
import com.example.nechtogame.entities.GameMember;
import com.example.nechtogame.entities.cards.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CardService {

    private static final int CARD_DECK_SIZE = 88;
    private final BeanFactory beanFactory;

    @Autowired
    CardService(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public List<AbstractEventCard> shuffleCards(){
        List<AbstractEventCard> cardList = fillDeck ();
        List<AbstractEventCard> resultCardList = new ArrayList<> ();
        for (int i = 0; i < cardList.size (); i++) {
            int randomIndex = (int) Math.floor(Math.random() * ( cardList.size () - 1) + 1);
            resultCardList.add (cardList.get (randomIndex));
            cardList.remove (randomIndex);
        }
        return resultCardList;
    }

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

    public List<AbstractEventCard> getCardListOfGameMember(GameMember gameMember) {
        return gameMember.getCardList ();
    }


}
