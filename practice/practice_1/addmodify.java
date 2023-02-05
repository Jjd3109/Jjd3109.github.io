package practice_1;

import java.util.Scanner;

public class addmodify {
	Scanner sc = new Scanner(System.in);
	
	ArraryList<String> arr1 = new ArraryList<String>();
	
	public void add() {
		for(int i = 0; ; ) {
			System.out.println("학생값을 입력하세요.");
			String a = sc.nextLine();
			if(a.equals("종료")) {
				break;
			}
			arr1.add(a);
			System.out.println("입력완료.");
		}
	}
	
	public void modify() {
		
	}

}
