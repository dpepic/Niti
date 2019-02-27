package Niti;

import java.io.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Nit novaNit = new Nit(500, 7);
		Nit novaNit2 = new Nit(3,4);
		novaNit2.start();
		novaNit.start();
		while (true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Unesi nesto sto cu da ignorisem :) : ");
			try 
			{
				br.readLine();
			} catch (IOException e) 
			{
				e.printStackTrace();
			} 
		}
	}
}
