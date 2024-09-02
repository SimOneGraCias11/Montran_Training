package day4;
import day2.*;

class throw_throws extends Exception{
	public throw_throws(String msg) {
		super(msg);
	}
}
class showexp{
	int agefind(int age)throws throw_throws{
		if(age<=0) {
			throw new throw_throws("enter positive age");
			
		}
		return age;
	}
}
public class c1{
			public static void main(String[] args) {
				System.out.println("proper");
				try {
					showexp sh=new showexp();
					
					sh.agefind(9
							);
					System.out.println("ur age is:"+sh.agefind(9));
				}
				catch(Exception e){
					System.out.println(e);
				}
				
			}
		}
			
	


