package com.corejava;

import java.util.Scanner;

public class Arnstrongnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		findArmstrong(a, b);

	}

	static void findArmstrong(int a, int b) {
		for (int i = a; i <= b; i++) {
			int num = i;
			int sum = 0;
			int rem;
			while (num > 0) {
				rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}
			if (sum == i) {
				System.out.println(sum);
			}
		}
	}

}
