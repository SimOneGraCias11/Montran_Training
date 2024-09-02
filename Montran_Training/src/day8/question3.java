package day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Car {
	String name;
	double avg_per_miles;
	double price;

	public Car(String name, double avg_per_miles, double price) {
		this.name = name;
		this.avg_per_miles = avg_per_miles;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg_per_miles() {
		return avg_per_miles;
	}

	public void setAvg_per_miles(double avg_per_miles) {
		this.avg_per_miles = avg_per_miles;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Car name: " + name + " Miles: " + avg_per_miles + " Price:" + price;
	}

}

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Map<String, Car> hm = new HashMap<>();
		  
		
		  hm.put( "Sedan",new Car("ABC",230,250000)) ; 
		  hm.put("Hatchback",new Car("WER",300,234521));
		  hm.put("MUV",new Car("mercedes",213,2567422));
		  
		  
		//for(Map.Entry<String,Car> entry:hm.entrySet(){
		  
			
			  Iterator<Map.Entry<String, Car>> is = hm.entrySet().iterator(); while
			  (is.hasNext())
			  { 
				  Map.Entry<String, Car> entry = is.next();
				  if(entry.getKey().equals("Sedan")) {
					  
					  System.out.println("Feature of Sedan Comfortable Car ");
				  }else if(entry.getKey().equals("Hatchback")) {
					  System.out.println("Feature of Hatchback: Rear Doors that opens upwards");
				  }else {
					  System.out.println("Feature of MUV spacious interior");
				  }
			  System.out.println( "Key:"+ entry.getKey() +" Value: " + entry.getValue());
			  }
			 

	}
}