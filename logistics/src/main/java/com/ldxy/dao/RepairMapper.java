package com.ldxy.dao;

import com.ldxy.entity.Repair;
import com.ldxy.entity.RepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    long countByExample(RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int deleteByExample(RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int insert(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int insertSelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    List<Repair> selectByExample(RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    Repair selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int updateByPrimaryKeySelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_tb
     *
     * @mbg.generated Thu Apr 18 16:34:27 CST 2019
     */
    int updateByPrimaryKey(Repair record);
}