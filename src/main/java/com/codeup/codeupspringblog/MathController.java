package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MathController {
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
//as an example to add 5 and 4, the url would be: http://localhost:8080/add/5/and/4

    @GetMapping("/subtract/{num1}/and/{num2}")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
//as an example to subtract 4 from 5, the url would be: http://localhost:8080/subtract/5/and/4

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
//as an example to multiply 4 times 5, the url would be: http://localhost:8080/multiply/5/and/4

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String divide(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
//as an example to divide 2 into 10, the url would be: http://localhost:8080/divide/10/and/2

}//end MathController
