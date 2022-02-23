package javaStudy;

public class StringMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(str.length());			    //문자열 길이 구하기
		System.out.println(str.concat(" world"));	//문자열 결합하기
		System.out.println(str);
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));		//문자열 글자 잘라주기
		System.out.println(str.substring(3, 7));
	} //end of main

} //end of StringMethodExam
