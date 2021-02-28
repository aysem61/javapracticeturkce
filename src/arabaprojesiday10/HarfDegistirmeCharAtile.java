package arabaprojesiday10;

import java.util.Scanner;

public class HarfDegistirmeCharAtile {

	public static void main(String[] args) {
		
		/*Kullanicinin yazmis oldugu  kelimenin icerisinde ki harfleri 
		 * alfabeye gore bir sonraki  harf ile  degistiriniz 
		 * 
		 * araba
		 * bsbcb
		 * 
		 * arabaz
		 * bsbcba
		 * 
		 * 5 dak.
		 * 
		 */
		
		System.out.println("Bir kelime giriniz");
		
		Scanner scan=new Scanner(System.in);
		
		String kelime=scan.next();
		
		String yeniKelime=getYeniKelime(kelime);
		
		System.out.println(yeniKelime);

	}

	private static String getYeniKelime(String kelime) {
		
		String yeniKelime="";
		
		for(int i=0; i< kelime.length(); i++) {
			
			char harf=kelime.charAt(i);// araba charAt(0) =a gibi 
			
			//harf +=1;
			
			if (harf=='z') // mulakat sorusu 
				harf='a';
			else if (harf=='Z')
				harf='A';
			else
				harf +=1;
			
				
			yeniKelime+=harf;
			
		}
		
		return yeniKelime;
	}

}
