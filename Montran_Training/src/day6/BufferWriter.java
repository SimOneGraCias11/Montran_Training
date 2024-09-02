package day6;
import java.io.*;

public class BufferWriter {
	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file.txt");
			String data="Simone";
			w.write(data);
			w.close();
			System.out.println("Write Successful");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	try {
		Reader r=new FileReader("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file1.txt");
		int data=r.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=r.read();
		}
		r.close();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
