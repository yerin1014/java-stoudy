package staticex;

class Counter {
	//static 이 붙지 않아서 객체 내부에 개별적으로 만듦
	int cnt = 0; //일반 변수
	
	void increase() {
		//특정 객체에 소속되어 변수를 수정
		cnt++;
	}
}


public class StaticTest1 {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1.increase();
		c2.increase();
		//일반 변수는 각각의 객체마다 기억 변수가 생성됨
		
		System.out.println("c1: " + c1.cnt); 
		System.out.println("c2: " + c2.cnt);

	}

}
