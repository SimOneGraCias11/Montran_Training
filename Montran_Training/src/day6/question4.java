package day6;

import java.io.*;
import java.util.Scanner;

public class question4 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file1.txt");
		if (file.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("file not created");
		}

		System.out.println(" file exists:" + file.exists());
		Scanner sc = new Scanner(System.in);

//Buffered output stream
		try{
		BufferedOutputStream bout =new BufferedOutputStream(new FileOutputStream(file));
		
			System.out.println("Enter data : ");
		while(sc.hasNextLine()) {
		String msg = sc.nextLine();
		String m = System.getProperty("line.separator");
		byte b[] = msg.getBytes();
		
		bout.write(b);
		bout.write(m.getBytes());
		bout.close();

		System.out.println("Successful");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Buffered Input System
		BufferedInputStream bin =new BufferedInputStream(new FileInputStream(file));

		
		int data;
		while ((data = bin.read()) > 0) {
			System.out.print((char) data);
		}
		bin.close();
	}

}
	
