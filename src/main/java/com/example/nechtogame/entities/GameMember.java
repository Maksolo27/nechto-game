package com.example.nechtogame.entities;

import com.example.nechtogame.entities.cards.AbstractEventCard;

import java.util.List;

public interface GameMember {


    List<AbstractEventCard> getCardList();

    boolean isOnQuarantine();

    void setOnQuarantine(boolean onQuarantine);

    AbstractEventCard getCard(int index);
}
