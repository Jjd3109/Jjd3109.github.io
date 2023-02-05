package practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력하세요 : ");
			String Str = sc.nextLine();
			if(Str == "exit") {
				break;
			} else {
				System.out.println(Str.length() + "글자입니다.");
			}
			
			System.out.println("종료합니다.");
		}
		
		

	}

}
