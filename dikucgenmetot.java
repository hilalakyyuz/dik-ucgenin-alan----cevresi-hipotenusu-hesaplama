package calisma1;

public class dikucgenmetot {
	
	public double a,b,c;
	public double cevre,alan;
	
	public dikucgenmetot()
	{
		this.a=3;
		this.b=4;
	}
	public dikucgenmetot(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public void deger_ata(double a,double b) 
	{
		this.a=a;
		this.b=b;
	}
	public void hipotenus() 
	{
		c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
	}
	public void cevre_hesapla()
	{
		cevre=a+b+c;
	}
	public void alan_hesapla() 
	{
		alan=a*b/2;
	}
	public double hipotenus_al()
	{
		return c;
	}
	public double cevre_al()
	{
		return cevre;
	}
	public double alan_al()
	{
		return alan;
	}

}
