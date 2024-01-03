package com.shop.shoppingmall.members;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String loginForm() {
    	return "member/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("memberId") String memberId,
                        @RequestParam("memberPass") String memberPass,
                        HttpSession session, Model model) {
        Members member = memberService.login(memberId, memberPass);
        if (member != null) {
            session.setAttribute("member", member);
            return "redirect:/home";
        } else {
            model.addAttribute("loginError", "Invalid memberId or memberPass");
            return "member/login";
        }
    }
    
    @GetMapping("/home")
    public String main(Model model, HttpSession session) {
        Members member = (Members) session.getAttribute("member");
        if (member != null) {
            model.addAttribute("memberId", member.getMemberId());
        }
        return "member/main";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 로그아웃 처리
        session.invalidate();
        return "redirect:/login";
    }
}

