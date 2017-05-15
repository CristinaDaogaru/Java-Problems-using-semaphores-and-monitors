package prodCons;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Buffer buffer = new Buffer();
		
		 Producator producator1 = new Producator(buffer, 1);
		 Producator producator2 = new Producator(buffer, 2);
			
			Consumator consumator1 = new Consumator(buffer);
			Consumator consumator2 = new Consumator(buffer);
			
			producator1.start();
			producator2.start();
			
			consumator1.start();
			consumator2.start();
		
		
		
		
	}

}
