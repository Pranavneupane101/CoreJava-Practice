package ControllStatment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionStatment {
	

	public static void main(String[] args) {
		
		
		List <Integer> list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(15);
		long sumEven=0;
		long sumOdd=0;
		
		 Scanner sc=new Scanner(System.in);
		
		//ifelse and for each
		/*
		 * for(int x:list) {
		 * 
		 * if (x%2==0) { sumEven=sumEven+x; }else{ sumOdd=sumOdd+x; } }
		 * System.out.println("The summ of the even numbers are:"+sumEven );
		 * System.out.println("The summ of the odd numbers are:"+sumOdd );
		 */
	    
	    //nested if else
	    
		/*

		 * 
		 * System.out.println("Enter our age:"); int age=sc.nextInt();
		 * System.out.println("Enter your Nationality"); String country=sc.next();
		 * if(country.equalsIgnoreCase("nepali")) { if(age>=18) {
		 * System.out.println("You can vote for Nepal"); }else {
		 * System.out.println("You havent reached your age"); } }else {
		 * System.out.println("You are not nepali .Therfore, You cannot vote."); }
		 */
	   
	   
	   
	   //switch
	    System.out.println("Enter the item");
	   String s=sc.next();
	   switch(s) {
	   case "Keyboard":
		   System.out.println("The cost is Rs 10000");
		   break;
	   case "Mouse":
		   System.out.println("The cost is Rs 6000");
		   break;
	   case "Monitor":
		   System.out.println("The cost is Rs 25000");
		   break;
	   case "Laptop":
		   System.out.println("The cost is Rs 120000");
		   break;
		 default:
		   System.out.println("The item is not found in the inventory");
	   }
	   
	   
	   
	   
	   
	    
	 
	    
	    
		}
	
	
	
	
	
	
}
