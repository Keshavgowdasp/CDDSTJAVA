package com.destination.jfs.day16;

import java.util.Scanner;

public class ConditionalStatement2 {
	public static void main(String[] args) {
		System.out.println("Enter The age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("Minor");
		
		}
		else if(age>=18 && age <60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}
}
}