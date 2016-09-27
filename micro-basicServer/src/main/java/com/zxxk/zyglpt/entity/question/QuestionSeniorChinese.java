package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorChinese;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorChinese;


/***
 * 高中语文
 */
@Entity
public class QuestionSeniorChinese extends Question<QuestionOptionSeniorChinese,QuestionAnswerSeniorChinese,QuestionSeniorChinese> {

}
