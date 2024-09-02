package day1;

public class longest {
public static void longestword(String word) {
	String longests="";
	int maxword=0;
	
	String[] words=word.split("\\s+");
	
	for(String wor:words) {
		if(wor.length()>maxword) {
			longests=wor;
			maxword=wor.length();
		}
	}
	System.out.println("longest word :" + longests + " max: " + maxword);
}
	public static void main(String[] args) {
		String word="tata football academy will play against mohan bagan";
		longestword(word);

	}

}
