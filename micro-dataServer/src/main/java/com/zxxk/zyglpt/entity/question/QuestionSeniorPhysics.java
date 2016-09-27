package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorPhysics;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorPhysics;


/***
 * 高中物理
 */
@Entity
public class QuestionSeniorPhysics extends Question<QuestionOptionSeniorPhysics,QuestionAnswerSeniorPhysics,QuestionSeniorPhysics> {
	
}
