package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.New;
import com.ldxy.entity.PageData;

public interface NewService {

	public List<New> selectNewList(PageData pageData);
	
	
} 
