package prodCons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
	private List<Integer> coada = new ArrayList<Integer>();
	private final int maxSize = 10;
	private SemaphoreImpl semaphore = new SemaphoreImpl();
	
	public void  Produce(int produs)
	{
		
		try {
			
			semaphore.Aquaire();
			
			if(coada.size()<maxSize)
			{
				coada.add(produs);
				System.out.println("S-a produs elementul :" + produs);
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		} 
		finally {
			semaphore.Release();
		} 
			
		
		
	}
	
	public void Consuma()
	{
		
		try {
			
			semaphore.Aquaire();
			if(!coada.isEmpty())
			{
				System.out.println("Consuma elementul " + coada.get(0));
				coada.remove(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
			semaphore.Release();
		}
		
		
	}
	
	
}
