package com.kh.gbangeSpring.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int memberNo;
	private String memberName;
	private String memberId;
	private String memberPwd;
	private String gender;
	private String address;
	private String memberPno;
	private double mileage;
	private String shoes;
	private double weight;
	private Date enrollDate;
	private String status;
	private String profileImage;
	private String filePath;
	private String changeName;
}
