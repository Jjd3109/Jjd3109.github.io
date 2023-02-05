package back;

import java.util.Scanner;

public class Back1712 {

	public static void main(String[] args) {
//		임대료, 재산세, 보험료,급여 -> a만원의 고정비용
//		재료비 인건비 - > b만우늬 가변 비용
//
//		ex) A = 1000, b = 70.. 노트북한대 -> 1070
//				   노트북열대 -> 1700
//
//		노트북 가격...c 
//		c > a+b지점이 손익분기점 !!
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // a만원의 고정비용
		int B = sc.nextInt(); // b만원의 가변비용
		int C = sc.nextInt(); // c 노트북 가격..
		
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
	}
		
}
