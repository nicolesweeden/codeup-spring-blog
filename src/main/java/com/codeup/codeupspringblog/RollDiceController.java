package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    @ResponseBody
    public String diceRollGuess() {
        return "Please guess a number from 1 through 6:";
    }

    @GetMapping("/roll-dice/n")
    @ResponseBody
    public String diceRollResult() {
        return "";
    }


    @PostMapping("/roll-dice")
    public String diceRoll(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }

}//end RollDiceController
