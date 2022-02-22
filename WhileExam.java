package javaStudy;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		
//		while(i<10) {
//			System.out.println(i);
//			i++; //i=i+1
//		} //end of while
		
		int total = 0;
		int i = 1;
		while(i<=100) {
			total = total+i;
			i++;
		} //end of while
		
		System.out.println(total);
		
		while(true) {
			System.out.println("hello");
		} //end of while
	} //end of main

} //end of class
