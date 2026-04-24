package javastart;

import java.util.Scanner;

class Booka {
	String title;
	int price;
	
	Booka(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	

}

public class BookArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Booka [] c = new Booka[3];
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("제목 입력: ");
			String title = sc.nextLine();
			
			System.out.println("가격 입력: ");
			int price = sc.nextInt();
			
			c[i] = new Booka(title, price);
			sc.nextLine();
		}
		
		for(int j = 0; j < c.length; j++) {
			System.out.println(c[j].title + "," + c[j].price);
		}
		sc.close();

	}

}
