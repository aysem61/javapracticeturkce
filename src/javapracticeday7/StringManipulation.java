package javapracticeday7;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
        geri kalan harfleri kucuk yazdiriniz
        String isimSoyIsim
        */
        
        Scanner scan  = new Scanner(System.in);
        System.out.println("Isminizi ve soy isminiz bir bosluk ara ile yaziniz");
       //                    fedai ocak 
        String isimSoyIsim = scan.nextLine();
        
        int ikinciBasNok = isimSoyIsim.indexOf(" "); 
//      System.out.print(isimSoyIsim.substring(0,1).toUpperCase());
//      System.out.print(isimSoyIsim.substring(1, ikinciBasNok+1).toLowerCase());
//      System.out.print(isimSoyIsim.substring(ikinciBasNok+1, ikinciBasNok+2).toUpperCase());
//      System.out.println(isimSoyIsim.substring(ikinciBasNok+2).toLowerCase());
//      

        
        //    0/fedai              1/ocak    // isimler.length()-1 son elemana 
        
        String[] isimler=isimSoyIsim.split(" ");
        
        
        for ( int i=0; i< isimler.length; i++) {
        	
        	      isimler[i]=isimler[i].toLowerCase();
        	
        	if (isimler.length-1!=i) {// ilk stiring  elemani olani  buyuk harfe cavirme 
        		System.out.println(isimler[i].substring(0, 1).toUpperCase()+isimler[i].substring(1)+" ");
        	}else {
        		System.out.println(isimler[i].substring(0, 1).toUpperCase()+isimler[i].substring(1));
        	}
        }
	
	
	}
	

}
