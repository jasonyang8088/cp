package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorEnglish;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorEnglish;

/**
 * 初中英语
 * 
 * @author yangqijie
 * @time 2016年9月13日 下午5:24:33
 */
@Entity
public class QuestionJuniorEnglish extends Question<QuestionOptionJuniorEnglish,QuestionAnswerJuniorEnglish,QuestionJuniorEnglish> {
	
}
