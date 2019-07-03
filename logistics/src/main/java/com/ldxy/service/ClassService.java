package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.Classes;
import com.ldxy.entity.PageData;

public interface ClassService {

	public int insertApplyClass(Classes classes);
	
	public List<Classes> selectClassesList(PageData pageData);
	
	
}
