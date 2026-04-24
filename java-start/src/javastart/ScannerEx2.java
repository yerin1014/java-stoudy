package javastart;

import java.util.Scanner;

public class ScannerEx2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("상품명: ");
      String name=sc.nextLine();
      
      System.out.println("가격: ");
      int price=sc.nextInt();
      
      System.out.println("수량: ");
      double quan=sc.nextDouble();
      
      System.out.println("회원여부(true/false):");
      boolean mem=sc.nextBoolean();
      
      System.out.println(name);
      System.out.println(price);
      System.out.println(quan);
      if(mem) {
      System.out.println("회원입니다");
      }
      else {
         System.out.println("비회원입니다");
      }
      sc.close();
   }

}