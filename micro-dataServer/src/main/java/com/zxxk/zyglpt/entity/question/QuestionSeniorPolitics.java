package com.zxxk.zyglpt.entity.question;

import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorPolitics;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorPolitics;


/***
 * 高中政治
 */
@Entity
public class QuestionSeniorPolitics extends Question<QuestionOptionSeniorPolitics,QuestionAnswerSeniorPolitics,QuestionSeniorPolitics> {


}
