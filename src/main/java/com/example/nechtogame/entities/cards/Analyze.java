package com.example.nechtogame.entities.cards;

import com.example.nechtogame.entities.CardType;
import com.example.nechtogame.entities.GameMember;
import com.example.nechtogame.services.CardService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class Analyze extends AbstractEventCard {

    private final String name = "Analyze";
    private final String description = "";
    private final CardType cardType = CardType.ANALYZE;

    @Autowired
    private final CardService cardService;

    public List<AbstractEventCard> apply(GameMember gameMember){
        return cardService.getCardListOfGameMember (gameMember);
    }
}
