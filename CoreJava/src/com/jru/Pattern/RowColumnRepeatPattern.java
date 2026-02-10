/*
 ==============================
Pattern 11
==============================
Question:
Print the following number pattern using rows and columns.

Pattern:
1  1  1  2  1  3
2  1  2  2  2  3
3  1  3  2  3  3
4  1  4  2  4  3
5  1  5  2  5  3

Suggested Java Class Name:
RowColumnRepeatPattern
 */

package com.jru.Pattern;

public class RowColumnRepeatPattern {
	void main(){
		for (int i=1 ;i<=5;i++) {
			for (int j=1;j<=6;j++) {
				
				if( j%2!=0) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(j/2+" ");
				}
				
				
			}
			System.out.println();
		}
		
	}

}
