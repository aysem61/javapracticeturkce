package javapracticevarmisinyokmusun_hamza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunaGiris {
	
	static List<Integer> paraListesi = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kutuNumaram , kutumdakiParaMiktari;
	
	static Kutular kutular=new Kutular();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paraListesi.add(1);
		paraListesi.add(10);
		paraListesi.add(500);
		paraListesi.add(1000);
		paraListesi.add(5000);
		paraListesi.add(10000);
		paraListesi.add(50000);
		paraListesi.add(100000);
		paraListesi.add(250000);
		paraListesi.add(500000);
		
		Collections.shuffle(paraListesi);// rastgele bir hale getir 
		System.out.println(paraListesi.toString());
		
		kutulariOlustur();
		
		System.out.println("    Oyunumuza Hosgeldiniz     ");
		System.out.println("Lutfen  Kutunuzu Seciniz");
		
		kutuNumaram=scan.nextInt();
		kutumdakiParaMiktari=paraListesi.get(kutuNumaram-1);
		System.out.println("Kutu Numaraniz :"+kutuNumaram);
		System.out.println("Kutunuzdaki Para :"+kutumdakiParaMiktari);
		
		kutular.kendiKutumuKaldir(kutuNumaram);
		
		kutuSecmeActirma();
	}

	private static void kutuSecmeActirma() {
		
		System.out.println("\nKalan Kutular : " + kutular.acilmamisKutulariGoster());
		System.out.println("\nHangi kutuyu açtırmak istiyorsunuz ? : ");
		int secim = scan.nextInt();
		kutular.kutuActir(secim);
		if(kutular.kalanKutuSayisiniAl() == 7 
				|| kutular.kalanKutuSayisiniAl() == 4 
				|| kutular.kalanKutuSayisiniAl() == 1) {
			System.out.println("Teklif :" + kutular.teklifAl());
			System.out.println("*****Kabul Ediyor musun******\n1-Evet\n2-Hayır");
			int kabul = scan.nextInt();
			if(kabul == 1) {
				System.out.println("Oyun Bitti. Kazandığın Para : " + kutular.teklifAl());
				System.out.println("Kutunda da " + kutumdakiParaMiktari + " TL vardı.");
			}else {
				kutuSecmeActirma();
			}
		}else {
			if(kutular.kalanKutuSayisiniAl() > 0 ) {
				kutuSecmeActirma();
			}else {
				System.out.println("Oyun Bitti !\nKutundaki Para : "+ kutumdakiParaMiktari);
			}
		}
		
	}

	private static void kutulariOlustur() {
		
		
//		Kutu kutu1=new Kutu();  // manual teker teker kut ve para listesi olusturma 
//		kutu1.setKutuNumarasi(1);
//		kutu1.setKutudakiParaMiktari(paraListesi.get(0));
//		
//		
//		Kutu kutu2=new Kutu();
//		kutu2.setKutuNumarasi(2);
//		kutu2.setKutudakiParaMiktari(paraListesi.get(0));
//		
		
		System.out.println(kutular.kalanKutuSayisiniAl());
		
		// for ile  tek seferde  kutu ve para listesi olusturma 
		
		for ( int i=0; i<10; i++) { // for her calistiginda nesne urettik 
			
			Kutu kutu=new Kutu();
			
			kutu.setKutuNumarasi(i+1);//1 2 3 4 5 6 7 8 9 10 tane kutu sayisi // kutu uretturk set methodu ile 
			kutu.setKutudakiParaMiktari(paraListesi.get(i));// para koyduk set ile 
			// olusturdugumuz  
			  kutular.kutuEkle(kutu);
			
//			System.out.println("Kutu No :"+(i+1)+" Para Miktari :"+paraListesi.get(i));
//			
//			System.out.println(kutular.kalanKutuSayisiniAl());// Kutular classindan cagirdik 
//			System.out.println(kutular.kutulardakiToplamPara());
//			System.out.println(kutular.acilmamisKutulariGoster());
//			
//			kutular.secilenKutuyulistedenKaldir(5);
//			
//			System.out.println(kutular.kalanKutuSayisiniAl());// Kutular classindan cagirdik 
//			System.out.println(kutular.kutulardakiToplamPara());
//			System.out.println(kutular.acilmamisKutulariGoster());
//			
		}
		
	}

}
