package Array;

import java.util.Scanner;

public class foreachwithArray {
 
	
	public static void main(String[] args) {
		int mat[][]=new int [3][3];
		mat=input();
		System.out.println("the matrix is:");
		output(mat);
		
	}
	static int[][] input() {
		System.out.println("ENTER THE NUMBER");
		Scanner sc=new Scanner(System.in);
		int x[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				x[i][j]=sc.nextInt();
			}
		}
		return x;
		
	}
	
	static void output(int x[][]) {
		for(int[] y: x) {
			System.out.println(y);
			
		}
	}
}
