package P2;
import P1.Protection;

class otherpackage {
	Protection pd;
	 otherpackage(){
		 System.out.println("Private"+pd.pri_n);
		 System.out.println("Protected"+pd.pro_n);
		 System.out.println("public"+pd.pub_n);
		 System.out.println("int"+pd.n);
	 
}
}