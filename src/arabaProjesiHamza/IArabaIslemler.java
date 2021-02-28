package arabaProjesiHamza;

public interface IArabaIslemler {

	 public void  arabaKayıt(Araba araba);//araba classinda olusan nesneyi gondermemiz gerekiyor ve ara cinsiden
	 public void  arabaSatis(int id);
	 public void  arabaGuncelleme(int id, Araba araba);
	 public void  arabalariGoruntuleme();
	
}
