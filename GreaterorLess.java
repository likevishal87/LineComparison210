package com.bridgelabz;

import java.util.Scanner;

public class GreaterorLess {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		double x1, x2, x3, x4, y1, y2, y3, y4, Line_1, Line_2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 coordinate:");
		x1 = sc.nextInt();
		System.out.println("Enter x2 coordinate:");
		x2 = sc.nextInt();
		System.out.println("Enter y1 coordinate:");
		y1 = sc.nextInt();
		System.out.println("Enter y2 coordinate:");
		y2 = sc.nextInt();
		Line_1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));
//	         second line
		System.out.println("Enter x3 coordinate:");
		x3 = sc.nextInt();
		System.out.println("Enter x4 coordinate:");
		x4 = sc.nextInt();
		System.out.println("Enter y3 coordinate:");
		y3 = sc.nextInt();
		System.out.println("Enter y4 coordinate:");
		y4 = sc.nextInt();
		Line_2 = Math.sqrt(Math.pow((x4 - x3), 2)) + Math.sqrt(Math.pow((y4 - y3), 2));

		if (Line_1 == Line_2) {
			System.out.println("Line_1 is equal Line_2");
		} else if (Line_1 > Line_2) {
			System.out.println("Line_1 is greater Line_2");
		} else {
			System.out.println("line_1 is not Line_2");
		}

	}

}
