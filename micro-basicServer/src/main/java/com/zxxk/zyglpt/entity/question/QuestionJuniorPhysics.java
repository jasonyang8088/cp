package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorPhysics;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorPhysics;


/***
 * 初中物理
 */
@Entity
public class QuestionJuniorPhysics extends Question<QuestionOptionJuniorPhysics,QuestionAnswerJuniorPhysics,QuestionJuniorPhysics> {
	
}
