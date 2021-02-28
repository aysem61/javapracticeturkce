package arabaprojesiday6;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub= 
		
		// Car araba1= new Toyota();  =====> sag tarafta  obje  olusur  sol tarafta  referebce type olusur 
		
		Car araba1=new Honda();// polimorphzmis bu dur  referrence  farkli  objec farkli 
		System.out.println(araba1.arabaMarkasi());
		System.out.println(araba1.arabaModeli());
		System.out.println(araba1.arabaYili());
		
		Car araba3=new Honda("Jazz",2020);//  hoca da orasi araba2  seklinde yazili ben  araba3  yaptim 
		System.out.println(araba3.arabaMarkasi());
		System.out.println(araba3.arabaModeli());
		System.out.println(araba3.arabaYili());
		
//		Honda araba4=new Honda();
//		araba4.
		
		Car araba2=new Toyota();// polymorphism sekli 
		System.out.println(araba2.arabaMarkasi());
		System.out.println(araba2.arabaModeli());
		System.out.println(araba1.arabaYili());
		
		
		
	}

}
