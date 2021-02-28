package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class PolidromTersiIleKendisi {

	public static void main(String[] args) {
		/*	Girilen sayı ya metnin polindrom olup olmadığını kontrol eden bir method yazınız.
		 *  method boolean olarak bir değer return etsin.
		 *  
		 *  getPolindrom(String metin)
		 *  
		 *    System.out.println(isPolindrom("EdipPide"));
		 *  
		 *   private static boolean isPolindrom(String str) {
		 *   
        String ters = "";
       
        for (int i = str.length()-1; i >= 0; i--) {
            ters +="" + str.charAt(i);
        }
        return (str.equals(ters));
        
        
        
        //////////////////////////////////////////////////////////// bu da ikinci cozum 
         * 
         * 
         * private static boolean getPolindromYeni(String word) {
		String wordTers = "";
   		boolean ne = false;
   		for(int i = word.length()-1; i>=0; i--) {
   			wordTers = wordTers + word.charAt(i);
   		}
   		if(wordTers.equalsIgnoreCase(word)) {
   			ne = true;
   		}else {
   			ne = false;
   		}  	
   		return ne;
	}

        
        
    }

		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir ifade yaziniz");
		
		String ifade=scan.nextLine();
		
		
		if(getPolidrom(ifade.toLowerCase())) {
			System.out.println("Polidrom");
		}else {
			System.out.println("Polidrom degil");
		}

	}

	public static boolean getPolidrom(String ifade) {
		
		int i=0;
		int j=ifade.length()-1;
		
		while(i<j) {
			if(ifade.charAt(i)!=ifade.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		return  true;
		
	}

}
