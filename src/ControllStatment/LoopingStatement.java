package ControllStatment;

import java.util.Scanner;

public class LoopingStatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=0;
	
		
		/*
		 * while (x!=10) { System.out.println("Enter the correct number");
		 * x=sc.nextInt();
		 * 
		 * }
		 */
		do {
			System.out.println("Enter the correct number");
			x=sc.nextInt();
		} while (x>10);
		
		 
	}
	
}
