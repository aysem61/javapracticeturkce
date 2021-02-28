package arabaProjesiHamza;

import java.util.ArrayList;
import java.util.List;

public class VeriTabani implements IArabaIslemler {

	List<Araba>  arabalar=new ArrayList<>();
	
	@Override
	public void arabaKayıt(Araba araba) {
		arabalar.add(araba);
		
	}

	@Override
	public void arabaSatis(int id) {
		//id numarali araci arabalar listesinde nasil bulurum
		for(int i=0; i<arabalar.size(); i++) {
			Araba araba=arabalar.get(i);
			
			if(araba.getId()==id) {
				arabalar.remove(i);
			}
		}
		
		
	}

	@Override
	public void arabaGuncelleme(int id, Araba araba) {// id 11000  listedeki yerini degistir
		
		for (int i=0; i<arabalar.size(); i++) {
			
			Araba suankiBakilanAraba=arabalar.get(i);
			if(suankiBakilanAraba.getId()==id) {
				arabalar.set(i, araba);//guncelledik
				break;
			}
		}
		
		
	}

	@Override
	public void arabalariGoruntuleme() {
		
		for(Araba araba:arabalar) {
			
			System.out.println(araba.getId()+"-"+araba.getMarka()
										        +"-"+araba.getMaxHiz()+"-"
												+araba.getRenk()+"-"+araba.getVites()+"-"+araba.getYil());
		}
		
	}

	//abstract class ve interface in en buyuk farki 
	// abstrackt class kullanilirsa sadece bir tanere miras alinanbilir extends
	//interface kullilirsa  birden fazla interface  miras implement alinabilir 
	// eger  abstrack kullanirsak icinde ki tum medotlari abstrack ve digerleri override yapmak zorunda degiliz
	//eger interface kullanisak  tum medotlari override etmek zorundayiz 
	
}
