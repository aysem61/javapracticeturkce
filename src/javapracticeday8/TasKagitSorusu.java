package javapracticeday8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kazanmaSayisiKullanici=0;
		int kazanmaSayisiBilgisayar=0;
		int bitis=3;
		Scanner scan=new Scanner(System.in);
		
		List<String> liste= new ArrayList<>();
		liste.add("Tas");
		liste.add("Makas");
		liste.add("Kagit");
		System.out.println("Tas =0 ,Makas =1, Kagit =2");
		// 3                             3       1                     3
		while( kazanmaSayisiBilgisayar<bitis&& kazanmaSayisiKullanici<bitis ) {
		//     	
			int bilgisayarinTahmini=new Random().nextInt(3);//0 1 2 
			System.out.println(liste.get(bilgisayarinTahmini));
			
			
			System.out.println("lutfen tahmininizi yaziniz");
			int kullanicininTahmini=scan.nextInt();
			System.out.println("Bilgisayar :"+liste.get(bilgisayarinTahmini));
			System.out.println("Kullanici :"+liste.get(kullanicininTahmini));
			
			if(bilgisayarinTahmini==kullanicininTahmini) {
				System.out.println("Beraberlik !");
			}
			
			
		}
			
	}

}
