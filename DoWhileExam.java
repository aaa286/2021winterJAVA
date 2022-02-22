package javaStudy;
import java.util.Scanner;
public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			//반복할 문장들
			System.out.print("숫자를 입력하세요: ");
			value = scan.nextInt();
			System.out.println("입력 받은 값: "+value);
		}while(value!=10); //end of do while
		
	} //end of main

} //end of class
