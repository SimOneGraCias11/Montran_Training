package day4;

class throws_throws extends Exception{
	public throws_throws(String msg) {
		super(msg);
	}
}
class showeven{
	void checkodd(int num)throws throws_throws{
		if(num%2!=0) {
			throw new throws_throws("number is odd");
			
		}
System.out.println(num +"is even");	}
}


public class question2 {
	public static void main(String[] args) {
		System.out.println("proper");
		try {
			showeven s=new showeven();
			s.checkodd(20);
			s.checkodd(1);
			
			
		}
		catch(throws_throws e){
			System.out.println(e);
		}
		
	}
}
	