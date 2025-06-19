package Array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayPratice1 {
public static void main(String[] args) {
	int numbers[]=new int[10];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		numbers[i]=sc.nextInt();
			
	}
	System.out.println("The numbers are:" );
	for (int i = 0; i < 5; i++) {
		System.out.println(numbers[i]);
	}
}

}
