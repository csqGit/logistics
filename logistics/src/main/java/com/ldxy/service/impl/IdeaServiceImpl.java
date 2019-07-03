package com.ldxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.IdeaMapper;
import com.ldxy.entity.Idea;
import com.ldxy.entity.IdeaExample;
import com.ldxy.entity.PageData;
import com.ldxy.service.IdeaService;

@Service
public class IdeaServiceImpl implements IdeaService {
	
	@Autowired
	private IdeaMapper ideaMapper;

	public List<Idea> selectIdeaList(PageData pageData) {
		IdeaExample example = new IdeaExample();
		return ideaMapper.selectByExample(example);
	}

	public int deleteIdea(int id) {
		try {
			return ideaMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int insertIdea(Idea idea) {
		try {
			return ideaMapper.insert(idea);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
