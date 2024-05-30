package com.kh.gbangeSpring.training.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.gbangeSpring.common.model.vo.PageInfo;
import com.kh.gbangeSpring.common.model.vo.Shoes;
import com.kh.gbangeSpring.training.model.vo.Attachment;
import com.kh.gbangeSpring.training.model.vo.Reply;
import com.kh.gbangeSpring.training.model.vo.Training;
import com.kh.gbangeSpring.training.model.vo.TrainingCategory;

@Repository
public class TrainingDao {
	
	public ArrayList<TrainingCategory> selectCategoryList(SqlSessionTemplate sqlSession) {
		
		return (ArrayList)sqlSession.selectList("trainingMapper.selectCategoryList");
	}
	
	public ArrayList<Shoes> selectShoesList(SqlSessionTemplate sqlSession) {
		ArrayList<Shoes> sList = new ArrayList<>();
		return (ArrayList)sqlSession.selectList("trainingMapper.selectShoesList");
	}

	
	public int insertTraining(SqlSessionTemplate sqlSession, HashMap<Training, Attachment> map) {
		int result = sqlSession.insert("trainingMapper.insertTraining",map);
		return result;
	}
	
	 
	public int increaseCount(SqlSessionTemplate sqlSession, int trainingNo) {
		return sqlSession.update("trainingMapper.increaseCount",trainingNo);
	}
	public int listCount(SqlSessionTemplate sqlSession) {
		int listCount = sqlSession.selectOne("trainingMapper.listCount");
		return listCount;
	}

	public ArrayList<Training> selectList(SqlSessionTemplate sqlSession, PageInfo pi) {
		
		int limit = pi.getBoardLimit();
		int offset = (pi.getCurrentPage()-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		return (ArrayList)sqlSession.selectList("trainingMapper.selectList", null, rowBounds);
	}
/*
	public int selectTrainingNo(SqlSessionTemplate sqlSession) {
		int trainingNo = 0;
		return trainingNo;
	}

	public int insertAttachment(SqlSessionTemplate sqlSession, Attachment at, int trainingNo) {

		int result = 0;
		return result;
	}
*/
	public Training selectTraining(SqlSessionTemplate sqlSession, int trainingNo) {
		return sqlSession.selectOne("trainingMapper.selectTraining",trainingNo);
	}
/*
	public Attachment selectAttachment(SqlSessionTemplate sqlSession, int trainingNo) {
		Attachment at = null;
		return at;
	}

	public int updateTraining(SqlSessionTemplate sqlSession, Training t) {
		int result = 0;
		return result;
	}

	public int updateAttachment(SqlSessionTemplate sqlSession, Attachment at) {
		int result = 0;
		return result;
	}

	public int deleteTraining(SqlSessionTemplate sqlSession, int trainingNo) {
		int result = 0;
		return result;
	}

	public int insertReply(SqlSessionTemplate sqlSession, Reply r) {
		int result = 0;
		return result;
	}

	public ArrayList<Reply> selectReplyList(SqlSessionTemplate sqlSession, int reftrainingNo) {
		ArrayList<Reply> list = new ArrayList<>();
		return list;
	}

	public int deleteReply(SqlSessionTemplate sqlSession, Reply r) {
		int result = 0;
		return result;
	}

	public int updateReply(SqlSessionTemplate sqlSession, String originReply, String changeReply, int reftrainingNo, String replyWriter) {
		int result = 0;
		return result;
	}

	public int updateLikes(SqlSessionTemplate sqlSession, int trainingNo) {
		int result = 0;
		return result;
	}

	public int selectLikes(SqlSessionTemplate sqlSession, int trainingNo) {
		int likes = 0;
		return likes;
	}


	public Shoes selectShoes(SqlSessionTemplate sqlSession, int trainingNo) {
		Shoes s = null;
		return s;
	}

	public ArrayList<Training> searchByTitle(SqlSessionTemplate sqlSession, PageInfo pi, String keyword) {
		ArrayList<Training> searchList = new ArrayList<>();
		return searchList;
	}

	public ArrayList<Training> searchByCategory(SqlSessionTemplate sqlSession, PageInfo pi, String keyword) {
		ArrayList<Training> searchList = new ArrayList<>();
		return searchList;
	}

	public ArrayList<Training> searchByContent(SqlSessionTemplate sqlSession, PageInfo pi, String keyword) {
		ArrayList<Training> searchList = new ArrayList<>();
		return searchList;
	}
*/
}
