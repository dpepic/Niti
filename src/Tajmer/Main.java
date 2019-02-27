package Tajmer;

import java.io.*;

public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			while (true)
			{
				System.out.println("Unesite naziv za podsetnik: ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String naziv = br.readLine();
				System.out.println("Unesite vreme za koje hocete podsetnik, u sekundama: ");
				int vreme = Integer.parseInt(br.readLine());
				
				(new Tajmer(naziv, vreme)).start();	
			}
		} catch (IOException joj)
		{
			joj.printStackTrace();
		}
	}
}
