package back;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Back10818 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int A = sc.nextInt();
        int N = sc.nextInt();
        int B = 0;
        
        for(int i = 0; i < N; i++) {
        	int a = sc.nextInt(); //
        	int b = sc.nextInt();
        	
        	B += a*b;
        }
        
        if(A == B) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        


	}

}
