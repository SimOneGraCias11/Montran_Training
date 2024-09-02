package day3;

 class emp {
	 int no=123;
	 String Name="Simone";
	 private float f1=3.14F;
	 double d=2.22;
	 
	 emp(){
		 System.out.println("Default");
	 }
	 emp(int no,String Name,float f1,double d){
		 this.no=no;
		 this.Name=Name;
		 this.f1=f1;
		 this.d=d;
		 
	 }
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getF1() {
		return f1;
	}
	public void setF1(float f1) {
		this.f1 = f1;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	

}
class address{
	
}
class pincode{
	
}