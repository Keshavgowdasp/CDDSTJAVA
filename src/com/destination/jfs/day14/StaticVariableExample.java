package com.destination.jfs.day14;

class Dog{
	static String name;
	static String color;
	static String breed;
	static int cost;
	static int age;
	static void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	static void allocateData() {
		name="Rubby";
		color="white";
		breed="pug";
		cost=3000;
		age=2;
	}
}

public class StaticVariableExample {
public static void main(String[] args) {
	System.out.println(Dog.name);
	System.out.println(Dog.color);
	System.out.println(Dog.breed);
	System.out.println(Dog.cost);
	System.out.println(Dog.age);
	System.out.println("=================");
	Dog.allocateData();
	Dog.display();
}
}
