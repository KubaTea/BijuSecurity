package com.biju.securitybiju.controllers;

import com.biju.securitybiju.model.Cards;
import com.biju.securitybiju.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {
    @Autowired
    private CardsRepository cardsRepository;
    @GetMapping("/myCards")
    public List<Cards> getCardDetails(@RequestParam int id) {
        List<Cards> cards = cardsRepository.findByArtistId(id);
        if (cards != null ) {
            return cards;
        }else {
            return null;
        }
    }
}
