package com.example.nechtogame.core;

import com.example.nechtogame.core.cards.AbstractEventCard;
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

    @Override
    public void addToCardList(AbstractEventCard abstractEventCard) {
        cardList.add (abstractEventCard);
    }
}
