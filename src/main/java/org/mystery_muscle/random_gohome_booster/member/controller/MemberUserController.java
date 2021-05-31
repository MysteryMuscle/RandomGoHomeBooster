package org.mystery_muscle.random_gohome_booster.member.controller;

import org.mystery_muscle.random_gohome_booster.member.dto.MemberDto;
import org.mystery_muscle.random_gohome_booster.member.dto.ResultDto;
import org.mystery_muscle.random_gohome_booster.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RestController
@RequiredArgsConstructor
public class MemberUserController {

    private final MemberService memberService;

    @PostMapping("/member")
    public @ResponseBody ResultDto LoginGet(MemberDto memberDto){
        
        return new ResultDto("Created.", memberService.loginGet(memberDto));
    } 
}
