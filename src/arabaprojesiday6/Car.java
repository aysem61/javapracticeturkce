package arabaprojesiday6;

/*
Bir class olusturunuz adi Car olsun
icerisinde 3 instance variable olsun 
protected String make ;
protected String model;
protected int year ;
Sonra 3 tane String return tipinden method olusturunuz
arabaMarkasi
arabaModeli
arabaYili
ve iki constructor olusturunuz 
1 parametreli
1 parametresiz
String model;
int year
Son olarak bir oject olusturup method lari main method da print ediniz 
*/


    public class Car {

	protected String make;
	protected String model;
	protected int    year;
	
	
	public Car() {// deafault  constructor 
		
	}
	
	public Car(String model, int year) { // parametreleri  constructor 
		this.model=model;
		this.year=year;
	}
	
//	public static void main(String[] args) {
//		
//
//	}
	
	public String arabaMarkasi() {// return type olan  method 
		return make;
	}

	public String arabaModeli() {
		return model;
	}
	public int arabaYili() {
		return year;
	}
}
