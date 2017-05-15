package prodCons;

import java.util.ArrayList;
import java.util.List;

public class Producator extends Thread{

	private Buffer coada;
	private int produs;
	
	
	public Producator(Buffer coada,int produs)
	{
		this.coada=coada;
		this.produs = produs;
	}
	@Override
	public void run()
	{
		int i=0;
		try {
			while(true){
				coada.Produce(produs);
				i++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}
