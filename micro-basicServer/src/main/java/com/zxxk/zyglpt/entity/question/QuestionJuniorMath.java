package com.zxxk.zyglpt.entity.question;

import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorMath;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorMath;

/**
 * 初中数学
 * 
 * @author yangqijie
 * @time 2016年9月13日 下午2:29:33
 */
@Entity
public class QuestionJuniorMath  extends Question<QuestionOptionJuniorMath,QuestionAnswerJuniorMath,QuestionJuniorMath> {

}
