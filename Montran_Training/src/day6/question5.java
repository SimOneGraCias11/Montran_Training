package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter root directory:");
		String root = sc.nextLine();

		File f = new File(root);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("invalid");
			sc.close();
			
			return;
		}
		while (true) {
			System.out.println("1:Display files and directory");
			System.out.println("2.Open files and directory :");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				displayDir(f);
				break;

			case 2:
				while (true) {
					displayDir(f);

					System.out.println("Enter file or directory name: (or exit)");
					String s = sc.nextLine();
					if (s.equalsIgnoreCase("exit"))
						break;
					File file = new File(f, s);
					if (!file.exists()) {
						System.out.println("invalid");
					} else if (file.isDirectory()) {
						f = file;
					} else {
						fileOperation(sc, file);
					}
				}
			case 3:
				sc.close();
				return;
			default:
				System.out.println("invalid");
			}
		}

	}

	public static void displayDir(File dir) {
		File[] files = dir.listFiles();
		if (files != null) {
			System.out.println("Contents: " + dir.getPath());
			for (File fs : files) {
				if (fs.isDirectory()) {
					System.out.println("dir:" + fs.getName());
				} else {
					System.out.println("file:" + fs.getName());
				}
			}
		} else {
			System.out.println("no directory");
		}
	}

	public static void fileOperation(Scanner sc, File file) {
		while (true) {
			System.out.println("1:Read files");
			System.out.println("2.Write file");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				readFile(file);
				break;

			case 2:
				writeFile(sc, file);
				break;
			case 3:
				return;
			default:
				System.out.println("invalid ");
			}
		}
	}

	public static void readFile(File file) {
		try (FileInputStream fin = new FileInputStream(file)) {
			System.out.println("Content:" + file.getPath());
			int data;
			while ((data = fin.read()) > 0) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void writeFile(Scanner sc, File file) {
		System.out.println("Enter text:");
		String text = sc.next();

		try (FileOutputStream fout = new FileOutputStream(file, true)) {
			fout.write(text.getBytes());
			System.out.print("Successfull");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}