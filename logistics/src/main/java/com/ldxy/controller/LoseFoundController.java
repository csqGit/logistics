package com.ldxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ldxy.entity.LoseFound;
import com.ldxy.entity.PageData;
import com.ldxy.entity.RequestResult;
import com.ldxy.service.LoseFoundService;

/**
 * 失物招领controller
 * 
 * @author bozpower
 *
 */
@Controller
public class LoseFoundController {

	@Autowired
	private LoseFoundService loseFoundService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/selectLoseFoundList")
	@ResponseBody
	public ModelAndView selectLoseFoundList(PageData pageData) {
		 ModelAndView mav = new ModelAndView();
		 RequestResult rr = new RequestResult();
		 mav.setViewName("/page/swzl.jsp");
		List<LoseFound> loseFoundList = loseFoundService.selectLoseFoundList(pageData);
		if(loseFoundList == null) {
			rr.setCode(200);
			rr.setResult("暂无数据");
			mav.addObject("loseFoundList", rr);
			return mav;
		}else {
			rr.setCode(100);
			
			rr.setResult(loseFoundList);
			
			mav.addObject("loseFoundList", rr);
			return mav;
		}
	}
}
