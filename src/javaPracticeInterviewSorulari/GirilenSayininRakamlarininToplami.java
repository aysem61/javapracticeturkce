package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class GirilenSayininRakamlarininToplami {

	public static void main(String[] args) {
		
		/* 
		 * Girilen sayının rakamları toplamını return eden bir method yazınız.
		 * 
		 * 59 geçe başlayalım
		 * 
		 * getRakamlarToplami(int sayi)
		 * 
		 * */
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Sayı giriniz : ");
			int sayi = scan.nextInt();
			int rakamlarToplami = getRakamlarToplami(sayi);
			System.out.println("Rakamlar toplamı : " + rakamlarToplami);
			/// 123  = > "123"
			//			 '1'  '2'  '3'
			//			 "1"  "2"  "3"
			//			Integer.parseInt("1") => 1
			//			Integer.parseInt("2") => 2
			//			Integer.parseInt("3") => 3 + 2 + 1
		}
		private static int getRakamlarToplami(int sayi) {  // 120
			int toplam = 0;
			int birlerBasamagi = 0;
			while(sayi > 0) {		// 12
				birlerBasamagi = sayi % 10;    // 0					2             1
				toplam += birlerBasamagi;      // toplam = 0 + 0 +  2		+     1  	
				sayi = sayi / 10;			   // sayi = 12		  sayi = 1		sayi = 0
			}
			return toplam;
		}


		
	

}
