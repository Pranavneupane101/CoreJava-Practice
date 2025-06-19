package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UsingArray {
public static void main(String[] args) {
//	float numbers[]=new float[20];
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the numbers:");
//	for (int i = 0; i < 5; i++) {
//		numbers[i]=sc.nextFloat();
//	}
//	Arrays.sort(numbers);
//	System.out.println("Numbers is sorted order:");
//	for (int i = 1; i < numbers.length; i++) {
//		System.out.println(numbers[i]);
//	}
	
	
 
String Names[]=new String[100];
	System.out.println("Enter the names");
	Scanner sc=new Scanner(System.in);
	
	for (int i = 0; i < 2; i++) {
	Names[i]=sc.nextLine();
	}
	
	
	for (int i = 0; i < 2; i++) {
		System.out.println(Names[i]);
		}
	
	
}
}
