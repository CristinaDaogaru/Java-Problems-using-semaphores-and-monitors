package zavoare;

public class Cina {

	private Filozofi filozofi[] = new Filozofi[5];
	private Furculita furculite[] = new Furculita[5];
	
	public Cina()
	{
		for(int i= 0;i<5;i++)
		{
			furculite[i] = new Furculita();
		}
		filozofi[0] = new Filozofi(0, furculite[0], furculite[1]);
		filozofi[1] = new Filozofi(1, furculite[1], furculite[2]);
		filozofi[2] = new Filozofi(2, furculite[2], furculite[3]);
		filozofi[3] = new Filozofi(3, furculite[3], furculite[4]);
		filozofi[4] = new Filozofi(4, furculite[4], furculite[0]);
	}
	
	public void Start()
	{
		for(int i=0;i<5;i++){
			filozofi[i].start();
		}
	}
}
