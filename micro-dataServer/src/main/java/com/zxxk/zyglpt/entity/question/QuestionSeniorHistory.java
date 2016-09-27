package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorHistory;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorHistory;


/***
 * 高中历史
 */
@Entity
public class QuestionSeniorHistory extends Question<QuestionOptionSeniorHistory,QuestionAnswerSeniorHistory,QuestionSeniorHistory> {
	

}