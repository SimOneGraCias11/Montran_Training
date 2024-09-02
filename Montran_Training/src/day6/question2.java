package day6;

import java.io.*;

public class question2 {
public static void main(String[] args) {
	File file =new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day5");
	System.out.println("Name of file:" + file.getName());
	System.out.println("Directory of file:" + file.isDirectory());
	
	File filedir[] = file.listFiles();
	for (File ob : filedir) {
		System.out.println(ob.getName());
	}
	System.out.println("....");
	File filedir1[] = file.listFiles(new FilenameFilter() {
		public boolean accept(File dir, String name) {
		//if(name.endsWith(".java")
			if (name.matches("[a-zA-Z]*.java$"))
				return true;
			else {
				return false;

			}
		}
	});

	for (File ob : filedir1) {
		System.out.println(ob.getName());
	}
}
}
