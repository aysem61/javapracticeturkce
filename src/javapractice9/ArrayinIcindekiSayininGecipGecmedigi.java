package javapractice9;

public class ArrayinIcindekiSayininGecipGecmedigi {


		/* Array'in içerisinde aradığımız sayının geçip geçmediğini bulan bir method yazınız.
		 *  getVarMi(int[] array)
		 *  	return true/false
		 *  
		 *  Örnek : 12, 56, 4, 8, 20, 876
		 *  
		 *  süre 2dk
		 * 
		 * */
		public static void main(String[] args) {
			
			int[] sayilar = {12, 576, 4, 8, 20, 86}; // 7
			System.out.println(getVarMi(sayilar));
	}
		
		private static boolean getVarMi(int[] sayilar) {
			
			for(int i = 0 ; i < sayilar.length ; i++) {
				if(String.valueOf(sayilar[i]).contains("7"))
					return true;
			}
			
			return false;
		}

}
