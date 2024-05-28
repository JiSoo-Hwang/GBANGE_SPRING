package com.kh.gbangeSpring.training.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Training {

//	TRAINING_NO
	private int trainingNo;
//	MEMBER_NO
	private String trainingWriter;
	private String trainingTitle;
	private int count;
//	TRAINING_KEY
	private String trainingKey;
//	SHOES_NO
	private int shoesNo;
//	TRAINING_DATE
	private String trainingDate;
//	RECORD_DATE
	private Date recordDate;
//	TRAINING_PLACE
	private String trainingPlace;
//	TRAINING_TIME
	private double trainingTime;
//	TRAINING_GOAL
	private String trainingGoal;
//	TRAINING_DISTANCE
	private double trainingDistance;
//	WEIGHT
	private double weight;
//	TRAINING_CONTENT
	private String trainingContent;
//	BOARD_ID
	private int boardId;

	private String oCStatus;

	private String status;
}
