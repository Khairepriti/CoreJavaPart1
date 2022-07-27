package com.corejava;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)
		System.out.println(s.length());// 6
		String str1 = "Hello";
		String str2 = "Javatpoint";
		String str3 = "Reader";
		// Concatenating one string
		String str4 = str1.concat(str2);
		System.out.println(str4);
		// Concatenating multiple strings
		String str5 = str1.concat(str2).concat(str3);
		System.out.println(str5);
		String s1 = "this is index of example";
		// passing substring
		int index1 = s1.indexOf("is");// returns the index of is substring
		int index2 = s1.indexOf("index");// returns the index of index substring
		System.out.println(index1 + "  " + index2);// 2 8

		// passing substring with from index
		int index3 = s1.indexOf("is", 4);// returns the index of is substring after 4th index
		System.out.println(index3);// 5 i.e. the index of another is

		// passing char value
		int index4 = s1.indexOf('s');// returns the index of s char value
		System.out.println(index4);// 3
		String s2 = "this is index of example";// there are 2 's' characters in this sentence
		int index = s1.lastIndexOf('s');// returns last index of 's' char value
		System.out.println(index1);// 6
		String str = "    hii      ";
		String s8 = str.trim();
		System.out.println(str.length());
		System.out.println(s8.length());

		String STR1 = "Hello how are you";
		String[] arrofStr = STR1.split(" ", 4);
		for (String a : arrofStr)
			System.out.println(a);

		String r1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :");
		r1 = sc.nextLine();
		String[] arrofr1 = r1.split(" ", 4);
		for (String b : arrofr1)
			System.out.println(b);
		int words = 1, character = 1;
		for (int i = 0; i < r1.length() - 1; i++) {
			char ch = r1.charAt(i);

			if (r1.charAt(i) == ' ' && r1.charAt(i + 1) != ' ') {

				words++;
			} else if (r1.charAt(i) != ' ') {
				character++;
			}
		}
		System.out.println("\n Total words:" + words);
		System.out.println("\n Total character:" + character);
		System.out.println("\n total Space :" + (words - 1));
	}

}
