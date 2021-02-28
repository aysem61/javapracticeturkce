package javapracticeda6;

public class StaticVariable {

	
	static int num1=15;
	       int num2= 15;
	       
	       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
	    Iki tane instance int variable olusturunuz ve biri static digeri non-static olsun
	    sonra bu class tan iki farkli object olusturunuz
	    Her objectle instance variable lara rakam ekleyiniz
	    */
	      
	        StaticVariable obj1 = new StaticVariable();
	        
	        
	        
	        obj1.num1 += 15;
	        obj1.num2 +=15;
	        
//	      System.out.println(obj1.num1);
//	      System.out.println(obj1.num2);
	        
	        StaticVariable obj2 = new StaticVariable();
	        
	        obj2.num1 += 15;
	        obj2.num2 += 15;
	        
	        System.out.println(obj2.num1);
	        System.out.println(obj2.num2);
	        
	        StaticVariable obj3 = new StaticVariable();
	        
	        obj3.num1-=10;
	        obj3.num2+=5;
	        System.out.println(obj3.num1+"ikinci numara:"+obj3.num2);
	        
	        
	        
	        
	    }


	}


