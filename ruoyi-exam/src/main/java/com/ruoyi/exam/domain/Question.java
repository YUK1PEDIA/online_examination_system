package com.ruoyi.exam.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 试题列表对象 t_question
 * 
 * @author group
 * @date 2024-07-09
 */
public class Question extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题目ID */
    @Excel(name = "题目ID")
    private Long id;

    /** 题型 */
    @Excel(name = "题型")
    private Long questionType;

    /** 学科 */
    @Excel(name = "学科")
    private Long subjectId;

    /** 分值 */
    @Excel(name = "分值")
    private Long score;

    /** 答案 */
    private String correct;

    /** 题干 */
    @Excel(name = "题干")
    private String content;

    /** 选项 */
    @Excel(name = "选项")
    private String options;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setQuestionType(Long questionType) 
    {
        this.questionType = questionType;
    }

    public Long getQuestionType() 
    {
        return questionType;
    }
    public void setSubjectId(Long subjectId) 
    {
        this.subjectId = subjectId;
    }

    public Long getSubjectId() 
    {
        return subjectId;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setCorrect(String correct) 
    {
        this.correct = correct;
    }

    public String getCorrect() 
    {
        return correct;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setOptions(String options) 
    {
        this.options = options;
    }

    public String getOptions() 
    {
        return options;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("questionType", getQuestionType())
            .append("subjectId", getSubjectId())
            .append("score", getScore())
            .append("correct", getCorrect())
            .append("content", getContent())
            .append("options", getOptions())
            .append("image", getImage())
            .toString();
    }
}
