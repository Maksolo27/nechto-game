package com.example.nechtogame.entities;

import com.example.nechtogame.entities.cards.AbstractEventCard;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Player implements GameMember {

    @Getter
    private List<AbstractEventCard> cardList = new ArrayList<> ();
    private boolean isOnQuarantine = false;

    @Override
    public AbstractEventCard getCard(int index) {
        return cardList.get (index);
    }
}
