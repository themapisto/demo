package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class TService {

    @Autowired
    private MemberRepository memberRepository;


    public Member MemberList(@RequestParam Long id) {
        System.out.println("Service 호출!!");
        Optional<Member> member =memberRepository.findById(id);
        return member.get();
    }
}