package com.codeup.codeupspringblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MathController {
    @GetMapping("/")
    public String land() {
        return "index";
    }
}

//@Controller
//public class HelloController {
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, World!";
//    }
//
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//
//    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
//
//}//end HelloController