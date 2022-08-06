package com.example.nechtogame.core.cards;

import com.example.nechtogame.core.CardType;
import com.example.nechtogame.core.GameMember;
import com.example.nechtogame.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Whiskey extends AbstractEventCard {

    private final String name = "Whiskey";
    private final String description = "";
    private final CardType cardType = CardType.WHISKEY;

    @Autowired
    private CardService cardService;

    public void apply(GameMember gameMember) {
         cardService.getCardListOfGameMember (gameMember);
    }
}
