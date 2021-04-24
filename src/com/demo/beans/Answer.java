package com.demo.beans;

public class Answer {
	
	private int id;
	private String answer;
	private String answeredBy;
	public Answer(int id, String answer, String answeredBy) {
		super();
		this.id = id;
		this.answer = answer;
		this.answeredBy = answeredBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnsweredBy() {
		return answeredBy;
	}
	public void setAnsweredBy(String answeredBy) {
		this.answeredBy = answeredBy;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", answeredBy=" + answeredBy + "]";
	}

}
