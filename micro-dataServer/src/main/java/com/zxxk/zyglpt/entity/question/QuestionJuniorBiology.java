package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorBiology;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorBiology;

/***
 * 初中生物
 */
@Entity
public class QuestionJuniorBiology extends Question<QuestionOptionJuniorBiology,QuestionAnswerJuniorBiology,QuestionJuniorBiology>  {
	
}
