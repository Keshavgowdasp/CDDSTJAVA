package com.destination.jfs.day16;

import java.util.Scanner;

public class ConditionalStatement1 {
public static void main(String[] args) {
	System.out.println("Enter The number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2==0) {
		System.out.println("Even Number");
	
	}
	else {
		System.out.println("Odd  Number");
	}
}
}
