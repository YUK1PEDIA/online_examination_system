package com.ruoyi.exam.service;

import java.util.List;
import com.ruoyi.exam.domain.Question;

/**
 * 试题列表Service接口
 * 
 * @author group
 * @date 2024-07-09
 */
public interface IQuestionService 
{
    /**
     * 查询试题列表
     * 
     * @param id 试题列表主键
     * @return 试题列表
     */
    public Question selectQuestionById(Long id);

    /**
     * 查询试题列表列表
     * 
     * @param question 试题列表
     * @return 试题列表集合
     */
    public List<Question> selectQuestionList(Question question);

    /**
     * 新增试题列表
     * 
     * @param question 试题列表
     * @return 结果
     */
    public int insertQuestion(Question question);

    /**
     * 修改试题列表
     * 
     * @param question 试题列表
     * @return 结果
     */
    public int updateQuestion(Question question);

    /**
     * 批量删除试题列表
     * 
     * @param ids 需要删除的试题列表主键集合
     * @return 结果
     */
    public int deleteQuestionByIds(Long[] ids);

    /**
     * 删除试题列表信息
     * 
     * @param id 试题列表主键
     * @return 结果
     */
    public int deleteQuestionById(Long id);
}
