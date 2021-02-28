package javapracticeday5;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Kullanicidan bie email adresi isteyiniz  eger  email de "hotmail" varsa  "gmail" ile  degistirebilirsiniz
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		
		String email=scan.nextLine();
		
		if (email.contains("hotmail")) {
			
	      String		yeni=email.replaceAll("hotmail", "gmail");
	      System.out.println(yeni);
		}
		
	}

}
