package com.ldxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ldxy.entity.Complain;
import com.ldxy.service.ComplainService;
import com.ldxy.utils.TokenProccessor;

/**
 * 投诉controller
 * @author bozpower
 *
 */
@Controller
public class ComplainController {
	
	@Autowired
	private ComplainService complainService;
	
	/**
	 * 新增投诉信息
	 * @param request
	 * @param token
	 * @param complain
	 * @return
	 */
	@RequestMapping("/complain")
	public String complain(HttpServletRequest request,String token, Complain complain) {
		boolean flag = TokenProccessor.isRepeatSubmit(request, token);
		if(flag) {
			request.setAttribute("msg", "300");
			return "/page/complain.jsp";
		}else {
			int result = complainService.insertComplain(complain);
			if(result == 1) {
				request.setAttribute("msg", "100");
			}else {
				request.setAttribute("msg", "200");
			}
			request.getSession().removeAttribute("token");//移除session中的token
			return "/page/complain.jsp";
		}
	}
	
	@RequestMapping("/doComplainFormServlet")
	public String doComplainFormServlet(HttpServletRequest request) {
		String token = TokenProccessor.getInstance().makeToken();
		request.getSession().setAttribute("token", token);
		return "/page/complain.jsp";
	}
	
	
	

}
