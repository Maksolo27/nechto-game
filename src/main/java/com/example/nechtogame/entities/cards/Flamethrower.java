package com.example.nechtogame.entities.cards;


import com.example.nechtogame.entities.CardType;
import com.example.nechtogame.entities.GameMember;
import com.example.nechtogame.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Flamethrower extends AbstractEventCard {

    private final String name = "Flamethrower";
    private final String description = "";
    private final CardType cardType = CardType.FLAMETHROWER;

    @Autowired
    private final PlayerService playerService;

    public void apply(GameMember gameMember) {
        playerService.removeGameMember (gameMember);
    }

}
