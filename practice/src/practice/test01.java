package practice;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++ ) {
			if ( i % 2 == 0) {
				b= b + i;
			}		
		}
		System.out.println(b);
        
	}
}

