package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorChemistry;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorChemistry;


/***
 * 初中化学
 */
@Entity
public class QuestionJuniorChemistry extends Question<QuestionOptionJuniorChemistry,QuestionAnswerJuniorChemistry,QuestionJuniorChemistry> {
	

}
