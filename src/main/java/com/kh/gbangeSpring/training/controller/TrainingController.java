package com.kh.gbangeSpring.training.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.gbangeSpring.common.Template.Pagination;
import com.kh.gbangeSpring.common.model.vo.PageInfo;
import com.kh.gbangeSpring.common.model.vo.Shoes;
import com.kh.gbangeSpring.training.model.service.TrainingService;
import com.kh.gbangeSpring.training.model.vo.Attachment;
import com.kh.gbangeSpring.training.model.vo.Training;
import com.kh.gbangeSpring.training.model.vo.TrainingCategory;


@Controller
public class TrainingController {
	
	@Autowired
	private TrainingService trainingService;
	
	@GetMapping("insert.tr")
	public ModelAndView insertTrainingForm(ModelAndView mv) {
		
		ArrayList<TrainingCategory> tCList = trainingService.selectCategoryList();
		ArrayList<Shoes>sList = trainingService.selectShoesList();
		mv.addObject("", tCList);
		mv.addObject("sList", sList);
		mv.setViewName("training/trainingDetailView");
		return mv;
	}
	
	@PostMapping("insert.tr")
	public String insertTraining(Training training,Attachment attachment
								,MultipartFile uploadImg
								,HttpSession session) {
		HashMap<Training,Attachment> map = new HashMap<Training,Attachment>();
		map.put(training, attachment);
		
		if(!uploadImg.getOriginalFilename().equals("")) {
			String originName = uploadImg.getOriginalFilename();
			String currentTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			String ext = originName.substring(originName.lastIndexOf("."));
			int ranNum = (int)(Math.random()*90000+10000);
			String changeName = "러닝일지"+currentTime+ranNum+ext;
			String savePath = session.getServletContext().getRealPath("/resources/trainingImg/");
			try {
				uploadImg.transferTo(new File(savePath+changeName));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			attachment.setOriginName(originName);
			attachment.setChangeName("/resources/trainingImg/"+changeName);
		}
		int result = trainingService.insertTraining(map);
		if(result>0) {
			session.setAttribute("alertMsg", "일지 작성 성공!");
			return "/detail.tr?tno="+training.getTrainingNo();
		}else {
			session.setAttribute("alertMsg", "일지 작성 실패ㅠㅠ");
			return "/list.tr?currentPage=1";
			
		}
		
	}
	
	@RequestMapping("list.tr")
	public String trainingList(int currentPage
							,Model model) {
		int listCount = trainingService.listCount();
		int pageLimit = 10;
		int boardLimit = 5;
		
		PageInfo pi = Pagination.getPageInfo(listCount, currentPage, pageLimit, boardLimit);
		
		ArrayList<Training> list = trainingService.selectList(pi);
		model.addAttribute("pi", pi);
		model.addAttribute("list", list);
		
		return "training/trainingListView";
	}
	
	@RequestMapping("detail.tr")
	public ModelAndView selectTraining(int trainingNo
								,ModelAndView mv) {
		int result = trainingService.increaseCount(trainingNo);
		if(result>0) {
			Training t = trainingService.selectTraining(trainingNo);
			mv.addObject("training", t).setViewName("training/trainingDetailView");
		}else {
			mv.addObject("alertMsg", "일지 조회 실패ㅠㅠ").setViewName("/");
		}
		return mv;
	}
}
