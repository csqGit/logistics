package com.ldxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.ComplainMapper;
import com.ldxy.entity.Complain;
import com.ldxy.entity.PageData;
import com.ldxy.service.ComplainService;

@Service
public class ComplainServiceImpl implements ComplainService {
	
	@Autowired
	private ComplainMapper complainMapper;

	public List<Complain> selectCanteenList(PageData pageData) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Complain> selectComplainList(String tsTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertComplain(Complain complain) {
		try {
			return complainMapper.insert(complain);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int deleteComplain(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
