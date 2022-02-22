package javaStudy;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 1; i<=100; i++) {
//			if(i%2!=0) {
//				continue;
//			} //end of if
			total = total + i;
			if(i==50) break;
		} //end of for
		System.out.println(total);
	} //end of main

} //end of class
