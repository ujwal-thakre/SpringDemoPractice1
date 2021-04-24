package com.demo.beans;

import java.util.List;
import java.util.Map;

public class Question {

	private int questionId;
	private String question;
	private List<Answer> answers;
	private Map<String, String> difficultyLevel;
	Map<Professor, Department> setBy;
	
	

	/*public Question() {
		// TODO Auto-generated constructor stub
	}*/

	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

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

	public Map<String, String> getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(Map<String, String> difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers
				+ ", difficultyLevel=" + difficultyLevel + ", setBy=" + setBy + "]";
	}

	public Map<Professor, Department> getSetBy() {
		return setBy;
	}

	public void setSetBy(Map<Professor, Department> setBy) {
		this.setBy = setBy;
	}

}
