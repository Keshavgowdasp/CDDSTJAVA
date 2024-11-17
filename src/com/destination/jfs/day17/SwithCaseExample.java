package com.destination.jfs.day17;

import java.util.Scanner;

public class SwithCaseExample {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the first number:");
	int n1=sc.nextInt();
	System.out.println("Please enter the second number:");
	int n2=sc.nextInt();	
	System.out.println("Please select the option:\n"
			+"1. Addition\n"
			+"2. Subtraction\n"
			+"3. Multiplication\n"
			+"4. Division\n");
	System.out.println("Please Select the choice above:");
	int choice =sc.nextInt();
	int res;
	switch (choice) {
	case 1: {
		System.out.println("Addition Operation");
		res=n1 + n2;
		System.out.println(res);
		break;
		
	}
	case 2: {
		System.out.println("Subtraction Operation");
		res=n1 - n2;
		System.out.println(res);
		break;
		
	}
	case 3: {
		System.out.println("Multiplication Operation");
		res=n1 * n2;
		System.out.println(res);
		break;
		
	}
	case 4: {
		System.out.println("Division Operation");
		res=n1 / n2;
		System.out.println(res);
		break;
		
	}
	default:
		System.out.println("Invalid choice");
	}
}
}
