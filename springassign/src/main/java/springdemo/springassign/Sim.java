package springdemo.springassign;

public class Sim {

	String cardNo;

	public Sim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sim(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "Sim [cardNo=" + cardNo + "]";
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
