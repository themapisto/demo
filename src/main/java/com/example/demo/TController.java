package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TController {

    @Autowired
    private TService tService;

    @Autowired
    MemberRepository memberRepository;



    @GetMapping("/hello-mvc")
    public String hello(Model model){

        model.addAttribute("data","Hello this is koo blog");
        model.addAttribute("list",tService.MemberList(1L));


        return "index";
    }


    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("member", new Member());
        return "addForm";
    }

    @PostMapping("/add")
    public String addItem(@ModelAttribute Member member, RedirectAttributes redirectAttributes) {

        System.out.println(member.getId());
        System.out.println(member.getUsername());

        Member savedMember = memberRepository.save(member);

        redirectAttributes.addAttribute("id", savedMember.getId());

        return "index";
    }
}
