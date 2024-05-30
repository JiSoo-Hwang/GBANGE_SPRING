package com.kh.gbangeSpring.training.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.gbangeSpring.common.model.vo.PageInfo;
import com.kh.gbangeSpring.common.model.vo.Shoes;
import com.kh.gbangeSpring.training.model.vo.Attachment;
import com.kh.gbangeSpring.training.model.vo.Reply;
import com.kh.gbangeSpring.training.model.vo.Training;
import com.kh.gbangeSpring.training.model.vo.TrainingCategory;

public interface TrainingService {
	
	public ArrayList<TrainingCategory> selectCategoryList();
	public ArrayList<Shoes> selectShoesList();

	public int insertTraining(HashMap<Training, Attachment> map);

	public int increaseCount(int trainingNo);

	public int listCount();
	public ArrayList<Training> selectList(PageInfo pi);
	public Training selectTraining(int trainingNo);

	/*
	public Attachment selectAttachment(int trainingNo);

	public int updateTraining(Training t, Attachment at);

	public int deleteTraining(int trainingNo);

	public int insertReply(Reply r);

	public ArrayList<Reply> selectReplyList(int reftrainingNo);

	public int deleteReply(Reply r);

	public int updateReply(String originReply, String changeReply, String replyWriter, int reftrainingNo);

	public int updateLikes(int trainingNo);

	public int selectLikes(int trainingNo);


	public Shoes selectShoes(int trainingNo);

	public ArrayList<Training> searchByTitle(PageInfo pi,String keyword);

	public ArrayList<Training> searchByCategory(PageInfo pi,String keyword);

	public ArrayList<Training> searchByContent(PageInfo pi,String keyword);
*/
}
