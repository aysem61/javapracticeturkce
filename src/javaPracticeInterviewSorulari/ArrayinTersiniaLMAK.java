package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class ArrayinTersiniaLMAK {

	public static void main(String[] args) {
	/* Girilen ifadenin, Array kullanarak tersini alalım.
	 * 
	 * Deneme  -  emeneD
	 * 
	 * return yapsın
	 * 
	 * getTersi(char[] array)
	 * 
	 * 27 geçe başlayalım.
	 * 
	 * */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir ifade giriniz");
		
		String ifade=scan.next();
		
		char arr[]=ifade.toCharArray();// char seklinde  char arra dondurdu 
		
		String ters=getTersi(arr);
		
		System.out.println("Tersi "+ters);
		
		
		 
	}

	private static String getTersi(char[] arr) {
		String ters = "";
		
		for(int i = arr.length - 1 ; i >= 0; i--) {
			ters += arr[i];
		}

		
		return ters;
	}

	

}
