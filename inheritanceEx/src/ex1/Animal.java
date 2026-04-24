package ex1;

//부모 클래스(슈퍼 클래스)
public class Animal {
	String name;
	int age;
	String color;
	
	public void eat() {
		System.out.println(name + "가 먹이를 먹습니다.");
	}
	
	public void sleep() {
		System.out.println(name + "가 잠을 집니다.");
	}
//	public void show() {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(color);
//	}
	

}


