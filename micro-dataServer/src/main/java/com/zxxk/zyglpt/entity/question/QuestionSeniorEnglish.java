package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerSeniorEnglish;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionSeniorEnglish;

/***
 * 高中英语
 */
@Entity
public class QuestionSeniorEnglish extends Question<QuestionOptionSeniorEnglish,QuestionAnswerSeniorEnglish,QuestionSeniorEnglish> {
	

}
