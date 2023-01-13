package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MemberRepositoryTests extends DemoApplicationTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void create (){

        Member member = new Member();

        member.setId(1L);
        member.setAge(30);
        member.setMeberDesc(1L);
        member.setUsername("kpkim");

        Member newMember= new Member();

        newMember=memberRepository.save(member);
    }


    @Test
    public void read(){
        Optional<Member> member =memberRepository.findById(1L);
        member.ifPresent(selectMember->{
            System.out.println(selectMember.getUsername());
        });
    }

}
