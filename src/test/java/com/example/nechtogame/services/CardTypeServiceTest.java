package com.example.nechtogame.services;

import com.example.nechtogame.entities.CardType;
import com.example.nechtogame.entities.cards.AbstractEventCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class CardTypeServiceTest {

    @Autowired
    CardService cardService;

    @Test
    public void testShuffleCards(){
        List<AbstractEventCard> cardTypeList = cardService.shuffleCards ();
        Assertions.assertNull (cardTypeList);
        Assertions.assertEquals (cardTypeList.size (), CardType.values ().length);
    }

}