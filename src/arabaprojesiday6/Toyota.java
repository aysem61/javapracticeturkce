package arabaprojesiday6;
public class Toyota extends  Car{
    
    
    protected   String make = "Toyota";
    protected   String model = "Corolla";
    protected    int year = 2009;
    
    
    
    public Toyota () {
    	
    }
    
    public Toyota (String model , int year) {
        
        this.model = model;
        this.year = year;
        
    }
    
    public static void main(String[] args) {
        /*
        Honda newHonda = new Honda();
        System.out.println("Arabanin markasi: "+newHonda.arabaMarkasi());
        System.out.println("Arabanin modeli: "+newHonda.arabaModeli());
        System.out.println("Arabanin yili: "+newHonda.arabaYili());
        */
        
        
        
        Toyota araba1 = new Toyota();
        /*
        System.out.println("Arabanin markasi: "+araba1.arabaMarkasi());
        System.out.println("Arabanin modeli: "+araba1.arabaModeli());
        System.out.println("Arabanin yili: "+araba1.arabaYili());
        */
        Toyota araba2 = new Toyota("Camry", 2013);
        
        System.out.println("Arabanin markasi: "+araba2.arabaMarkasi());
        System.out.println("Arabanin modeli: "+araba2.arabaModeli());
        System.out.println("Arabanin yili: "+araba2.arabaYili());
        
    }
    
    public  String arabaMarkasi() {
        
        return make;
    }
    
    public  String arabaModeli() {
        
        return model;
    }
    
    public  int arabaYili() {
        
        return year;
    }



}
