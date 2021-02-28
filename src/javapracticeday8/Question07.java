package javapracticeday8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
		 *  1. Adım : Kullanıcıdan ismini isteyelim // Methi Turan
		 *  2. Adım : Kullanıcı adındaki boşlukları silelim. // Methi Turan 
		 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
		 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
		 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ayşe");
			veritabanindakiKullaniciListesi.add("Süleyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
			tavise edilen kullanici adi MethiTuran1234
		 */
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi girin");
		String kullaniciAdi=scan.nextLine();
		kullaniciAdi.replace(" ","");
		System.out.println(kullaniciAdi);
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayşe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		//int num = new Random().nextInt(1000);

		System.out.println("uygun degil :"+veritabanindakiKullaniciListesi.contains(kullaniciAdi));
		
		
		if(veritabanindakiKullaniciListesi.contains(kullaniciAdi)) {
			int rastgeleSayi=new Random().nextInt(500);
			String yeniKullaniciAdi=kullaniciAdi+rastgeleSayi;
					
			System.out.println("Yeni kullanici adi:"+yeniKullaniciAdi);
			veritabanindakiKullaniciListesi.add(yeniKullaniciAdi);
		}else {
			System.out.println("Bu kullanici adi Uygundur");
		}
		
		
	}

}
