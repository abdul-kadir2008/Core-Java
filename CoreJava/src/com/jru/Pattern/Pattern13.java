/*
--------------------------------------------------
Pattern 13
--------------------------------------------------
1  10  11 20 21
2   9  12 19 22
3   8  13 18 23
4   7  14 17 24
5   6  15 16 25
 
 */
package com.jru.Pattern;

public class Pattern13 {
	void main() {
		int temp=9;
		int p_value=0;
	for (int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(j!=0) {
				p_value+=i;
				System.out.print(p_value+" ");
				
			}
			else {
				p_value+=temp;
				System.out.print(p_value+" ");
			}
	
		}
		temp-=2;
		p_value=+1;
	    System.out.println();
	}

}
}
