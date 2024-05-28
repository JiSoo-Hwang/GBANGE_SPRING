package com.kh.gbangeSpring.training.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reply {
//	reply_NO
	private int replyNo;
//	reply_CONTENT
	private String replyContent;
//	REF_TNO
	private int refTno;
//	reply_WRITER
	private String replyWriter;
//	CREATE_DATE
	private String createDate;
//	STATUS
	private String status;
}
