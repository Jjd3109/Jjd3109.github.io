package practice;

import java.util.Scanner;

public class printNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			for(int i = 1; i <= num; ) {
				i+=2;
				System.out.print(i-2);
			}
			
		}else {
			System.out.println("1과 10 사이의 숫자가 아닙니다.");
		}
		
	}

}
