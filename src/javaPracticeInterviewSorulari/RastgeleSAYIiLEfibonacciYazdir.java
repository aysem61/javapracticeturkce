package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class RastgeleSAYIiLEfibonacciYazdir {

	/* Kullanıcıdan sayı alın ve o sayı kadar ard arda gelen fibonacci sayı 
	 * dizisini ekrana yazdırın
	 * örnek : Kullanıcı 10 sayısını girdi, 10 tane sayıyı ekrana yazdıracağız.
	 * 		   0 1 1  2  3  5 8 13 21 34	
	 * Süre : 3 dk ,  9 geçe biter.
	 * 
	 * */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayı giriniz : ");
		
		int sayi = scan.nextInt();
		int sayi1 = 0;
		int sayi2 = 1;
		int ilkIkiSayininToplami = 0;
		System.out.print(sayi1+" "+sayi2);
		
		for(int i = 2; i < sayi ; ++i ) {
			
			ilkIkiSayininToplami = sayi1 + sayi2;     // 0 + 1			1 + 1        1  + 2     2   +  3                                         
			sayi1 = sayi2 ;							  // sayi1 = 1;		sayi1 = 1    2          3
			sayi2 = ilkIkiSayininToplami;			  // sayi2 = 1;     sayi2 = 2    3          5
			System.out.print(" " + ilkIkiSayininToplami);
		}

		

	}

}
