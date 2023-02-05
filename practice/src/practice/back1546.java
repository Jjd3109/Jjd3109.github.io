package practice;

import java.util.Scanner;
import java.util.Arrays;

public class back1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double b = 0;
		
		int n = sc.nextInt();
		double[] arr1 = new double[n]; // 시험본 과목의 개수
		
		for( int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt(); //점수입력
			}
		
		Arrays.sort(arr1); //최댓값찾기
		double M = arr1[arr1.length - 1]; //- > 최댓값
		
		for(int i = 0; i < n; i++) {
			arr1[i] = arr1[i] / M * 100; // 점수들 나오는거
		}
		
		for(int i = 0; i < n; i++) {
			b += arr1[i];
			
		}
		System.out.println(b / n);
//		System.out.println(Arrays.toString(arr1));
		
		
		

	}

}
