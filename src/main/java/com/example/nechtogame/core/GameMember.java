package com.example.nechtogame.core;

import com.example.nechtogame.core.cards.AbstractEventCard;

import java.util.List;

public interface GameMember {


    List<AbstractEventCard> getCardList();

    boolean isOnQuarantine();

    void setOnQuarantine(boolean onQuarantine);

    AbstractEventCard getCard(int index);
}
