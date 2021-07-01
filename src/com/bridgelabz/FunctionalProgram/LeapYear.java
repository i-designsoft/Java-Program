package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;
public class LeapYear{
	public static void main(String agrs[]){


	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter Year to check: ");
	int year= scanner.nextInt();

		if(year%4==0){
			System.out.println("Given year is leap Year");
		}else
			System.out.println("Given Year is not a leap year");
	}
}
