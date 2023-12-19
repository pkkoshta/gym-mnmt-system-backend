package com.prashant.service;

import com.prashant.entity.Member;
import com.prashant.exception.MemberNotFoundException;
import com.prashant.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService{

    @Autowired
    private MemberRepository memberRepository;
    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMember(int id) {
        return memberRepository.findById(id)
                .orElseThrow(()-> new MemberNotFoundException(id));
    }

    @Override
    public Member updateMember(int id, Member member) {
        Member member1 = memberRepository.findById(id)
                .orElseThrow(()-> new MemberNotFoundException(id));
        member1.setMemberId(id);
        member1.setAge(member.getAge());
        member1.setGender(member.getGender());
        member1.setPassword(member.getPassword());
        member1.setBloodGroup(member.getBloodGroup());
        member1.setMobileNo(member.getMobileNo());
        member1.setSuscriptionType(member.getSuscriptionType());
        member1.setLastName(member.getLastName());
        return memberRepository.save(member1);
    }

    @Override
    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }

    @Override
    public Member createMember(Member member) {
        member.setPassword(member.getFirstName().toUpperCase().substring(0,3));
        return memberRepository.save(member);
    }
}
