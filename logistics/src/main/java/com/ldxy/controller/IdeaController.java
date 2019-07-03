package com.ldxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldxy.entity.Canteen;
import com.ldxy.entity.Idea;
import com.ldxy.entity.PageData;
import com.ldxy.entity.RequestResult;
import com.ldxy.service.IdeaService;
import com.ldxy.utils.TokenProccessor;

/**
 * 网络调查controller
 * @author bozpower
 *
 */
@Controller
public class IdeaController {
	
	@Autowired
	private IdeaService ideaService;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/selectIdeaList")
	@ResponseBody
	public RequestResult selectIdeaList(PageData pageData) {
		RequestResult rr = new RequestResult();
		try {
			rr.setCode(100);
			rr.setResult(ideaService.selectIdeaList(pageData));
			return rr;
		} catch (Exception e) {
			e.printStackTrace();
			rr.setCode(200);
			return rr;
		}
	}
	
	
	@RequestMapping("/insertIdea")
	public String insertIdea(HttpServletRequest request, String token, Idea idea) {
		boolean flag = TokenProccessor.isRepeatSubmit(request, token);
		if(flag) {
			request.setAttribute("msg", "300");
			return "/page/idea_add.jsp";
		}else {
			int result = ideaService.insertIdea(idea);
			if(result == 1) {
				request.setAttribute("msg", "100");
			}else {
				request.setAttribute("msg", "200");
			}
			request.getSession().removeAttribute("token");//移除session中的token
			return "/page/idea_add.jsp";
		}
	
	}
	
	@RequestMapping("/deleteIdea")
	public String deleteIdea(HttpServletRequest request, int id) {
		int result = ideaService.deleteIdea(id);
		if(result == 1) {
			request.setAttribute("msg", "删除成功！");
		}else {
			request.setAttribute("msg", "删除失败！");
		}
		return "/page/del_idea.jsp";
	}
	
	
	
	
	
	@RequestMapping("/doIdeaFormServlet")
	public String doIdeaFormServlet(HttpServletRequest request) {
		String token = TokenProccessor.getInstance().makeToken();//创建一个token令牌
		System.out.println("在表单中生成的令牌token为：" + token);
		request.getSession().setAttribute("token", token);
		return "/page/idea_add.jsp";
		
	}
	
	

}
