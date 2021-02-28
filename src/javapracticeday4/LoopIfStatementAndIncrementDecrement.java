package javapracticeday4;

public final class LoopIfStatementAndIncrementDecrement {

	public static void main(String[] args) {
		/*bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle olmalidir;
        
         1_uzunlugu => en az 8 karakter (chars) olmalidir
         2_icinde sadece alfabetik karakterler bulunmalidir
           bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
         
         1_uzunlugu => en az 10 karakter(chars) olmalidir
         2_en az 1 sembol bulundurmali
         3_en az 1 numara bulundurmali
         4_en az buyuk harf olmalidir
         5_en az bir kucuk harf olmalidir
		 * 
		 */
		
		String userName="SelimTopbas ".toLowerCase(); //length of the userName =5 
		
		int count=0;
		
		if (userName.length() >=8) {
			
			for (int i=0; i<userName.length(); i++) {
				char temp=userName.charAt(i);
				if(!(temp >='a') && !(temp <='z')){
					count++;
				}
				
			}
			if (count==0) {
				System.out.println("Olusturdugunuz userName basarili bir sekilde isleme gecmistir");
			}else {
				System.out.println("User name  basarili bir sekilde olusmamistir ");
				System.out.println("lutfen tekrar deneniniz");
			}
		}else {
			System.out.println("userName length yetersizdir");
			System.out.println("lutfen tekrar deneyiniz");
		}
		
		
		

	}

}
