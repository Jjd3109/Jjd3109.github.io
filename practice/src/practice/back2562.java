package practice;

import java.util.Scanner;
import java.util.Arrays;

public class back2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//9개의 서로 다른 자연수가 주어진다.
		int[] arr1 = new int[9];
		
		
		for(int i = 0; i < 9; i++) {
			//정수값을 입력
			arr1[i] = sc.nextInt();
			}
		int max = arr1[0]; // 기준이 될 첫번째 값을 max에 넣음
		int index = 0; // 변수설정
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > max) {
				max = arr1[i];
				index = i + 1; /// max 값의 위치
			}
		}
		System.out.println(max);
		System.out.println(index);
			
		}
		
}
