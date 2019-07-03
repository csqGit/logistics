package com.ldxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ldxy.entity.New;
import com.ldxy.entity.PageData;
import com.ldxy.entity.RequestResult;
import com.ldxy.service.NewService;

@Controller
public class NewController {
	
	@Autowired
	private NewService newService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/selectNewList")
	public ModelAndView selectNewList(PageData pageData) {
		 ModelAndView mav = new ModelAndView();
		 RequestResult rr = new RequestResult();
		 mav.setViewName("/page/new.jsp");
		List<New> newList = newService.selectNewList(pageData);
		if(newList == null) {
			rr.setCode(200);
			rr.setResult("暂无数据");
			mav.addObject("newList", rr);
			return mav;
		}else {
			rr.setCode(100);
			rr.setResult(newList);
			
			mav.addObject("newList", rr);
			return mav;
		}
	}

}
