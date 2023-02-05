package practice;

import java.util.Scanner;

public class back3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[10]; // 배열 생성
		int b = 0; // b 서로 다른 갯수
		boolean b1;
		
		for(int i = 0; i < arr1.length; i++) {
			
			arr1[i] = sc.nextInt() % 42;
			
		}
		
		//배열안에 서로 다른 갯수 찬기.
		for(int i = 0; i <arr1.length; i++) {
			b1 = false;
			for( int j = i + 1; j < arr1.length; j++) {
				if(arr1[i] == arr1[j]) {
					b1 = true; // 
					break;
				}
			}
			if( b1 == false) {
				b ++;
			}
		}
		
		System.out.println(b);
		
		
		
	}

}
