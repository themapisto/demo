package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/form")
public class TController {

    @Autowired
    private TService tService;

    @Autowired
    MemberRepository memberRepository;



    @GetMapping
    public String hello(Model model){
        model.addAttribute("data","Hello this is koo blog");
        model.addAttribute("list",tService.MemberList(1L));
        return "form/exercises";
    }

    @GetMapping("/{memberId}")
    public String member(@PathVariable long memberId, Model model){

        Optional<Member> member=tService.MemberGet(memberId);
        System.out.println(member.toString());

        Member memberEntity = member.orElse(null);


        model.addAttribute("member", memberEntity);
        return "form/exercise";
    }


    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("member", new Member());
        return "form/addForm";
    }

    @PostMapping("/add")
    public String addItem(@ModelAttribute Member member, RedirectAttributes redirectAttributes) {

        System.out.println(member.getId());
        System.out.println(member.getUsername());

        Member savedMember = memberRepository.save(member);
        redirectAttributes.addAttribute("id", savedMember.getId());

        return "redirect:/form";
    }
}
