package springjdbc.spring;

import org.springframework.jdbc.core.JdbcTemplate;

public class Edao {

	private JdbcTemplate jdbcTemplate;

	
	
	public Edao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int saveEmp( Employee emp) {
		String query="insert into employee values('" + emp.getId() + "','" +emp.getFname() +"','" +emp.getLname() +"','" +emp.getAddress() +"','" + emp.getSalary() + "') ";
		return jdbcTemplate.update(query);
		
		
	}
	
	
}
