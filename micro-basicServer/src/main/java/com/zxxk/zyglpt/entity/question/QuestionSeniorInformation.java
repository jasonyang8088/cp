package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorInformation;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorInformation;


/***
 * 高中信息技术
 */
@Entity
public class QuestionSeniorInformation extends Question<QuestionOptionSeniorInformation,QuestionAnswerSeniorInformation,QuestionSeniorInformation> {


}
