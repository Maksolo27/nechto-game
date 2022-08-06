package com.example.nechtogame.core.cards;

import com.example.nechtogame.core.CardType;
import com.example.nechtogame.core.GameMember;
import org.springframework.stereotype.Component;

@Component
public class Suspicion extends AbstractEventCard {

    private final String name = "Suspicion";
    private final String description = "";
    private final CardType cardType = CardType.SUSPICION;

    public AbstractEventCard apply (GameMember gameMember, int cardIndex) {
        return gameMember.getCard(cardIndex);
    }
}
