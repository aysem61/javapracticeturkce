package javapracticeda6;

import java.util.Scanner;

public class IfStatementVeTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanicidan 2 numara isteyiniz ve en buyuk ve en kucuk olarak yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
//		if (num1>=num2) {
//			System.out.println("En buyuk sayi: " + num1);
//			System.out.println("En kucuk sayi: " + num2);
//		}else  {
//			System.out.println(" En buyuk sayi: " + num2);
//			System.out.println(" En buyuk sayi: " + num1);
//	}
// }
	// ayni soruyu  ternary ile cozelim 
	
	String result= num1>=num2 ? num1+ "en buyuk rakamdir" + num2 + "en kucuk rakamdir": num2 +"en buyuk rakamdir"+ num1+ "en kucuk rakamdir";
	
	System.out.println(result);
          }
}
