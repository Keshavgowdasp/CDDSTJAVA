package com.destination.jfs.day18;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the byte data :");
			byte byt = sc.nextByte();
			System.out.println("Byte Data is : "+byt);
			System.out.println("===========");
			short srt = sc.nextShort();
			System.out.println("Short Data is : "+srt);
			System.out.println("===========");
			int i = sc.nextInt();
			System.out.println("Int Data is : "+i);
			System.out.println("===========");
			long lng = sc.nextLong();
			System.out.println("Long Data is : "+lng);
			System.out.println("===========");
			String str = sc.next();
			System.out.println("String Data is : "+str);
			System.out.println("===========");
			float f = sc.nextFloat();
			System.out.println("Float Data is : "+f);
			System.out.println("===========");
			boolean b = sc.nextBoolean();
			System.out.println("Boll Data is : "+byt);
			System.out.println("===========");
}
}
