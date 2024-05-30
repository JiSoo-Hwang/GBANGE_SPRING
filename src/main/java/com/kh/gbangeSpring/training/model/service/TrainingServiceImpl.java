package com.kh.gbangeSpring.training.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.gbangeSpring.common.model.vo.PageInfo;
import com.kh.gbangeSpring.common.model.vo.Shoes;
import com.kh.gbangeSpring.training.model.dao.TrainingDao;
import com.kh.gbangeSpring.training.model.vo.Attachment;
import com.kh.gbangeSpring.training.model.vo.Reply;
import com.kh.gbangeSpring.training.model.vo.Training;
import com.kh.gbangeSpring.training.model.vo.TrainingCategory;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private TrainingDao trainingDao;
	
	@Override
	public ArrayList<TrainingCategory> selectCategoryList() {
		return trainingDao.selectCategoryList(sqlSession);
	}

	@Override
	public ArrayList<Shoes> selectShoesList() {
		return trainingDao.selectShoesList(sqlSession);
	}

	@Override
	public int insertTraining(HashMap<Training, Attachment> map) {
		return trainingDao.insertTraining(sqlSession, map);
	}

	@Override
	public int increaseCount(int trainingNo) {
		return trainingDao.increaseCount(sqlSession, trainingNo);
	}

	@Override
	public int listCount() {
		return trainingDao.listCount(sqlSession);
	}

	@Override
	public ArrayList<Training> selectList(PageInfo pi) {
		return trainingDao.selectList(sqlSession, pi);
	}
	@Override
	public Training selectTraining(int trainingNo) {
		return trainingDao.selectTraining(sqlSession, trainingNo);
	}
	/*

	@Override
	public Attachment selectAttachment(int trainingNo) {
		return trainingDao.selectAttachment(sqlSession, trainingNo);
	}

	@Override
	public int updateTraining(Training t, Attachment at) {
		return trainingDao.updateTraining(sqlSession, t);
	}

	@Override
	public int deleteTraining(int trainingNo) {
		return trainingDao.deleteTraining(sqlSession, trainingNo);
	}

	@Override
	public int insertReply(Reply r) {
		return trainingDao.insertReply(sqlSession, r);
	}

	@Override
	public ArrayList<Reply> selectReplyList(int reftrainingNo) {
		return trainingDao.selectReplyList(sqlSession, reftrainingNo);
	}

	@Override
	public int deleteReply(Reply r) {
		return trainingDao.deleteReply(sqlSession, r);
	}

	@Override
	public int updateReply(String originReply, String changeReply, String replyWriter, int reftrainingNo) {
		return trainingDao.updateReply(sqlSession, originReply, changeReply, reftrainingNo, replyWriter);
	}

	@Override
	public int updateLikes(int trainingNo) {
		return trainingDao.updateLikes(sqlSession, trainingNo);
	}

	@Override
	public int selectLikes(int trainingNo) {
		return trainingDao.selectLikes(sqlSession, trainingNo);
	}


	@Override
	public Shoes selectShoes(int trainingNo) {
		return trainingDao.selectShoes(sqlSession, trainingNo);
	}

	@Override
	public ArrayList<Training> searchByTitle(PageInfo pi, String keyword) {
		return trainingDao.searchByTitle(sqlSession, pi, keyword);
	}

	@Override
	public ArrayList<Training> searchByCategory(PageInfo pi, String keyword) {
		return trainingDao.searchByCategory(sqlSession, pi, keyword);
	}

	@Override
	public ArrayList<Training> searchByContent(PageInfo pi, String keyword) {
		return trainingDao.searchByContent(sqlSession, pi, keyword);
	}
*/
}
