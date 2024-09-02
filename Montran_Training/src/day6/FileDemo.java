package day6;

import java.io.*;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file.txt");

		System.out.println("Name of file:" + file.getName());
		System.out.println("Directory of file:" + file.isDirectory());
		System.out.println("Is file:" + file.isFile());
		System.out.println("Path of file:" + file.getPath());
		System.out.println("Last modified file:" + file.lastModified());
		System.out.println("Length of file:" + file.length());
		System.out.println(" file exists:" + file.exists());

		if (file.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("file not created");
		}

		System.out.println(" file exists:" + file.exists());

		// Filefilter
		/*File filedir[] = file.listFiles();
		for (File ob : filedir) {
			System.out.println(ob.getName());
		}
		System.out.println("....");
		File filedir1[] = file.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				if (name.matches("^s[a-zA-Z]*"))
					return true;
				else {
					return false;

				}
			}
		});

		for (File ob : filedir1) {
			System.out.println(ob.getName());
		}
*/
//File Output Stream

		Scanner sc = new Scanner(System.in);

		//FileOutputStream f = new FileOutputStream(file, true);
//Buffered output stream
		BufferedOutputStream bout =new BufferedOutputStream(new FileOutputStream(file));
		
		System.out.println("Enter a String: ");
		String msg = sc.nextLine();
		String m = System.getProperty("line.separator");
		byte b[] = msg.getBytes();
		bout.write(b);
		bout.write(m.getBytes());
		bout.close();

		System.out.println("Successfull");

		// File input stream
		//FileInputStream fin = new FileInputStream(file);
		//Buffered Input System
		BufferedInputStream bin =new BufferedInputStream(new FileInputStream(file));

		
		int data;
		while ((data = bin.read()) > 0) {
			System.out.print((char) data);
		}
		bin.close();
	}
}
