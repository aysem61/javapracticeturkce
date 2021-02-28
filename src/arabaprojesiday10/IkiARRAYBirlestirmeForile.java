package arabaprojesiday10;

import java.util.Arrays;

public class IkiARRAYBirlestirmeForile {

	public static void main(String[] args) {
	
		/* İki farklı Array'i birleştiren ve oluşturduğu yeni Array'i return eden
		 * bir method yazınız.
		 * 
		 * getBirlestirilmisArray(int[] array1, int[] array2)
		 * 	return yeniArray;
		 * 
		 * [1,2,3] ve [5,6,7]
		 * 
		 * [1,2,3,5,6,7]
		 * 
		 * 3 dk süre verelim.
		 * 
		 * */
		
		int[] array1 = {1,2,3};
		int[] array2 = {5,6,7};
		int[] yeniArray = getBirlestirilmisArray(array1,array2);
		System.out.println(Arrays.toString(yeniArray));


	}
	
	private static int[] getBirlestirilmisArray(int[] array1, int[] array2) {
		
		int uzunluk = array1.length + array2.length;
		
		int[] yeniArray = Arrays.copyOf(array1, uzunluk); // Copy eder 
		
		for(int i = 0; i < array2.length ; i++) { 
			yeniArray[array1.length+i] = array2[i];
		}
		return yeniArray;
		
	}


}
