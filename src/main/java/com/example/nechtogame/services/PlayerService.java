package com.example.nechtogame.services;

import com.example.nechtogame.code.Bot;
import com.example.nechtogame.code.GameMember;
import com.example.nechtogame.code.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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



}
