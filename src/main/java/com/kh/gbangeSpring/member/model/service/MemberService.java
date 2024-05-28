package com.kh.gbangeSpring.member.model.service;


import com.kh.gbangeSpring.member.model.vo.Member;


public interface MemberService {
	int insertMember(Member m);

	boolean checkId(String inputId);

	Member loginMember(Member m);
}
