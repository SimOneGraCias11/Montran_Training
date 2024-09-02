package day2;

import java.util.Scanner;

interface mobilephone {
	void showDeveloper();

	String getVersion();

	String getWebMappingservice();

	String getVirtualAssistant();

}

class Android implements mobilephone {

	@Override
	public void showDeveloper() {
		System.out.println("Developer");
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "Android 14";
	}

	@Override
	public String getWebMappingservice() {
		// TODO Auto-generated method stub
		return "maps";
	}

	@Override
	public String getVirtualAssistant() {
		// TODO Auto-generated method stub
		return "google-assistant";
	}

}

class iOS implements mobilephone {

	@Override
	public void showDeveloper() {
		System.out.println("ios");
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "ios 16";
	}

	@Override
	public String getWebMappingservice() {
		// TODO Auto-generated method stub
		return "apple-maps";
	}

	@Override
	public String getVirtualAssistant() {
		// TODO Auto-generated method stub
		return "siri";
	}

}

public class question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("mobile:1-android ,2-ios");
		int choice = sc.nextInt();
		mobilephone phone;
		switch (choice) {
		case 1:
			phone = new Android();
			break;
		case 2:
			phone = new iOS();
			break;
		default:
			System.out.println("invalid");
			return;

		}
		phone.showDeveloper();
		System.out.println("version: " + phone.getVersion());
		System.out.println("webmappingservice: " + phone.getWebMappingservice());
		System.out.println("virtualassistant: " + phone.getVirtualAssistant());
		sc.close();

	}

}