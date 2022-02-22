package javaStudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iarray = new int[100];
		
		iarray[0] = 1;
		iarray[1] = 2;
		
		System.out.println(iarray.length);
		
		for(int i = 0; i<iarray.length; i++) {
			iarray[i] = i + 1;
		} //end of for
		
		int sum = 0;
		for(int i = 0; i<iarray.length; i++) {
			sum = sum + iarray[i];
		} //end of for
		System.out.println(sum);
	} //end of main

} //end of class
