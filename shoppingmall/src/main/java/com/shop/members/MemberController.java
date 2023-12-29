package com.shop.members;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	// "/" 경로로 접속했을 때의 처리를 위한 메서드
	@GetMapping("/member")
	public String index(Model model) {
		// 전체 멤버 정보를 조회하는 서비스 메서드를 호출
		List<members> memberList = memberService.getAllMembers();

		// 조회한 멤버 리스트를 모델에 추가
		model.addAttribute("members", memberList);

		// 뷰 이름을 반환 (src/main/resources/templates/index.html)
		return "member/member";
	}
}
