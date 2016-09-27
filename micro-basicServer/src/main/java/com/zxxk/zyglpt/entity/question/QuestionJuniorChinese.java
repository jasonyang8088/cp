package com.zxxk.zyglpt.entity.question;

import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorChinese;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorChinese;

/**
 * 初中语文
 * 
 * @author yangqijie
 * @time 2016年9月12日 上午9:33:37
 */
@Entity
public class QuestionJuniorChinese  extends Question<QuestionOptionJuniorChinese,QuestionAnswerJuniorChinese,QuestionJuniorChinese> {
	
}
