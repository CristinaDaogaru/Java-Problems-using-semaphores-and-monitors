package zavoare;

import java.util.Random;

public class Filozofi extends Thread{

	private int nrId;
	private Furculita furculitaStanga;
	private Furculita furculitaDreapta;
	
	public Filozofi(int nrId,Furculita furculitaStanga,Furculita furculitaDreapta)
	{
		this.nrId = nrId;
		this.furculitaStanga = furculitaStanga;
		this.furculitaDreapta = furculitaDreapta;
	}
	
	public void run()
	{
		while(true)
		{
					System.out.println("Filozoful: " + nrId + " mananca! ");
					furculitaStanga.Ridica();
					furculitaDreapta.Ridica();
					try{
						Thread.sleep(100 + new Random().nextInt(1000));
					}
					catch(InterruptedException ex){ }
					furculitaStanga.Lasa();
					furculitaDreapta.Lasa();
		}
	}
}
