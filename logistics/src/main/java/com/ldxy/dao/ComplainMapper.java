package com.ldxy.dao;

import com.ldxy.entity.Complain;
import com.ldxy.entity.ComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    long countByExample(ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int deleteByExample(ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int insert(Complain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int insertSelective(Complain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    List<Complain> selectByExample(ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    Complain selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int updateByPrimaryKeySelective(Complain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    int updateByPrimaryKey(Complain record);
}