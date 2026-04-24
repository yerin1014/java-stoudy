package test;

class Book {
	String title;
	
	Book (String title) {
		this.title = title;
	}
}




public class Ex5 {

	public static void main(String[] args) {
		Book[] b = new Book[3];
		
		b[0] = new Book("아몬드");
		b[1] = new Book("괭이부리말 아이들");
		b[2] = new Book("죽이고 싶은 아이");
		
		for(int i = 0; i < b.length ; i++) {
			//length() 는 문자열, length 는 배열
			System.out.println(b[i].title);
		}

	}

}
