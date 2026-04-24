package javastart;

class Car{  //클래스(설계도) 생성
	//클래스 = 멤버변수(필드) + 메서드(기능) 구성
	String model;
	int speed;  
	
	Car(String model, int speed){
		this.model = model; 
		this.speed = speed;
		//this:왼쪽 변수-객체변수, 오른쪽 변수-매개변수
		//this: 객체 자신
	}
	
	Car(String model){
		this.model = model;
		speed = 0;
	}
	
	Car() {
		model = "트럭";
		speed = 0;
	}
	
	//메서드 정의(기능, 행위)
	void showPrint(){ 
		System.out.println(model + ", "+ speed);
	}
}

public class MainCar { //실행하는 클래스

	public static void main(String[] args) {
		Car s1= new Car("Sonata", 100); 
		Car s2 = new Car("Avante", 80); 
		Car s3 = new Car("Avante");
		Car s4 = new Car();
		s1.showPrint();
		s2.showPrint();
		s3.showPrint();
		s4.showPrint();
			
	
		
	} 

}