package calisma2;

import calisma1.dikucgenmetot;
import calisma1.islemler;

public class dikucgenuygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c;
		double cevre,alan ;
		
		islemler.yaz("1. kenarı giriniz:");
		a=islemler.okuDouble();
		islemler.yaz("2. kenarı giriniz:");
		b=islemler.okuDouble();
		
		
		/*c=hipotenus(a,b);         //Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		cevre=cevre_hesapla(a,b);  //a+b+c;
		alan=alan_hesapla(a,b);   //a*b/2; */
		
		dikucgenmetot ucgen1=new dikucgenmetot(a,b);
		ucgen1.deger_ata(a,b);
		ucgen1.hipotenus();
		ucgen1.cevre_hesapla();
		ucgen1.alan_hesapla();
		c=ucgen1.hipotenus_al();
		cevre=ucgen1.cevre_al();
		alan=ucgen1.alan_al();
		
		islemler.yaz("Dik Üçgenin Hipotenüsü:"+c);
		islemler.yaz("Dik Üçgenin Çevresi:"+cevre);
		islemler.yaz("Dik Üçgenin Alanı:"+alan);
		
		
	}
		
}



