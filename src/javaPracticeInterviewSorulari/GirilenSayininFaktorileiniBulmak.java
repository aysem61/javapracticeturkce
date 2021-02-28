package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class GirilenSayininFaktorileiniBulmak {
	
	/* Girilen sayının faktoriyelini bulan bir method yazınız. 
	 * getFaktoriel();    // long
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz : ");
		long sayi = scan.nextLong();
		long faktoriel = getFaktoriel(sayi);
		System.out.println("Sonuç : " + faktoriel);
		long faktorielYeni = getFaktorielYeni(sayi);
		System.out.println("SonuçYeni : " + faktorielYeni);
		// 5 * 4 * 3 * 2 * 1 = 120
		
	}
	
	private static long getFaktoriel(long sayi) {
		if(sayi == 0 || sayi == 1) {
			return 1;
		}
		long faktoriyel = 1;
		for(int i = 1; i <= sayi ; i++ ) {   //  1  -  5
			faktoriyel *= i;				 //  1*1 = faktoriyel   2*2   2 * 3 = 6    4 * 6 = 24      24 * 5 = 120      
		}
		return faktoriyel;
	}
	private static long getFaktorielYeni(long sayi) {
		if(sayi == 0 || sayi == 1) {
			return 1;
		}else {
			return sayi * getFaktorielYeni(sayi - 1 );
		}
	}


}
