package com.corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Full Name: ");
		String name1 = sc.nextLine();
		System.out.println("Your full Name is: " + name1);

		System.out.println("Your Name: ");
		String name = sc.next();
		System.out.println("Your Name is: " + name);

		System.out.println("Enter your roll no.: ");
		int rollNo = sc.nextInt();
		System.out.println("Roll no is: " + rollNo);

//		System.out.println("Your Full Name: ");

//		System.out.print("Insert a number: ");
//		int number = input.nextInt();
//		input.nextLine(); // This line you have to add (It consumes the \n character)
//		System.out.println("Text1: ");
//		String text1 = input.nextLine();
//		System.out.println("Text2: ");
//		String text2 = input.next();
//		System.out.println("number is: " + number);
//		System.out.println("text1 is: " + text1);
//		System.out.println("text2 is: " + text2);

	}

}
