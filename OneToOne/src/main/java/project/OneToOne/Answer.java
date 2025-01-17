package project.OneToOne;

import javax.persistence.*;

@Entity
public class Answer {
	@Id
	int answerId;
	String answer;
	
	//@OneToOne(mappedBy="ans")
	//@JoinColumn(name="quest")
	@ManyToOne
	Question question;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
