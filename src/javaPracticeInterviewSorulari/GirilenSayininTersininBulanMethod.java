package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class GirilenSayininTersininBulanMethod {

	public static void main(String[] args) {
		
		/*Girilen sayinin tersini  bulan bir method yaziniz . return edece
		 * 
		 * getSayininTersi(int sayi)
		 * 
		 * 
		 *  
		 *  
		 *  Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        String sayi = scan.next();
        String rvs = "";
        for (int i = sayi.length()-1; i>=0; i--) {
            rvs = rvs+ sayi.charAt(i)+"";
        }
        
        System.out.println(rvs);
    }

		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz : ");
		int sayi = scan.nextInt();
		int ters = sayininTersi(sayi);

		
		System.out.println(sayininTersi(123));
	}

	public static int sayininTersi(int n) {
		 
		int sonuc = 0;
		
		while(n>0) {
			
			int sayi=n%10;// birler basamagini almak icin //  4				5		   6
			
		                                                  //  65			6		   0	
			n/=10;         // sayiyi 10 olarek birler basamagindan kurtulmak 
			                                              
			                                             // 0*10 + 4 = 4;    45	   456 
			sonuc= sonuc*10+sayi;
		}
		
		return sonuc;
	}
}
