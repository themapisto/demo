package com.example.demo;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/index")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @PostMapping("/join")
    public String join(@RequestBody Member member){
    Member newmember = memberRepository.save(member);
        return member.getUsername();
    }
    @GetMapping("/user")
    public Member findUser(@RequestParam Long id){
        Optional<Member> member =memberRepository.findById(id);
        return member.get();
    }

}
