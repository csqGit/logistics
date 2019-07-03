package com.ldxy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.ClassesMapper;
import com.ldxy.entity.Classes;
import com.ldxy.entity.PageData;
import com.ldxy.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService{
	
	@Autowired
	private ClassesMapper classesMapper;

	public int insertApplyClass(Classes classes) {
		try {
			return classesMapper.insert(classes);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public List<Classes> selectClassesList(PageData pageData) {
		try {
			return classesMapper.selectByExample(null);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Classes>();
		}
	}

}
