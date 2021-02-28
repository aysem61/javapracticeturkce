package javapracticeday8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuetionsHashMap {

	static Map<String,Integer> kelimeListesi=new HashMap<>();
	//  kelime =1 
	// ahmet=2  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///			KELİME ANALİZİ
				/*
				 * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
				 * 
				 * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap 
				 * 				oluşturun.
				 * 2. Adım : Girilen metni split methodu ile parçalayalım.	
				 * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
				 * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim	
				 * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve 
				 * 				tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
				 * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
				 * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
				 * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri 
				 * 				tekrar sayısıyla birlikte gösterelim.
				 * 
				 * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
				 * */
				///// örnek bir parçalama çiz
				//		cümle bir. cümle iki -- > split
				//		1. "cümle bir" --- >> cümle (1) , bir (1)
				//		2. "cümle iki" --- >> cümle (2) , iki (1)
		
		Scanner scan=new Scanner(System.in);

		System.out.println("istediginiz  metni giriniz");
		
		String metin=scan.nextLine();
		
		String[] cumleler=metin.split("\\.");// nokta  ifadesini parcalamka icin o sekilde ters slach ile ayrilir 
		
		// cumle bir 
		// ahmet okula gitti
		System.out.println(Arrays.toString(cumleler));
		
		for (int i=0; i<cumleler.length; i++) {
			String[] kelimeler=cumleler[i].trim().split(" ");//  trim ile  basta ki bosluk  silindi ve  split  ile de bosluk  karakterine gore  kelimeler ayrildi 
			
			System.out.println(Arrays.toString(kelimeler));
			//cumleler bir 
			
			for (int j=0; j<kelimeler.length; j++) {
				if (kelimeListesi.get(kelimeler[j])==null) {
					kelimeListesi.put(kelimeler[j], 1);
				}else {
					int  sayi=kelimeListesi.get(kelimeler[j]);
					
				kelimeListesi.put(kelimeler[j], 1);
			}
			
		}
		
		for (String s:kelimeListesi.keySet()) {
			System.out.println(s+"="+kelimeListesi.get(s));
		}
		
		
		}
	
	
	
	}
	
}

	

