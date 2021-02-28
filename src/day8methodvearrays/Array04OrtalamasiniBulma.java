package day8methodvearrays;

public class Array04OrtalamasiniBulma {

	public static void main(String[] args) {
		

		//Array listesinin ortalamasını bulan java kodunu bulalım
		
		int num[]= {20,30,25,32,-15,11};
		
		int sum=0;
		
		double ort=0;
		
		for ( int i=0; i<num.length; i++ ) {
			sum=sum+num[i];
		}
		
		ort=sum/num.length;
		System.out.println("Array elemanlarinin ortalamasi :"+ort);
	
	}

}

