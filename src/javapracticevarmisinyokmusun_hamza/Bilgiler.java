package javapracticevarmisinyokmusun_hamza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilgiler {

	static List<String> isimler = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		
		isimler.add("Ramazan");
		isimler.add("İbrahim");
		isimler.add("İskender");
		isimler.add("Ali");
		
		System.out.println(isimler.toString());// bu sekilde de listler yazdirilabilir 
		
		
		
		Collections.shuffle(isimler);// list elemenalarini  rastgele yazdirmak icin yada karistirmak icin kullanlir 
		System.out.println(isimler.toString());
		
		//ArrayList ile obje tutma 
		
		List<Kutu> kutular=new ArrayList<>();
		Kutu kutu=new Kutu();// Kutu class olusturuldu yoksa compile time error veriri
		kutular.add(kutu);
		
		// Override islemi 
		
		Child childNesnesi= new Child();// nesen uretmek istedigimiz zaman 
		System.out.println(childNesnesi.toString());
		childNesnesi.parentIsimYazdir();
		
		

	}

}
