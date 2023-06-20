package firstprogram;

import java.util.Scanner;

public class TempScale {

	public static void main(String[] args) {
		
		/*
		We have to create program to convert Celsius Temperature into different scales
		We will use below formula
		to convert Celsius into Fahrenheit
		°F = 1.8°C + 32°
		to convert Celsius into Kelvin
		°C + 273°
		
		
Input : 0.0
Output : 

0.0 Celsius = 32.0 Fahrenheit

0.0 Celsius = 273 Kelvin
		*/
				
		System.out.println("Input :");
		Scanner scan = new Scanner(System.in);
		float c= scan.nextFloat();
		double f= (1.8 *c) + 32;
		System.out.println("Output :");
		System.out.println(c +"Celsius =" +f +" Fahrenheit");
		int k = (int)c +273;
		System.out.println(c +"Celsius =" +k +" Kelvin");

	}

}
