package practice;

import java.util.HashMap;
import java.util.Scanner;

public class back10818 {

	public static void main(String[] args) {
		
		int num = 150;
		int a;
		
		int sum = 0;
		for(a=1; a<=num; a++){
			if((num%a)==0) {
				System.out.println(a);
				sum += a;
			}
		}
		System.out.println(sum);
		
	}

}
