package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorHistory;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorHistory;


/***
 * 初中历史
 */
@Entity
public class QuestionJuniorHistory extends Question<QuestionOptionJuniorHistory,QuestionAnswerJuniorHistory,QuestionJuniorHistory> {
	

	
}
