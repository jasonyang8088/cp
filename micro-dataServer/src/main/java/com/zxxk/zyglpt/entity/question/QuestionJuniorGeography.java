package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorGeography;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorGeography;


/***
 * 初中地理
 */
@Entity
public class QuestionJuniorGeography extends Question<QuestionOptionJuniorGeography,QuestionAnswerJuniorGeography,QuestionJuniorGeography> {
	

}
