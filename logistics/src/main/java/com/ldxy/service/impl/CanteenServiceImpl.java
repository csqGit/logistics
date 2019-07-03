package com.ldxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.CanteenMapper;
import com.ldxy.entity.Canteen;
import com.ldxy.entity.CanteenExample;
import com.ldxy.entity.PageData;
import com.ldxy.service.CanteenService;

@Service
public class CanteenServiceImpl implements CanteenService {
	
	@Autowired
	private CanteenMapper canteenMapper;

	public List<Canteen> selectCanteenList(PageData pageData) {
		try {
			return canteenMapper.selectByExample(null);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Canteen> selectCanteenList(String tsTime) {
		try {
			CanteenExample example = new CanteenExample();
			example.createCriteria().andTsTimeEqualTo(tsTime);
			List<Canteen> canteenList = canteenMapper.selectByExample(example);
			return canteenList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int insertCanteen(Canteen canteen) {
		try {
			return canteenMapper.insert(canteen);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int deleteCanteen(int id) {
		try {
			return canteenMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
