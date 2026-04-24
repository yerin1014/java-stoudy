package ex3;

public class Dog3 extends Animal3 {
	String breed; //품종
	
	Dog3 (String name, int age, String breed) {
		super(name, age); 
		//부모 생성자 호출, 자식이 부모의 초기화 작업을 이어받음
		this.breed = breed;
		
	}
	public void showDog() {
		show(); //부모 클래스 매서드
		System.out.println("품종: " + breed);
	}
	
}
