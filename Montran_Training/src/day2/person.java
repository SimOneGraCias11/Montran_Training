package day2;

 class person {
	int id;
	String name;
	
	public person() {
		this.id=0;
		this.name="null";
	}
public person(int id,String name) {
	this.id=id;
	this.name=name;
}
public void show() {
	System.out.println("ID"+id);
	System.out.println("name"+name);

}
 }
  class programmer extends person {
	String skill;
	int TechnicalExperience;
	
	public programmer() {
		super();
	
		this.skill="null";
		this.TechnicalExperience=0;
	}
public programmer(int id,String name,String skill,int TechnicalExperience) {
	super(id,name);
	this.skill=skill;
	this.TechnicalExperience=TechnicalExperience;
}
public void show() {
	super.show();
	System.out.println("skill"+skill);
	System.out.println("TechnicalExperience"+TechnicalExperience);

}
  }
 class program extends programmer {
	int linesofcode;
	
	public program() {
		super();
			this.linesofcode=0;
	}
public program(int id,String name,String skill,int TechnicalExperience,int linesofcode) {
	super(id,name,skill,TechnicalExperience);
	this.linesofcode=linesofcode;
}
public int getlineofcode() {
	return linesofcode;
}
public void display() {
	super.show();
	System.out.println("LOC"+getlineofcode());
}	
}
 class Main{

	public static void main(String[] args) {
		
		program programmer =new program(123,"Ameer","Java",10,50);
		programmer.display();
	}
}

