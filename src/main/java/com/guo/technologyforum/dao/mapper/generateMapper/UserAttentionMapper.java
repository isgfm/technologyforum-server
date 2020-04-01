package com.guo.technologyforum.dao.mapper.generateMapper;

import com.guo.technologyforum.dao.entity.UserAttention;
import com.guo.technologyforum.dao.entity.UserAttentionExample;
import com.guo.technologyforum.dao.entity.UserAttentionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAttentionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    long countByExample(UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int deleteByExample(UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(UserAttentionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int insert(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int insertSelective(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    List<UserAttention> selectByExampleWithRowbounds(UserAttentionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    List<UserAttention> selectByExample(UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    UserAttention selectByPrimaryKey(UserAttentionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserAttention record, @Param("example") UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserAttention record, @Param("example") UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_attention
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserAttention record);
}