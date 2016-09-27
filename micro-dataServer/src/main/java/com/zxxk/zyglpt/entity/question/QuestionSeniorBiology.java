package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorBiology;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorBiology;

/***
 * 高中生物
 */
@Entity
public class QuestionSeniorBiology extends Question<QuestionOptionSeniorBiology,QuestionAnswerSeniorBiology,QuestionSeniorBiology> {


}