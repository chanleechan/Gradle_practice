package project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import project.project.service.MemberService;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    //연결시켜줄때 Autowired 사용
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
