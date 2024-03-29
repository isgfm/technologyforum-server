package com.guo.technologyforum.dao.mapper.generateMapper;

import com.guo.technologyforum.dao.entity.Role_right;
import com.guo.technologyforum.dao.entity.Role_rightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface Role_rightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    long countByExample(Role_rightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int deleteByExample(Role_rightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer nId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int insert(Role_right record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int insertSelective(Role_right record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    List<Role_right> selectByExampleWithRowbounds(Role_rightExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    List<Role_right> selectByExample(Role_rightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    Role_right selectByPrimaryKey(Integer nId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Role_right record, @Param("example") Role_rightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Role_right record, @Param("example") Role_rightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Role_right record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Role_right record);
}