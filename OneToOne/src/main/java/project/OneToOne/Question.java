package project.OneToOne;

import java.util.List;

import javax.persistence.*;

@Entity
public class Question {
	@Id
	int questionId;
	String question;
	
	//@OneToOne(cascade =CascadeType.ALL)
	//@JoinColumn(name="ans")
	
//	public Answer ans;
	@OneToMany(mappedBy = "question",cascade=CascadeType.ALL)
	
	List<Answer> ans;

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

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
}