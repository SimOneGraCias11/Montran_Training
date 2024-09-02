package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
	int id;
	String name;
	int no_pages;
	
	public Book(int id,String name,int no_pages) {
		this.id=id;
		this.name=name;
		this.no_pages=no_pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo_pages() {
		return no_pages;
	}

	public void setNo_pages(int no_pages) {
		this.no_pages = no_pages;
	}
	
	public String toString() {
return "Book Id:  " + id + "Book name: "  +  name  +  "No of pages: " + no_pages;
}
}
class Author{
	int id;
	String name;
	String city;
	Book book;
	
	public Author(int id,String name,String city,Book book) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.book=book;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public String toString() {
		return "Author Id: " + id + "  Author name:  "  +  name  + " City: " + city + "Book:" + book;
		}
}
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(123, "Atomic Habits", 500);
		Book b2=new Book(111,"DBMS",2000);
		Book b3=new Book(121,"Java",5234);
		Book b4=new Book(132,"OS",210);

		
		List<Author> list1 = new ArrayList<>();
		list1.add(new Author(1,"James","ABC",b1));
		list1.add(new Author(2,"John","Mumbai",b2));
		list1.add(new Author(3,"Aaron","Delhi",b3));
		list1.add(new Author(4,"Sinora","Xyz",b4));
		
	for(Author a:list1) {
		System.out.println(a.toString());
	}
		
System.out.print("Enter author id to remove:");
Scanner sc=new Scanner(System.in);
int RemoveId=sc.nextInt();	

list1.removeIf(author ->author.getId() == RemoveId);

for(Author a:list1) {
	System.out.println(a);
}


	}

}
