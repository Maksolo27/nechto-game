package com.example.nechtogame.controller;

import com.example.nechtogame.core.cards.AbstractEventCard;
import com.example.nechtogame.services.CardService;
import com.example.nechtogame.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/cards")
public class GameController {

    @Autowired
    PlayerService playerService;
    @Autowired
    CardService cardService;

    @GetMapping
    public String showPlayerCards(Model model) {
        List<AbstractEventCard> cards = playerService.getCardsOfPlayer ();
        model.addAttribute ("card", cards.get (1));
        return "cards";
    }
}
