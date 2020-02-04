package com.guo.technologyforum.dao.mapper.generateMapper;

import com.guo.technologyforum.dao.entity.Keep;
import com.guo.technologyforum.dao.entity.KeepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface KeepMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    long countByExample(KeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int deleteByExample(KeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long nId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int insert(Keep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int insertSelective(Keep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    List<Keep> selectByExampleWithRowbounds(KeepExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    List<Keep> selectByExample(KeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    Keep selectByPrimaryKey(Long nId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Keep record, @Param("example") KeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Keep record, @Param("example") KeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Keep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Keep record);
}