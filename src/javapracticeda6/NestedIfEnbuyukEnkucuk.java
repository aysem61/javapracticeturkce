package javapracticeda6;

import java.util.Scanner;

public class NestedIfEnbuyukEnkucuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Kullanicidan 3  numara isteyiniz  ve bu numalarin  en buyuk ve en kucuk olanlarini  console  yazdiriniz
		
		Scanner sc=new Scanner(System.in);
		
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        
        if(num1 >= num2  && num1 >= num3) {
            System.out.println(num1+" en buyuk sayidir");
            
            if(num2 >= num3) {
                System.out.println(num3+" en kucuk sayidir");
            }else {
                System.out.println(num2+" en kucuk sayidir");
            }
        }else if(num2 >= num1 && num2 >= num3) {
            
            System.out.println(num2 +" en buyuk sayidir");
            
            if(num1 >= num3) {
                System.out.println(num3+" en kucuk sayidir");
            }else {
                System.out.println(num1 +" en kucuk sayidir");
            }
            
        }else if (num3>=num1 && num3>num2) {
        	System.out.println(num3+" en buyuk sayidir");
        }if (num2>=num1) {
        	System.out.println(num1+" en kucuk sayidir");
        }else {
        	System.out.println(num3+ " en kucuk sayidir ");
        }

        
        

 
	}
}
