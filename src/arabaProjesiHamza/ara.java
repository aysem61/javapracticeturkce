package arabaProjesiHamza;

import java.util.Scanner;
public class AnaEkran1 {
	/*
	 * Galeri Uygulamasi
	 *
	 * arabaKayit(); arabaSatis(); arabaGuncelleme(); arabalariGoruntuleme();
	 */
	static Scanner scan = new Scanner(System.in);
	static Araba araba; 
	static int id;
	public static void main(String[] args) {
		VeriTabani veriTabani = new VeriTabani();
		
		while (true) {
			System.out.println("1- Araba kayit");
			System.out.println("2- Araba satis");
			System.out.println("3- Araba guncelleme");
			System.out.println("4- Arabalari goruntule");
			System.out.println("5- Sistemden cikis");
			System.out.println("Lutfen seciminizi yapiniz.");
			int secim = scan.nextInt();
			if (secim == 5) {
				System.out.println("Sistemden basariyla ciktiniz.");
				break;
			} else if (secim == 1) {
				aracOlustur();
				veriTabani.arabaKayit(araba);
			} else if (secim == 2) {
				System.out.println("Lutfen satilan aracin id sini giriniz.");
				int id = scan.nextInt();
				veriTabani.arabaSatis(id);
			} else if (secim == 3) {
				System.out.println("Lutfen arac guncellemek icin: ");
				veriTabani.arabaGuncelleme(id, araba);
			}else if(secim==4) {
				veriTabani.arabalariGoruntuleme();
			}
		}
	}
	public static void aracOlustur() {
		System.out.println("Lutfen aracin id sini giriniz.");
		int id = scan.nextInt();
		System.out.println("Lutfen aracin max hizini sini giriniz.");
		int maxHiz = scan.nextInt();
		System.out.println("Lutfen aracin yilini giriniz.");
		int yil = scan.nextInt();
		System.out.println("Lutfen marka giriniz : ");
		String marka = scan.next();
		System.out.println("Lutfen vites giriniz : ");
		String vites = scan.next();
		System.out.println("Lutfen renk giriniz : ");
		String renk = scan.next();
		araba = new Araba(id, maxHiz, yil, marka, vites, renk);
	}
}