package javastart;

import java.util.Scanner; 


public class ConvertType1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("숫자를 문자로 입력하세요.");
		String input = sc.nextLine();

		double d = Double.parseDouble(input);
		
	
		String s1 = Double.toString(d); 

		String s2 = String.valueOf(d); 

		
		//출력
		System.out.println("입력 문자열: "+input);
		System.out.println("숫자로 변환: "+d);
		System.out.println("다시 문자열로 변환(toString): "+s1);
		System.out.println("다시 문자열로 변환(valueOf): "+s2);
		
		sc.close();
	}

}
