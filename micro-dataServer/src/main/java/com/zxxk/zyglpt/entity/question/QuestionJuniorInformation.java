package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorInformation;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorInformation;


/***
 * 初中信息技术
 */
@Entity
public class QuestionJuniorInformation extends Question<QuestionOptionJuniorInformation,QuestionAnswerJuniorInformation,QuestionJuniorInformation> {


}
