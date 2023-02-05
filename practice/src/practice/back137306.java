package practice;

import java.util.Scanner;

public class back137306 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();//세 개의 자연수 A,B,C
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println(A*B*C);
		
		int[] counts = new int[10];
		String input = String.valueOf(A * B * C); //string 값으로 치환
		
		for(int i = 0; i < input.length(); i++) {
			counts[input.charAt(i)- '0']++;//a*b*c값을 한자리씩 치환 0을 뺴주는 이유 : 아스키코드 '0' 
		}
		for(int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}
		
		

		}
	}

