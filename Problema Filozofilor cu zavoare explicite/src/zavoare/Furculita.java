package zavoare;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Furculita {

	private Lock lock = new ReentrantLock();
	
	public boolean Ridica()
	{
		return lock.tryLock();
		
	}
	
	public void Lasa()
	{
		lock.unlock();
	}
	
	
}
