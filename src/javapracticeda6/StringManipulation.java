package javapracticeda6;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String for = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		// I love Java//
		
		int ilkBosluk=cumle.indexOf(" ");//.......
		
		int sonuncuBosluk=cumle.lastIndexOf(" ");
		
		
     	//System.out.println(cumle.substring(7)+cumle.substring(1,6)+cumle.substring(0,1));
//		
		System.out.println(cumle.substring(sonuncuBosluk+1)+cumle.substring(ilkBosluk,sonuncuBosluk+1)+cumle.substring(0, ilkBosluk));
//		
	
		System.out.println();
		
		Scanner scan2=new Scanner(System.in);
        System.out.println("text giriniz");
        String str=scan2.nextLine();
       
        String arr[]=str.split(" ");
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

	}

}
