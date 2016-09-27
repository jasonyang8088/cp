package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorGeography;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorGeography;


/***
 * 高中地理
 */
@Entity
public class QuestionSeniorGeography extends Question<QuestionOptionSeniorGeography,QuestionAnswerSeniorGeography,QuestionSeniorGeography> {
	

}
