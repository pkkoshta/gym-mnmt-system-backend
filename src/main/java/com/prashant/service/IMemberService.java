package com.prashant.service;

import com.prashant.entity.Member;

import java.util.List;

public interface IMemberService {
    List<Member> findAll();
    Member getMember(int id);
    Member updateMember(int id, Member member);
    void deleteMember(int id);
    Member createMember(Member member);
}
