/*
 ==============================
Pattern 10
==============================
Question:
Print the following number pattern using rows and columns.

Pattern:
1  1  2  1  3  1
1  2  2  2  3  3
1  3  2  3  3  3
1  4  2  4  3  4
1  5  2  5  3  5

Suggested Java Class Name:
AlternatingColumnPattern
 */


package com.jru.Pattern;

public class AlternatingColumnPattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {

				if (j % 2 != 0) {          
					System.out.print((j + 1) / 2 + " ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}
