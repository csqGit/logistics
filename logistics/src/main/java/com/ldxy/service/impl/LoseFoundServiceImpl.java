package com.ldxy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.LoseFoundMapper;
import com.ldxy.entity.LoseFound;
import com.ldxy.entity.PageData;
import com.ldxy.service.LoseFoundService;

@Service
public class LoseFoundServiceImpl implements LoseFoundService {

	@Autowired
	private LoseFoundMapper loseFoundMapper;
	
	public int insertLoseFound(LoseFound loseFound) {
		try {
			loseFoundMapper.insert(loseFound);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<LoseFound> selectLoseFoundList(PageData pageData) {
		try {
			return loseFoundMapper.selectByExample(null);
		} catch (Exception e) {
			e.printStackTrace();
			List list = new ArrayList();
			return list;
		}
	}

	public int deleteLoseFound(int id) {
		try {
			loseFoundMapper.deleteByPrimaryKey(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int updateLoseFound(LoseFound loseFound) {
		try {
			loseFoundMapper.updateByPrimaryKeySelective(loseFound);
			return 1;
		} catch (Exception e) {
			e.getLocalizedMessage();
			return 0;
		}
	}

}
