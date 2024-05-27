package com.kh.gbangeSpring.member.model.service;

import org.springframework.stereotype.Service;

import com.kh.gbangeSpring.member.model.vo.Member;


@Service
public interface MemberService {
	int insertMember(Member m);

	boolean checkId(String inputId);

	Member loginMember(Member m);
}
