package javastart;

class Person{
	String name;
	int age;
	String a;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void checkAdult() {
		if(age >= 19) {
			System.out.println("성인");
			a = "성인";
		}
		else if(age >= 10) {
			System.out.println("청소년");
			a = "청소년";
		}
		else {
			System.out.println("소인");
			a = "소인";
		}
	}
	
	void checkAdult2() {
		System.out.println(name + ',' + age + ',' + a);
	}
}


public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("john", 19);
		p.checkAdult();
		p.checkAdult2();
	}

}
