package com.ldxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ldxy.entity.PageData;
import com.ldxy.entity.Repair;
import com.ldxy.service.RepairService;

/**
 * 保修类
 * @author bozpower
 *
 */
@Controller
public class RepairController {
	
	@Autowired
	private RepairService repairService;

	@RequestMapping("/insertRepair")
	public ModelAndView insertRepair(Repair repair) {
		ModelAndView mav = new ModelAndView();
		int result = repairService.insertRepair(repair);
		mav.setViewName("/page/hqgzbx.jsp");
		if(result == 1) {
			mav.addObject("msg", "报修成功，请注意接听电话！");
		}else {
			mav.addObject("msg", "报修提交失败！");
		}
		return mav;
	}
	
	
	@RequestMapping("/selectRepairList")
	@ResponseBody
	public Map<String, Object> selectRepairList(PageData pageData, String repairName) {
		List<Repair> repairList = repairService.selectRepairList(pageData, repairName);
		Map<String, Object> map = new HashMap<String, Object>();
		if(repairList != null) {
			map.put("code", 100);
			map.put("msg", "有数据");
			map.put("repairList", repairList);
			return map;
		}else {
			map.put("code", 200);
			map.put("msg", "暂无数据");
			map.put("repairList", repairList);
			return map;
		}
	}
}
