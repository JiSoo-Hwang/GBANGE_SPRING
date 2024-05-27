package com.kh.gbangeSpring.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.gbangeSpring.member.model.service.MemberService;
import com.kh.gbangeSpring.member.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@GetMapping("insert.me")
	public String memberEnrollForm() {
		return "member/memberEnrollForm";
	}
	
	@PostMapping("insert.me")
	public ModelAndView insertMember(Member m, ModelAndView mv, HttpSession session) {
	
		String encPwd = bCryptPasswordEncoder.encode(m.getMemberPwd()); 
		m.setMemberPwd(encPwd);
		int result = memberService.insertMember(m);
		if(result>0) {
			session.setAttribute("loginUser", m);
			session.setAttribute("alertMsg", m.getMemberName()+"님 환영합니다!");
			mv.setViewName("redirect:/");
		}else {
			mv.addObject("alertMsg","회원가입 실패ㅠㅠ... 다시 시도해주세요!");
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	
	@GetMapping
	public String loginPage() {
		return "member/loginForm";
	}
	
	@PostMapping
	public String loginMember(Member m, ModelAndView mv,HttpSession session) {
		
		Member loginUser = memberService.loginMember(m);
		
		
		
		return "";
	}
	
	
}
