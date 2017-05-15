package prodCons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
	private List<Integer> coada = new ArrayList<Integer>();
	private final int maxSize = 10;
	private Semaphore semaphore = new Semaphore(1);
	
	public void  Produce(int produs)
	{
		
		try {
			
			semaphore.acquire();
			
			if(coada.size()<maxSize)
			{
				coada.add(produs);
				System.out.println("S-a produs elementul :" + produs);
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		} 
		finally {
			semaphore.release();
		} 
			
		
		
	}
	
	public void Consuma()
	{
		
		try {
			
			semaphore.acquire();
			if(!coada.isEmpty())
			{
				System.out.println("Consuma elementul " + coada.get(0));
				coada.remove(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
			semaphore.release();
		}
		
		
	}
	
	
}
