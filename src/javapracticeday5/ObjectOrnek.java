package javapracticeday5;

public class ObjectOrnek {

	public static void main(String[] args) {
		// 
		
		StringBuilder stb=new StringBuilder();
		
		//
		stb.append("bayram");
		System.out.println(stb.equals(stb.reverse()));// bayram 
		System.out.println(stb.equals(stb.reverse().toString()));// butun strinler  farkli deger tasir ve kiyaslanmaz
		// hashCode vardir 
		
        StringBuilder stb2  = new StringBuilder();
        
        stb2.append("aba").append("aba");
        System.out.println(stb2.toString().equals(stb2.reverse().toString())); // Iki degeri bir biryle karsilastiriyoruz
        

		
		
		
		System.out.println(stb.hashCode());//  onu tanimlayan bir rakamdir  bir adres onun icin  reverse  kullanmak zararli olabilir ayri seyleri ayni code dolayi  ayni gosterir
		
		
		String name="Mahmut";
		String name2="Mahmut";
		
		
		System.out.println(name.equals(name2));// degeri karsilastiryoruz // primitivler de rakam yada yazilarda  deger karsilastima boyle yapilir
		
		

	}

}
