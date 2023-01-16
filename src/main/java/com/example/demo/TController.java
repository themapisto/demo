package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TController {

    @Autowired
    private TService tService;


    @GetMapping("/hello-mvc")
    public String hello(Model model){

        model.addAttribute("data","Hello this is koo blog");
        model.addAttribute("list",tService.MemberList(1L));

        return "index";
    }
}
