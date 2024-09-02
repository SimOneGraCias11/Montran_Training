package day3;

import java.util.Calendar;

class Netflix{
	String Usercode;
	String Username;
	double wallet;
	
	public Netflix(String Usercode,String Username,double wallet) {
		this.Usercode=Usercode;
		this.Username=Username;
		this.wallet=wallet;
	}
	public void recharge(double amount ) {
		wallet+=amount;
		System.out.println("activated");
	}
	public void showStatus() {
		if(wallet<50) {
			System.out.println(Username+"ID: "+ Usercode +"low balance");
		}
	}
	public void displayReview(int likes) {
		getLike(likes);
		class Rank{

			public String getRank() {
				// TODO Auto-generated method stub
				
				return "*****";
			}
			
		}
		if(likes>=50) {
			Rank r=new Rank();
			String rate=r.getRank();
			System.out.println( Username+"rating"+rate);
		}else {
			System.out.println("abc");
		}
	}
	private void getLike(int likes) {
		// TODO Auto-generated method stub
		System.out.println("give likes:"+likes);
		
	}
	public class newmovie{
		int like;
		public void latest() {
			Calendar c =Calendar.getInstance();
			if(wallet>0) {
			System.out.println("new movie relased is fall at"+c.getTime());
		}
			else {
				System.out.println("nothing");
			}
	}
	
}

}
public class question5 {
public static void main(String[] args) {
	Netflix n=new Netflix("NF123","Simone",0);
	n.showStatus();
	n.recharge(0);
	n.displayReview(75);
	Netflix.newmovie ob=n.new newmovie();
	ob.latest();
}
}

