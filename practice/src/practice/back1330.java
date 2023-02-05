package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class back1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 숫자의 개수
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < a; i++) {
			arr.add(sc.nextInt());
		}
		
		int sum = arr.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
	}

}
