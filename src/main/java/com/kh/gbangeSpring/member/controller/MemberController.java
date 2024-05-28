package com.kh.gbangeSpring.member.controller;



public class MemberController {
	
/*	
	private MemberService memberService;
	
	
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
	
	@GetMapping("login.me")
	public String loginPage() {
		return "member/loginForm";
	}
	
	@PostMapping("login.me")
	public ModelAndView loginMember(Member m, ModelAndView mv,HttpSession session) {
		
		Member loginUser = memberService.loginMember(m);
		
		if(loginUser == null || !bCryptPasswordEncoder.matches(m.getMemberPwd(), loginUser.getMemberPwd())) {
			mv.addObject("alertMsg", "로그인 실패ㅠㅠ");
			mv.setViewName("redirect:/");
		}else {
			session.setAttribute("alertMsg", loginUser.getMemberName()+"님 환영합니다^^");
			session.setAttribute("loginUser", loginUser);
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	
	*/
}
