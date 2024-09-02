package day6;

import java.io.*;

public class DataStream {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Simone Gracias\\eclipse-workspace\\Montran_Training\\src\\day6\\file.txt");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true));
		//dos.writeUTF("Hello World");
		dos.writeInt(1234);
		dos.writeDouble(86.86);
		dos.writeBoolean(true);
		dos.writeChars("S");
		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		System.out.println(dis.readInt());
	}

}
