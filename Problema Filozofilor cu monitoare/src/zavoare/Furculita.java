package zavoare;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Furculita {

	private Object obj1 = new Object();
	private Object obj2 = new Object();
	private int id;
	
	Furculita(int id)
	{
		this.id=id;
	}
	public void Ridica()
	{
		synchronized(obj1)
		{ 
			try {
			
				wait();
			
			} catch (Exception e) {
			// TODO: handle exception
				System.out.println(e.getMessage());
			}
			System.out.println("S-a ridicat furculita: " + id);
		}
	}
	
	public void Lasa()
	{
		synchronized(obj2)
		{ 
			System.out.println("S-a lasat furculita: " + id);
			notifyAll();
			
		
			
		}
	}
	
	
}
