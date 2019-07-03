package com.ldxy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ldxy.entity.Classes;
import com.ldxy.entity.PageData;
import com.ldxy.service.ClassService;

/**
 * 教室controller
 * @author bozpower
 *
 */
@Controller
public class ClassController {
	
	@Autowired
	private ClassService classService;
	
	@RequestMapping("/applyClass")
	public String applyClass(HttpServletRequest request, Classes classes) {
		int id = classService.insertApplyClass(classes);
		if(id == 1) {
			request.setAttribute("code", "100");
		}else {
			request.setAttribute("code", "200");
		}
		return "/page/class.jsp";
	}
	
	@RequestMapping("/selectApplyClass")
	public ModelAndView selectApplyClass(PageData pageData) {
		ModelAndView mav = new ModelAndView();
		List<Classes> classList = classService.selectClassesList(pageData);
		if(classList.size() > 0) {
			mav.addObject("classList", classList);
		}else {
			mav.addObject("classList", "无");
		}
		mav.setViewName("/page/show_class.jsp");
		return mav;
	}
	
}
