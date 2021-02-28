package arabaprojesiday10;

import java.util.Arrays;
import java.util.Scanner;

public class KelimeninIcindeTekrarEDENhARFLERIbULMA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kelimeyi yaziniz :");
		String kelime = scan.next();
		String kopyaHarfler = getKopyaHarflerBirinciYol(kelime);
		System.out.println(kopyaHarfler);
		
		String kopyaHarfler2=getKopyaHarlerIkinciYol(kelime);
		System.out.println(kopyaHarfler2);

	}

	private static String getKopyaHarlerIkinciYol(String kelime) {
		
		char[] charArray=kelime.toCharArray();// kelimeyi char array cevirme siralama yapmak icin 
		//System.out.println(Arrays.toString(charArray));
		String kopyaHarfler="";
		
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
		
		for(int i=0; i<charArray.length; i++) {//aaabr
			if(charArray[i]==charArray[i=1]) {
				if(!kopyaHarfler.contains(""+charArray[i]))
				kopyaHarfler+=charArray[i];//a
				
				
			}
		}
		return kopyaHarfler;
	}

	private static String getKopyaHarflerBirinciYol(String kelime) {
		// iki tane bos String  olusturalim
		
		String bosString="";
		String kopyaHarfler="";
		
		for(int i=0; i<kelime.length(); i++) {
			String harf=""+kelime.charAt(i);
			
			if(bosString.contains(harf)) {
				bosString+=harf;
			}else {
				if(!kopyaHarfler.contains(harf))
				kopyaHarfler+=harf;
			}
			
		}
		
		return kopyaHarfler;
	}

}
