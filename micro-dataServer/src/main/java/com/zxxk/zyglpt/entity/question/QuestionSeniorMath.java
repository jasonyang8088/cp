package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorMath;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorMath;


/***
 * 高中数学
 */
@Entity
public class QuestionSeniorMath extends Question<QuestionOptionSeniorMath,QuestionAnswerSeniorMath,QuestionSeniorMath> {


}
