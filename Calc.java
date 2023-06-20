package firstprogram;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args)
	{
		//Sum, Difference, Product, Average, Distance, Maximum and Minimum 
		
		System.out.println("Enter your first number: ");
		Scanner scan1 = new Scanner(System.in);
		int i= scan1.nextInt();
		
		System.out.println("Enter your second number: ");
		Scanner scan2 = new Scanner(System.in);
		int j= scan2.nextInt();
		
	
		System.out.println("Sum =" +(i+j));
		System.out.println("Difference = " +(i-j));
		System.out.println("Product =" +(i*j));
		System.out.println("Average =" +((i+j)/2));
		System.out.println("Distance =" + (i-j));
		
		if(i>j) {
			System.out.println("Maximum= " +i);
		}
		else {
			System.out.println("Maximum= " +j);
		}
		
		if(i<j) {
			System.out.println("Minimum= " +i);
		}
		else {
			System.out.println("Minimum= " +j);
		}
		
	}

}

