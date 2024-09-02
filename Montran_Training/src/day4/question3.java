package day4;
//import day2.src.day2.question8 ;
class invalidpan extends Exception{
	public invalidpan(String msg) {
		super(msg);
	}
}

 class pan{
	 String name;
	 String Pancard;
	 
	 void pancard1(String name,String Pancard)throws invalidpan{
		 char fifth =Pancard.charAt(4);
		 char first=Character.toUpperCase(name.charAt(0));
		 
		 if(fifth!=first) {
			 throw new invalidpan("wrong");
		 }else {
			 System.out.println("right");
		 }
	 }
 }

public class question3 { 
public static void main(String[] args) {
	//System.out.println("enter pan card no:");
	//String pan_no= question8.getstring();
	try {
		pan sh=new pan();
		
		sh.pancard1("Simone","ACDG12346");
	}
	catch(Exception e){
		System.out.println(e);
	
}
}
}