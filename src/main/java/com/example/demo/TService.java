package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class TService {

    @Autowired
    private MemberRepository memberRepository;


    public List<Member> MemberList(@RequestParam Long id) {


        List<Member> allist = memberRepository.findAll();

        return allist;

    }

    public Optional<Member> MemberGet(@RequestParam Long id){
        Optional<Member> member = memberRepository.findById(id);
        return member;
    }

}