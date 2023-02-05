package back;

import java.util.Scanner;

public class Back2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[9];

		
		for(int i = 0; i<9; i++) {
			arr1[i] = sc.nextInt();

		}
		int max = arr1[0];			// 기준이 될 첫번 째 값을 max에 넣음 
		int index = 0 ;			// 최대값의 위치를 알아낼 변수 생성
		
		for(int i = 1 ; i < arr1.length ; i ++)
		{
			if(arr1[i] > max) 			// max는 arr[0]이니까, max보다 큰 값이 있으면 그 값이 max가 됨.
			{							
				max = arr1[i];
				index = i+1;			// max가 된 값의 위치를 index에 저장
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
