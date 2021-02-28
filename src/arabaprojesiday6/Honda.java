package arabaprojesiday6;

public class Honda extends Car{

	protected String make ="Honda";// instance variable 
	protected  String model="Accord";
	protected  int year=2012;
	
    public Honda() {
		
	}
	
    public Honda(String model, int year) {
		this.model=model;
		this.year=year;
	}
		
	public static void main(String[] args) {
//	
//		/*
//	    Bir class olusturunuz adi Honda olsun
//	    icerisinde 3 instance variable olsun 
//	    protected String make = "Honda";
//	    protected String model = "Accord";
//	    protected int year = 2012;
//	    Sonra 3 tane String return tipinden method olusturunuz
//	    arabaMarkasi
//	    arabaModeli
//	    arabaYili
//	    Son olarak bir oject olusturup method lari main method da print ediniz  metod olustur dedi bu hoca ...
//	    
//	    */
//		System.out.println(marka());
//		System.out.println(model());
//		System.out.println(year());
//		
//		
		Honda  newHonda=new Honda();
		System.out.println("arabanin markasi"+newHonda.make);
		System.out.println("arabanin modeli"+newHonda.model);
		System.out.println("arabanin yili:"+newHonda.year);
	
		Honda honda2=new Honda("Civic",2014);
		
		System.out.println("arabanin markasi"+honda2.arabaMarkasi());
		System.out.println("arabanin modeli"+honda2.arabaModeli());
		System.out.println("arabanin yili:"+honda2.arabaYili());
	}
	
	
	@Override
	public     String  arabaMarkasi() {
		return  make;
	}
	@Override
   public   String  arabaModeli() {
		return model;
	}
	@Override
   public   int  arabaYili() {
		return year;
	}

   
   
}
