package Tajmer;

public class Tajmer extends Thread 
{
	int vremeAktivacije;
	String naziv;

	public Tajmer(String n, int v)
	{
		this.naziv = n;
		this.vremeAktivacije = v;
	}

	public void run()
	{
		do
		{
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException joj)
			{
				joj.printStackTrace();
			}
			if (vremeAktivacije <= 3)
				System.out.println(vremeAktivacije + "...");
			this.vremeAktivacije--;
			//this.vremeAktivacije -= 1
			//this.vremeAktivacije = this.vremeAktivacije - 1
		} while (this.vremeAktivacije > 0);
		System.out.println("Podsetnik: " + this.naziv);
		System.out.println("BRRRRRRRRRRRRRRRR");
	}
}
