package day3;

class server{
	String port;
	public server(String port) {
	this.port=port;
	}
	
	public void connectserver(String IP,String port) {
		
		System.out.println("connecting to server at: "+IP+":"+port);
	
	}
	
		static class Ipaddress{
		public String getip() {
			return "101.232.28.12";
			
		}
		
}

public static class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		server s =new server("8080");
		
		Ipaddress ip=new Ipaddress();
		s.connectserver(ip.getip(), s.port);

	}

}
}
