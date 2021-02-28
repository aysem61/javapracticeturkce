package javapracticeday5;

public class MethodOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Bir method olusturunuz charSayisi ve 2 parameter ekleyiniz
		1- char
		2- String
		char ch = 'p';
		Strng str = “Ingilizce’de purple mor ve people insanlar demektir";
		int count = 0;
		Yukaridaki String te elinizdeki char ne kadar tekrar etmisse o kadar return etsin
		for loop, increment ve if statements kullanabilirsiniz
		*/
		
		System.out.println(	charSayisi("isim",'c'));
	
		//charSayisi2("sss",'d');
        char ch='p';
		
		String str="Ingilizce de purple mor ve peopel insanlar";
		
	     System.out.println(charSayisi(str,ch));
		
	}
	
	public static int   charSayisi(String str,char ch) {
	
		int count=0;
		 
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
		} return count; 
		
		
	}
   
	//public static void   charSayisi2(String str,char ch) {
		
	//	System.out.println(1);
		
		
	//}

}
