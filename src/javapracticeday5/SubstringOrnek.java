package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Kullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
		e.g: 
		mehmet ==>   mehahmetmet
		ahmet 
		*/
		
		Scanner str=new Scanner(System.in);
		
		String name1=str.nextLine();
		String name2=str.nextLine();
		
		
		int uzunluk=name1.length();
		
		if (uzunluk%2==0) {
			
			String yeni=name1.substring(0, uzunluk/2)+name2+name1.substring(uzunluk/2 );
			
			System.out.println(yeni);
					
		}
		
		
		

	}

}
