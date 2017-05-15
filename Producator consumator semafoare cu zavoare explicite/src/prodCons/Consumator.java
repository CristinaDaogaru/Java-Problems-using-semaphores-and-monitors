package prodCons;

import java.util.ArrayList;
import java.util.List;

public class Consumator extends Thread {

	private Buffer coada;
	private int consumator;
	public Consumator(Buffer coada)
	{
		this.coada = coada;
		
	}
	 @Override
	public void run()
	{
		try {
			while(true){
		     coada.Consuma();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
		
}
