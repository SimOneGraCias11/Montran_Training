package bean;

import java.io.Serializable;

public class Book implements Serializable{

private	int id;
private String name;
private String author;
private	int no_pages;


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
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getNo_pages() {
	return no_pages;
}
public void setNo_pages(int no_pages) {
	this.no_pages = no_pages;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}


}
