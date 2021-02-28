
package arabaprojesiday10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question05 {
	/* "ab" -> "aba" -> "kaba" -> "kabak" ->
	 * 
	 * 5 dk
	 * 
	 * */
	public static void main(String[] args) {
		List<String> kelimeler = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean devamMi = true;
		int siraKimde = 0;
		int oyunSayisi = 0;
		while(devamMi) {
			
			siraKimde = oyunSayisi % 2 + 1;  // 2.kullanıcı
			System.out.println(siraKimde +" Kullanıcı kelime yazınız : ");
			String kelime = scan.next();
			kelimeler.add(kelime);
			devamMi = getDevamMi(kelimeler); // false
			oyunSayisi++; // 1 2 3 4 5 6
		}
		int siraBelirle = siraKimde == 1 ? 2 : 1;
		System.out.println(siraBelirle + ". kullanıcı kazandı.");
		System.out.println(kelimeler);
	}
	private static boolean getDevamMi(List<String> kelimeler) {
		// yazılan kelime, bir önceki yazılan kelimeyi kapsıyor mu (kaba - kabak)
		// yazılan kelimenin uzunluğu ile bir önceki kelimenin uzunluğu farkı 1 mi
		if(kelimeler.size() < 2)
			return true;
		String sonKelime = kelimeler.get(kelimeler.size() - 1);
		String birOncekiKelime = kelimeler.get(kelimeler.size() - 2);
		if(sonKelime.length() - birOncekiKelime.length() != 1)
			return false;
		if(!sonKelime.contains(birOncekiKelime))
			return false;
		return true;
	}
}