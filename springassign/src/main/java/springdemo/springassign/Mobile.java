package springdemo.springassign;

import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile {

	String mobile_name;
	String model;
	 Sim sim;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String mobile_name, String model, Sim sim) {
		super();
		this.mobile_name = mobile_name;
		this.model = model;
		this.sim = sim;
	}
	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [mobile_name=" + mobile_name + ", model=" + model + ", sim=" + sim + "]";
	}
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	 
}
