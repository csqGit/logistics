package com.ldxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ldxy.entity.Canteen;
import com.ldxy.entity.PageData;
import com.ldxy.service.CanteenService;
import com.ldxy.utils.TokenProccessor;

/**
 * 食堂投诉controller
 * @author bozpower
 *
 */
@Controller
public class CanteenController {
	
	@Autowired
	private CanteenService canteenService;
	
	/**
	 * 查询投诉信息
	 * @param pageData
	 * @return
	 */
	@RequestMapping("/selectCanteenList")
	public ModelAndView selectCanteenList(PageData pageData) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("canteenList", canteenService.selectCanteenList(pageData));
		mav.setViewName("/page/canteen.jsp");
		return mav;
	}
	
	@RequestMapping("/tsCanteen")
	public String tsCanteen(HttpServletRequest request, String token, Canteen canteen) {
		boolean flag = TokenProccessor.isRepeatSubmit(request, token);
		if(flag) {
			request.setAttribute("msg", "300");
			return "/page/canteen_ts.jsp";
		}else {
			int result = canteenService.insertCanteen(canteen);
			if(result == 1) {
				request.setAttribute("msg", "100");
			}else {
				request.setAttribute("msg", "200");
			}
			request.getSession().removeAttribute("token");//移除session中的token
			return "/page/canteen_ts.jsp";
		}
		
	}
	
	/**
	 * 校验客户端提交上来的token与服务器段生成的是否一致
	 * @param request
	 * @return
	 * true 重复提交了表单
	 * false 没有重复提交表单
	 */
	/*private boolean isRepeatSubmit(HttpServletRequest req, String token) {
		String client_token = token;
		//如果没有token，则重复提交了表单
		if(client_token == null) {
			return true;
		}
		
		//取出存储在session中的token令牌
		String server_token = (String) req.getSession().getAttribute("token");
		//如果当前用户的session中不存在token令牌，则重复提交了表单
		if(server_token == null) {
			return true;
		}
		//存储在session中的token令牌与表单提交的不同，用户重复提交了表单
		if(!client_token.equals(server_token)) {
			return true;
		}
		
		return false;
	}*/
	
	@RequestMapping("/doCanteenFormServlet")
	public String doCanteenFormServlet(HttpServletRequest request) {
		String token = TokenProccessor.getInstance().makeToken();//创建一个token令牌
		System.out.println("在表单中生成的令牌token为：" + token);
		request.getSession().setAttribute("token", token);
		return "/page/canteen_ts.jsp";
		
	}

}
