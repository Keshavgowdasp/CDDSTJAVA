package com.destination.jfs.day18;


import java.util.Scanner;

/*
 * 3.
     ########
 */
public class Pattern3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The n Value:");
	int n = sc.nextInt();
	//for loop
	for(int i;i<=n;i++) {
		System.out.print("# ");
	}
	System.out.println();
	System.out.print(=========);
	//while
	int j=1;
	while(j<=n) {
	System.out.println("$");
	j++;
}   
	//do-while
	int k=1;
	do {
		System.out.println("$");
		k++;
		} while(j<=n);
	}
	}
