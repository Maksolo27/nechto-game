package com.example.nechtogame.services;

import com.example.nechtogame.code.CardType;
import com.example.nechtogame.code.cards.AbstractEventCard;
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