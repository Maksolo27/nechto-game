package com.example.nechtogame.core;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CardType {

    FLAMETHROWER(3),
    ANALYZE(5),
    AXE(3),
    SUSPICION(3),
    WHISKEY(3);

    private final int numberInDeck;

}
