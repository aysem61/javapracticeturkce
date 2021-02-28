package day8methodvearrays;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method 	
		// Kullanicidan bir  String kumesi girmesini isteyelim ve Kac kelimeden olustugunu  donene  JAVA methodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.nextLine();
		
		System.out.println("Metindeki kelime Sayisi :"+kelimeSayisi(kelime));
    
	}

	public static int  kelimeSayisi(String str) {
		int count =0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==' ') {
				count++;
				
			}
		}
		count=count+1;
		return count;
	}
}
