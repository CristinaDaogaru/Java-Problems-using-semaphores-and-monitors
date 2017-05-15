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
			//think
			if(furculitaStanga.Ridica())
			{
				if(furculitaDreapta.Ridica())
				{
					System.out.println("Filozoful: " + nrId + " mananca! ");
					try{
						Thread.sleep(100 + new Random().nextInt(1000));
					}
					catch(InterruptedException ex){ }
					
					furculitaDreapta.Lasa();
				}
				furculitaStanga.Lasa();
			}
			
			
		}
	}
}
