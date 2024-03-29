package com.guo.technologyforum.dao.mapper.generateMapper;

import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.ThemeReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    long countByExample(ThemeReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int deleteByExample(ThemeReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long nId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int insert(ThemeReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int insertSelective(ThemeReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    List<ThemeReply> selectByExampleWithRowbounds(ThemeReplyExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    List<ThemeReply> selectByExample(ThemeReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    ThemeReply selectByPrimaryKey(Long nId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ThemeReply record, @Param("example") ThemeReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ThemeReply record, @Param("example") ThemeReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ThemeReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme_reply
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThemeReply record);
}