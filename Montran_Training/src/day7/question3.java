package day7;
import java.time.*;

	class DisplayInfor<G1, G2,G3> {
		G1 date;
		G2 Name;
		G3 no_assign;
		
		public DisplayInfor(G1 date,G2 Name,G3 no_assign) {
			this.date=date;
			this.Name=Name;
			this.no_assign=no_assign;
			
		}
			public void display() {
				System.out.println("Today's date :"+date);
				System.out.println("Name of Chapter:"+Name);
				System.out.println("No of assignment:"+no_assign);
				
			}
		
	}

	
	public class question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate now =LocalDate.now();
DisplayInfor<LocalDate,String,Integer> di = new DisplayInfor<LocalDate,String,Integer>(now,"Java Genric",23);

di.display();
	}

}
