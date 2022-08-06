package com.example.nechtogame.services;

import com.example.nechtogame.core.CardType;
import com.example.nechtogame.core.cards.AbstractEventCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CardTypeServiceTest {

    @Autowired
    CardService cardService;
    @Autowired
    PlayerService playerService;

    @Test
    public void testDistributeCards(){
        playerService.fillGameMemberList (2);
        cardService.distributeCards ();
        playerService.getGameMemberList ().forEach (gameMember -> System.out.println (gameMember.getCardList ()));

    }

}