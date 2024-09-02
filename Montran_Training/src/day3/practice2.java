package day3;

class employee{
	public void evaluate(int age1,int empage) {
		final int age = 45;
	
	class Rank{
		public char getRank(int age1){
			System.out.println(age1);
			return 'A';
		}
	}
	if(empage>=age) {
		Rank obj =new Rank();
		char Rank=obj.getRank(age1);
		if(Rank=='A') {
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}
	}

class practice2 {
public void main(String[] args) {
	employee obj=new employee();
	obj.evaluate(40, 41);
	
}
}
}
}