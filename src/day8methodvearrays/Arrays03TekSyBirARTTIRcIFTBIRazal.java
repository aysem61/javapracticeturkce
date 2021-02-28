package day8methodvearrays;

import java.util.Arrays;

public class Arrays03TekSyBirARTTIRcIFTBIRazal {

	public static void main(String[] args) {
		 //Array içerisindeki tek sayıları 1 artırıp çift sayıları 1 azaltan
        //java methodu yazalım

		
		int arr[]= {1,2,4,5,6,7,8};
		
		System.out.println("donusumden once ki array hali :"+Arrays.toString(arr));
		
		System.out.println("donusumden sonra cift ve teklerin artmis ve azalmis hali :"+Arrays.toString(donusum(arr)));
		
		
	}

	public static int[] donusum(int [] a){
		
		for(int i=0; i<a.length; i++  ) {
			
			if (a[i]%2==0) {
				a[i]=a[i]-1;
			}else {
				a[i]=a[i]+1;
			}
		}
		return a;
	}
}
