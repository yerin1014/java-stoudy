package staticex;

//static 변수는 클래스가 메모리에 로딩될 때 생성
//static 을 사용해서 객체 생성 없이 클래스 호출
//모든 객체가 공유
//객체 없이 사용 가능(클래스 이름으로 접근)
// 한 번만 생성됨(끝까지)
class Counter1 { 
	//인스턴스를 생성할 때마다 생기는 게 아니라, 프로그램 전체에 딱 하나만 존재
	static int cnt = 0;
	
	
	static void increase() {
		//객체 생성 없이 클래스 이름으로 바로 호출 가능
		cnt++;
	}
}


public class StaticTest2 {
	public static void main(String[] args) {
		
		//객체를 만들지 않아도 불러오기 가능!
		Counter1.increase();
		Counter1.increase();
		
		//static 변수도 클래스 이름을 통해 접근 가능
		System.out.println("count: " + Counter1.cnt);

	}

}
