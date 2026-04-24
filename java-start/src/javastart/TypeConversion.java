package javastart;
 
public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127; //1바이트
		int i = 100;
		System.out.println(b+i); //b가 int 타입으로 자동 변환
		System.out.println(10/4);
		System.out.println(10.0/4); //4가 4.0으로 자동 변환
		System.out.println((byte)(b+i)); //1바이트는 8비트 -128~127
		System.out.println((int)2.9 + 1.8); //소수이하 버림
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
		System.out.println((double)10 / 4);
		int a = 10;
		double result = a + 3.5;
		System.out.println(result);
	}

}
