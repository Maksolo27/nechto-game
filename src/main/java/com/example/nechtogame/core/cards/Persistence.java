package com.example.nechtogame.core.cards;

import com.example.nechtogame.core.CardType;
import com.example.nechtogame.core.GameMember;
import com.example.nechtogame.services.CardService;
import com.example.nechtogame.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

public class Persistence extends AbstractEventCard{

    private final String name = "Persistence";
    private final String description = "";
    private final CardType cardType = CardType.PERSISTENCE;

    @Autowired
    private CardService cardService;

    public void apply(GameMember gameMember){
        int chosenCardIndex = 0;
        for (int i = 0; i < 3; i++) {
            cardService.playingDeck.get(i);
        }

        switch (chosenCardIndex){
            case 1 : gameMember.addToCardList(cardService.playingDeck.get(0));
            break;
            case 2 : gameMember.addToCardList(cardService.playingDeck.get(1));
            break;
            case 3 : gameMember.addToCardList(cardService.playingDeck.get(2));
            break;
        }
    }

}
/*
Возьмите 3 карты событий из
общей колоды, добавьте одну из них на руку
и сбросьте остальные. Затем сыграйте или
сбросьте 1 карту. На одном и том же ходу можно сыграть несколько карт «Упорство».
 */