package prodCons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SemaphoreImpl {

	private Lock lock = new ReentrantLock();
	
	public void Aquaire()
	{
		lock.lock();
	}
	public void Release()
	{
		lock.unlock();
	}
}
