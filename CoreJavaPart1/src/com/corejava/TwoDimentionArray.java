package com.corejava;

import java.util.Scanner;

public class TwoDimentionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

}
