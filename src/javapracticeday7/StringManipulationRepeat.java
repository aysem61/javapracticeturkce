package javapracticeday7;

import java.util.Scanner;

public class StringManipulationRepeat {

	public static void main(String[] args) {
		/*
        Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
        geri kalan harfleri kucuk yazdiriniz
        String isimSoyIsim
        */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("isminizi ve soy isminizi bir bosluk ara ile yaziniz");
		
		String isimSoy=scan.nextLine();
		
		int ikinciBasNok=isimSoy.indexOf(" ");
		
	System.out.println(isimSoy.substring(0,1).toUpperCase());
	System.out.println(isimSoy.substring(1, ikinciBasNok+1).toLowerCase());
	System.out.println(isimSoy.substring(ikinciBasNok+1, ikinciBasNok+2).toUpperCase());	
	System.out.println(isimSoy.substring(ikinciBasNok+2).toLowerCase());
	
	System.out.println("ikinci cozum array list ve split methodu ile ");
	String [] isimler=isimSoy.split(" ");
	
	for (int i=0; i<isimler.length; i++) {
		isimler[i]=isimler[i].toLowerCase();
		
		if (isimler.length-1!=i) {
			System.out.println(isimler[i].substring(0, 1).toUpperCase()+isimler[i].substring(1)+" ");
		}else {
			System.out.println(isimler[i].substring(0, 1).toUpperCase()+isimler[i].substring(1));
		}
	}
		
		}

}
