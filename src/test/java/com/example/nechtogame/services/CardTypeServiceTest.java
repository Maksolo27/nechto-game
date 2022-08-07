package com.example.nechtogame.services;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


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