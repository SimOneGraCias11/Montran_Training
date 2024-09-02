package day6;

//Create class with Data member name,age,city.Create a menu driven program to enter no of person into file and display all person.

import java.io.*;
import java.util.*;
	 
class Person implements Serializable{
	String name;
	int age;
	String city;
	
	public Person(String name,int age,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class question6{
	
	static File file = new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file.txt");
	public static void main(String[] args) {
		ArrayList<Person> persons=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		
		/*
		 * persons.add(new Person("Simone",21)); persons.add(new Person("Sherwin",23));
		 * persons.add(new Person("Aaron",15)); persons.add(new Person("Noel",32));
		 * persons.add(new Person("Serena",21)); persons.add(new Person("Lincia",20));
		 */
		
		while(true) {
			System.out.println("1.Add persons:");
			System.out.println("2.Display persons");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addperson(persons,sc);
				saveperson(persons);
				break;

			case 2:
				persons=readperson();
				displayperson(persons);
				break;
			case 3:
				System.out.println("Exit");
				sc.close();
				return;
				default:
					System.out.println("invalid");
			}
		}
	}
	public static void addperson(ArrayList<Person> persons,Scanner sc) {
		System.out.println("enter no of people to add:");
		int nopeople=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<nopeople;i++) {
			System.out.print("enter name: ");
			String name=sc.nextLine();
			System.out.print("enter age: ");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.print("enter city: ");
			String city=sc.nextLine();
			persons.add(new Person(name,age,city));
			
		}
	}
	public static void saveperson(ArrayList<Person> persons) {
		try (
			FileOutputStream f = new FileOutputStream(file);	
			ObjectOutputStream os=new ObjectOutputStream(f)){
			
			os.writeObject(persons);
			//os.close();
			//f.close();
			System.out.println("person added successfully");
			}catch(Exception e) {
				e.printStackTrace();
			}
}
		public static ArrayList<Person> readperson(){
		try (
			FileInputStream fin = new FileInputStream(file);	
			ObjectInputStream oin=new ObjectInputStream(fin)) {
			
			return (ArrayList<Person>) oin.readObject();
			
		//	oin.close();
			//fin.close();
		}catch(Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
		}
		public static void displayperson(ArrayList<Person> persons) {
		for(Person person:persons) {
			System.out.println("Name:"+person.getName());
			System.out.println("Age:"+person.getAge());
			System.out.println("City:"+person.getCity());

			
		}
	}
}
