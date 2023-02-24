package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsHomePage() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsViewSinglePost(@PathVariable long id) {
        return "Viewing single post with id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsViewFormToCreatePost() {
        return "view form to create a post";
    }

//David said to hold off on last one since we have not talked about it yet
//    @PostMapping("/posts/create")
//    public String postsCreateNewPost() {
//        return "create a new post";
//    }

}
