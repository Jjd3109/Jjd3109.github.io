import java.util.Scanner;
import java.util.regex.Pattern;

public class TEST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Password = "36w78";
		boolean bln = Pattern.matches("^[a-zA-Z0-9]*$", Password);
		System.out.println(bln);
		
		System.out.println("이 목록중에서 수정할 벌칙을 선택하시오.");
		String skt = sc.nextLine();
		
		System.out.println("벌칙을 입력하시오.");
		String input2 = sc.nextLine();
	

	}

}
