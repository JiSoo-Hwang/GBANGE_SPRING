package com.kh.gbangeSpring.member.model.service;

import org.springframework.stereotype.Service;

import com.kh.gbangeSpring.member.model.vo.Member;


@Service
public class MemberServiceImpl implements MemberService {

	//회원가입 메소드
	@Override
	public int insertMember(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}

	//아이디 중복확인 메소드
	@Override
	public boolean checkId(String inputId) {
		// TODO Auto-generated method stub
		return false;
	}

	//로그인 메소드
	@Override
	public Member loginMember(Member m) {
		// TODO Auto-generated method stub
		return null;
	}

}
