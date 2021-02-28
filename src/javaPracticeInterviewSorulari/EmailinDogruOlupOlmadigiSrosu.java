package javaPracticeInterviewSorulari;

import java.util.Scanner;

public class EmailinDogruOlupOlmadigiSrosu {

	public static void main(String[] args) {
		
		/* Girilen e-mailin doğru olup olmadığını anlayan bir method yazınız.
		 * Method boolean veri tipinde değer döndersin.
		 * 
		 * hamzayilmaz   // @   .   " "    2
		 * 
		 * getEmailDogruMu(String mail)
		 * 
		 * 
		 * ahmet beyin cozumu 
		 * 
		 *  boolean result =false;
        
        if (!eMail.contains("@")){
            
            result =  false;
        }else if(eMail.length()<10){
            
            result = false;
        }else if(!eMail.contains(".com")){
            
            result = false;
        }else if(eMail.contains("@")){
            
            int x = eMail.indexOf("@");
            
            if (x==0){
                result = false;
            }
            
        }else result = true;
        return result;

		 * 
		 * */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir email yaziniz");
		
		String email=scan.nextLine();
		
		boolean dogruMu=getEmaiDogrumu(email);
		
		System.out.println("Email "+dogruMu);

	}
	private static boolean getEmaiDogrumu(String email) {
		
		
		if (!email.contains("@"))
			return false;
		if(!email.contains("."))
			return false;
		if(email.length()<=4)
			return false;
		
		
		String arr[]=email.split("@"); // emaili iki parcaladik @ isateinden 
		
		if(arr[0].length()<1)
			return false;
		if(arr[1].length()<3)
			return false;
		if(arr.length>2)
			return false;
		
		     return true;
		
		
		
		
	}

}
