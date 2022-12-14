package com.example.nechtogame.services;

import com.example.nechtogame.core.Bot;
import com.example.nechtogame.core.GameMember;
import com.example.nechtogame.core.Player;
import com.example.nechtogame.core.cards.AbstractEventCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final List<GameMember> LIST_OF_GAME_MEMBERS = new ArrayList<> ();

    public void removeGameMember(GameMember gameMember){
        LIST_OF_GAME_MEMBERS.remove (gameMember);
    }

    public void fillGameMemberList(int botNumber){
        LIST_OF_GAME_MEMBERS.add (new Player ());
        for (int i = 0; i < botNumber; i++) {
            LIST_OF_GAME_MEMBERS.add (new Bot ());
        }
    }

    public List<GameMember> getGameMemberList(){
        return LIST_OF_GAME_MEMBERS;
    }

    public List<AbstractEventCard> getCardsOfPlayer(){
        return LIST_OF_GAME_MEMBERS.stream ()
                .filter (gameMember -> gameMember.getClass () == Player.class)
                .collect(Collectors.toList())
                .get (0)
                .getCardList ();
    }



}
