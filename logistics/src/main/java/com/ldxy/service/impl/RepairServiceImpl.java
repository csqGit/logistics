package com.ldxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldxy.dao.RepairMapper;
import com.ldxy.entity.PageData;
import com.ldxy.entity.Repair;
import com.ldxy.entity.RepairExample;
import com.ldxy.service.RepairService;

@Service
public class RepairServiceImpl implements RepairService {
	
	@Autowired
	private RepairMapper repairMapper;

	public int insertRepair(Repair repair) {
		try {
			int result = repairMapper.insert(repair);
			return result;
		} catch (Exception e) {
			return 0;
		}
	}

	public List<Repair> selectRepairList(PageData pageData, String repairName) {
		List<Repair> repairList = null;
			try {
				//管理员查看全部
				if(repairName == null || !"".equals(repairName)) {
					repairList = repairMapper.selectByExample(null);
					return repairList;
				}else {//学生自己查询自己的保修信息
					RepairExample example = new RepairExample();
					example.createCriteria().andRepairNameEqualTo(repairName);
					repairList = repairMapper.selectByExample(example);
					return repairList;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	}


	public int deleteRepairById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateRepair(Repair repair) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
