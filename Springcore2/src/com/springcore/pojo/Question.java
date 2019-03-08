package com.springcore.pojo;

import java.util.List;

public class Question {
private int questionId;
private String question;

private List<Answer> answers;

public int getQuestionId() {
	return questionId;
}

public void setQuestionId(int questionId) {
	this.questionId = questionId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public List<Answer> getAnswers() {
	return answers;
}

public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}
public void display()
{
	System.out.println(getQuestionId()+" "+getQuestion());
	for(Answer ans : answers)
	{
		System.out.println(ans.getAnswers());
	}
}


}
