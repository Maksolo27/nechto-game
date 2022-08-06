package com.example.nechtogame.code.cards;

import com.example.nechtogame.code.CardType;
import com.example.nechtogame.code.GameMember;
import org.springframework.stereotype.Component;

@Component
public class Axe extends AbstractEventCard{

    private final String name = "Axe";
    private final String description = "";
    private final CardType cardType = CardType.AXE;


    public void apply(GameMember gameMember) {
        gameMember.setOnQuarantine (false);
    }

}
