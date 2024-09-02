package day6;

import java.util.Scanner;
import java.io.*;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter root directory:");
		String root = sc.nextLine();
		
		File f=new File(root);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("invalid");
			return;
		}
		
		while(true) {
		displayDir(f);
		
		System.out.println("Enter file or directory name: (or exit)");
		String s=sc.nextLine();
		if(s.equalsIgnoreCase("exit"))
				 break;
		File file=new File(f,s);
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("invalid");
		

	}else if(file.isDirectory()) {
		f=file;
		displayDir(f);

	}
		

}
	}	
	public static void displayDir(File dir) {
		File[] files=dir.listFiles();
		if(files!=null) {
			System.out.println("Contents: "+dir.getPath());
			for(File fs:files) {
				if(fs.isDirectory()) {
					System.out.println("dir:"+fs.getName());
				}else {
					System.out.println("file:"+fs.getName());
				}
			}
		}else {
			System.out.println("no directory");
		}
	}
	
	public static void read(File content) {
		try(FileInputStream fin =new FileInputStream(content)){
			System.out.println("Content:"+content.getPath());
			int data;
			while ((data = fin.read()) > 0) {
				System.out.print((char) data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}