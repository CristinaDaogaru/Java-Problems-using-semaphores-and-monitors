package prodCons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
	private List<Integer> coada = new ArrayList<Integer>();
	private final int maxSize = 10;
	private Lock lock = new ReentrantLock();
	
	public void  Produce(int produs)
	{
		lock.lock();
		try {
			
			if(coada.size()<maxSize)
			{
				coada.add(produs);
				System.out.println("S-a produs elementul :" + produs);
				
			}
			
		} finally {
			lock.unlock();
		} 
			
		
		
	}
	
	public void Consuma()
	{
		lock.lock();
		
		try {
			
			if(!coada.isEmpty())
			{
				System.out.println("Consuma elementul " + coada.get(0));
				coada.remove(0);
			}
		} finally {
			
			lock.unlock();
		}
		
		
	}
	
	
}
