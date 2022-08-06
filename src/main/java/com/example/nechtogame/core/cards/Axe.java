package com.example.nechtogame.core.cards;

import com.example.nechtogame.core.CardType;
import com.example.nechtogame.core.GameMember;
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
