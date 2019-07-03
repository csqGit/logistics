package com.ldxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.NewMapper;
import com.ldxy.entity.New;
import com.ldxy.entity.PageData;
import com.ldxy.service.NewService;

@Service
public class NewServiceImpl implements NewService{
	
	@Autowired
	private NewMapper newMapper;

	public List<New> selectNewList(PageData pageData) {
		try {
			return newMapper.selectByExample(null);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
