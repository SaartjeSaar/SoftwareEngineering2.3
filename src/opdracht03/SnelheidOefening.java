package opdracht03;
import java.util.Random;

import junit.framework.TestCase;

public class SnelheidOefening extends TestCase {

	/**
	 * @param args
	 */
	public static void main( String[] args){
		GetalRij gr = new GetalRij( 100000, 200000);
		Random random = new Random();
		//(range) + minimum
		int zoekWaarde = random.nextInt(100001) + 100000;
		gr.zitErinA(zoekWaarde);		
		
	}

	
	// Hulpmethode voor tijdsbepaling
	private static long tijd(){
		return System.currentTimeMillis();
	}
}
