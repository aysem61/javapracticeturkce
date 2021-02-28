package javapracticeday7;

public class Hasta {

	/*
    3 instance variable olusturunuz
    getter ve setter olusturyorsunuz
    String isim
    String soyIsim
    Case actualCase ;
    */

	
	private String isim;
	private String soyIsim;
    private Case suankiDurum;  // Case  bir  objectir  ve  onu da String gibi cahirabiliriz 
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public Case getSuankiDurum() {
		return suankiDurum;
	}
	public void setSuankiDurum(Case suankiDurum) {
		this.suankiDurum = suankiDurum;
	}
    
     
	
	

    
	
    
}
