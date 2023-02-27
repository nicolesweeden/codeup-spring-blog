package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String diceRollGuess() {
        return "RollDiceIndex";
    }

//    @GetMapping("/roll-dice/n")
//    public String diceRollResult() {
//        return "RollDiceResult";
//    }
//
//
//    @PostMapping("/roll-dice")
//    public String diceRoll(@RequestParam(name = "cohort") String cohort, Model model) {
//        model.addAttribute("cohort", "Welcome to " + cohort + "!");
//        return "join";
//    }

}//end RollDiceController
