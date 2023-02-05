
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex {
	
	public class Student{
		private String name;
		private String age;
		
		public Student(String name, String age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] inputArr = new String[1];
		inputArr[0] = "자바";
		
		List<String> testList = new ArrayList<>(Arrays.asList(inputArr));
		System.out.println(testList);
		testList.add(sc.nextLine());
		System.out.println(testList);
		
		List<String> testList1 = new ArrayList<String>();
		testList1.add("1");
		System.out.println(testList1);
		
		List listA = new ArrayList();
		 
		listA.add("김삿갓");
		listA.add("홍아리");
		listA.add(new String("홍길동"));
		 
		listA.add(1, "1번째 요소값");
		System.out.println(listA);

		
		

	}

}
