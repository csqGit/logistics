package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.LoseFound;
import com.ldxy.entity.PageData;

/**
 * 失物招领
 * @author bozpower
 *
 */
public interface LoseFoundService {

	/**
	 * 新增丢失物品的信息
	 * @param loseFound
	 * @return
	 */
	public int insertLoseFound (LoseFound loseFound);
	
	/**
	 * 查询全部
	 * @param pageData
	 * @return
	 */
	public List<LoseFound> selectLoseFoundList(PageData pageData);
	
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public int deleteLoseFound(int id);
	
	/**
	 * 更新失物信息
	 * @param loseFound
	 * @return
	 */
	public int updateLoseFound(LoseFound loseFound);
	
}
