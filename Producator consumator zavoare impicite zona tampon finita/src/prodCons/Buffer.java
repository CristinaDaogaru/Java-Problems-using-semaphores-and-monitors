package prodCons;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
	private List<Integer> coada = new ArrayList<Integer>();
	private final int maxSize = 10;
	
	public synchronized void  Produce(int produs)
	{
		try {
			while (coada.size()==maxSize)
			{
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		coada.add(produs);
		System.out.println("S-a produs elementul :" + produs);
		notifyAll();
	}
	
	public synchronized void remove()
	{
		try {
			
			while(coada.size()==0)
			{
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Consuma elementul " + coada.get(0));
		coada.remove(0);
		notifyAll();
		
	}
	
	
}
