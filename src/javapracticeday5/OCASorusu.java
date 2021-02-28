package javapracticeday5;

public class OCASorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String str = "M ";//M 
	    
        str = str.concat("E ");//M E 
        
        String add = "S ";//S 
        
        str = str.concat(add);//M E S 
        
        str.replace("S","T");
        
        str = str.concat(add);//M E S S
        
        System.out.println(str);
/*
        Netice nasil olur?
        */
		
        
        String names="Aydin Erkan Bayram Ersin";
        
        names+=names.replace("Erkan","");
        
        System.out.println(names);
        
        String name="Cevdet";
        
        name+=" Ahmet";
        
        System.out.println(name);
        
        int num=23;
        
        num=num+12;
        num +=5;
        
        System.out.println(++num);//  ++ onune koyunca  soldan okudundu icin   preincrement olur ve direkt rakam eklenir 
        
          // ama akabinde  sonrasinda  ++ konulursa  ikinci run edilis  artis olur 
        
        
        int num2=32;
        
        num2=12;
        
        System.out.println(num2);
	}

}
