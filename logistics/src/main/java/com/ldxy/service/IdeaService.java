package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.Idea;
import com.ldxy.entity.PageData;

public interface IdeaService {
	/**
	 * 查询调查信息
	 * @param pageData
	 * @return
	 */
	public List<Idea> selectIdeaList(PageData pageData);
	
	/**
	 * 删除建议信息
	 * @param id
	 * @return
	 */
	public int deleteIdea(int id);
	
	/**
	 * 新增建议信息
	 * @param idea
	 * @return
	 */
	public int insertIdea(Idea idea);

}
