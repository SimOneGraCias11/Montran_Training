package springdemo.spring;

import java.util.List;
import java.util.Map;

public class country {

	int id;
	String name;
	String capital;
	List<String> states ;
	
	Map<String,Integer>President;
	public country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public country(int id, String name, String capital, Map<String, Integer> president, List<String> states) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		President = president;
		this.states = states;
	}
	@Override
	public String toString() {
		return "country [id=" + id + ", name=" + name + ", capital=" + capital + ", President=" + President
				+ ", states=" + states + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Map<String, Integer> getPresident() {
		return President;
	}
	public void setPresident(Map<String, Integer> president) {
		President = president;
	}
	public List<String> getStates() {
		return states;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}


}
