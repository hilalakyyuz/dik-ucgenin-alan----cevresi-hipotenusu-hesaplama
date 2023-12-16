package calisma1;

import java.util.Scanner;

public class islemler {
		public static void yaz(String gelen)//metod
		{
			System.out.println(gelen);
		}
		
	 public static void yaz(int gelen)//metod
		{
			System.out.println(gelen);
			
			
		}
	 public static void yaz(double gelen)//metod
		{
			System.out.println(gelen);
		}
		
	public static void yaz(float gelen)//metod
		{
			System.out.println(gelen);
		}


	 public static int okuDouble()
	{
	 Scanner klavye=new Scanner(System.in);
	 return klavye.nextInt();
	}

	 public static String oku()
	{
	 Scanner klavye=new Scanner(System.in);
	 return klavye.nextLine();
	}

}
