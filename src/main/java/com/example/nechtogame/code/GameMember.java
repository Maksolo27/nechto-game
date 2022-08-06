package com.example.nechtogame.code;

import com.example.nechtogame.code.cards.AbstractEventCard;

import java.util.List;

public interface GameMember {


    List<AbstractEventCard> getCardList();

    boolean isOnQuarantine();

    void setOnQuarantine(boolean onQuarantine);

    AbstractEventCard getCard(int index);
}
