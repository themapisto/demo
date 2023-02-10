package com.example.demo.basic;

import com.example.demo.Member;
import com.example.demo.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberRepository memberRepository;


    @PostConstruct
    public void init(){
        memberRepository.save(new Member(1L,"koo","bench press","incline dumbell press","dips","cable cross over","smith bench press","push down",1L,1));
        memberRepository.save(new Member(2L,"koo","벤트오버 레터럴 레이즈/ 업라이트 로우","OHP","사이드 레터럴 레이즈","리어 델트 로이 머신","머신 숄더 프레스","푸시 다운",1L,1));
        memberRepository.save(new Member(3L,"koo","풀업","시티드 로우","암풀 다운","바벨 로우","원암 머신 풀다운","덤벨 로우",1L,1));
    }

}
