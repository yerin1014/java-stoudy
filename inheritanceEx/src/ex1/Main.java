package ex1;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.name = "말차";
		d.age = 2;
		d.color = "검정";
		
		System.out.println(d.name + d.age + d.color);
		
		d.eat();
		d.sleep();
		d.bark();
		d.run();
		
		//animal dog 가 상속받았기 때문에 animal 에 있는 것들을 사용할 수 있음

	}

}
