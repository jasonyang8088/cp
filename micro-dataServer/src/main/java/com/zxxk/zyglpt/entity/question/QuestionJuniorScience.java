package com.zxxk.zyglpt.entity.question;


import javax.persistence.Entity;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.questionanswer.QuestionAnswerJuniorScience;
import com.zxxk.zyglpt.entity.questionoption.QuestionOptionJuniorScience;

/***
 * 初中科学
 */
@Entity
public class QuestionJuniorScience extends Question<QuestionOptionJuniorScience,QuestionAnswerJuniorScience,QuestionJuniorScience> {


}
