package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.PageData;
import com.ldxy.entity.Repair;

public interface RepairService {
	
	/**
	 * 新增保修信息
	 * @param repair
	 * @return
	 */
	public int insertRepair(Repair repair);
	
	/**
	 * 查询保修信息
	 * @param pageData
	 * @return
	 */
	public List<Repair> selectRepairList(PageData pageData, String repairName);
	
	
	/**
	 * 删除保修信息
	 * @param id
	 * @return
	 */
	public int deleteRepairById(int id);
	
	
	/**
	 * 修改保修信息
	 * @param repair
	 * @return
	 */
	public int updateRepair(Repair repair);
	

}
