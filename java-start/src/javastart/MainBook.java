package javastart;

public class MainBook {

	public static void main(String[] args) {
		aBook myBook = new aBook("자바의 정석", 20000);
		aBook myBook2 = new aBook("파이썬의 정석");
		aBook myBook3 = new aBook();
		
		
//		myBook.title = "자바의 정석";
//		myBook.price = 20000;
		
		myBook.ShowPrice();
		myBook2.ShowPrice();
		myBook3.ShowPrice();

	}

}

class aBook{
	String title;
	int price;
	aBook(String n, int s){ // 객체 생성시 인자 2개 
		title = n;
		price = s;
	}
	aBook(String i){ // 객체 생성시 인자 1개 
		title = i;
		price = 0;
	}
	aBook(){ // 객체 생성시 인자 0개 
		title = "c언어의 정석";
		price = 0;
	}
	void ShowPrice() {
		System.out.println("도서 제목: "+title+", "+"가격: "+price);
	}
}