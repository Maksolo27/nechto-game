package com.example.nechtogame.core;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CardType {

    FLAMETHROWER(3),
    ANALYZE(5),
    AXE(4),
    SUSPICION(6),
    WHISKEY(6),

    PERSISTENCE(4);

    private final int numberInDeck;

}

/*
------------------------------------------------------------------------------------
SOMETHING «Нечто». - 1
INFECTION «Заражение!». - 6
FLAMETHROWER «Огнемёт». - 3
ANALYZE «Анализ». - 5
AXE «Топор». - 4
SUSPICION «Подозрение». - 6
WHISKEY «Виски». - 6
PERSISTENCE «Упорство». – 4
LOOK_AROUND «Гляди по сторонам». - 6
CHANGE_PLACES «Меняемся местами!». - 6
GET_OUT «Сматывай удочки». - 6
SEDUCTION «Соблазн». - 6
FEAR «Страх». - 4
I’M_FINE_HEERE «Мне и здесь неплохо». - 5
NO_THANKS «Нет уж, спасибо!». - 4
BY «Мимо!» - 4
NO_BBQ «Никакого шашлыка!». - 4
QUARANTINE «Карантин». - 4
BOARDED_UP_DOOR «Заколоченная дверь». – 4
------------------------------------------------------------------------------------
 Sum: 88 cards
------------------------------------------------------------------------------------
 */