package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hasta hasta1=new Hasta();
		
	

		Case durum=new Case();
		durum.setActualCase("romatizma");// set ile ne konursa  get ile o okunubailir 
		durum.setEmergency("normal");
		
		hasta1.setIsim("Nevzat");
		hasta1.setSoyIsim("toprak");
		hasta1.setSuankiDurum(durum);
		
		
		System.out.println("Hastanin ismi :"+hasta1.getIsim());
		System.out.println("Hastanin soyismi :"+hasta1.getSoyIsim());
		System.out.println("Hastanin su anki durumu :"+hasta1.getSuankiDurum().getActualCase());  //  getSuankiDurum().getActualCase()  yapilmali 
		System.out.println("Hastanin aciliyet durumu :"+hasta1.getSuankiDurum().getEmergency()); //  durum  objesi ile  case  clasinda ki  caseler  cahgrildi kopri gibi
		
		
//		System.out.println("su an ki durum :"+durum.getActualCase());
//		
//		System.out.println("Aciliyet durumu: "+durum.getEmergency());
//		
		
	}

}
