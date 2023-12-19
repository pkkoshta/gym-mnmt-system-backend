package com.prashant.controller;

import com.prashant.entity.Member;
import com.prashant.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {
    @Autowired
    private IMemberService iMemberService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Member> members(){
        return iMemberService.findAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Member updateMember(@PathVariable int id, @RequestBody Member member){
        return iMemberService.updateMember(id, member);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Member saveMember(@RequestBody Member member){
        return iMemberService.createMember(member);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteMember(@PathVariable int id){
        iMemberService.deleteMember(id);
    }
}
