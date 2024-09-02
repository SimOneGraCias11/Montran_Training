package day3;

public class question1 {

	public static void main(String[] args) {
fact obj=(int no)->{
	int facto=1;
	for(int i=1;i<=no;i++) {
		facto*=i;
	}
	return facto;

};
	System.out.println("factorial :"+obj.sum(5));
}
	

}
interface fact{
	public int sum(int no);
}
