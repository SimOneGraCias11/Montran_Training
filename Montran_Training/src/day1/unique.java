package day1;
//package q;
//
//public class unique {
//	public static int uniqueword(String str) {
//		String[] words=str.split("\\s+");
//		int n=words.length;
//boolean []isUnique=new boolean[n];
//int count=0;
//		
//		for(int i=0;i<words.length;i++) {
//			isUnique[i]=true;
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<words.length;j++) {
//				if(words[i].equalsIgnoreCase(words[j])) {
//					isUnique[i]=false;
//					isUnique[j]=false;
//					
//		
//				}
//
//		}
//		}
//			if(isUnique[i]) {
//				count++;
//			}
//			}
//		return count;
//	}
//		
//	public static void main(String[] args) {
//		String str="Java is great and C++ is also great";
//		int unique=uniqueword(str);
//System.out.println("count:" +unique);	}
//
//}
