package opdracht03;
import junit.framework.TestCase;

public class SnelheidOefening extends TestCase {

	/**
	 * @param args
	 */
	public static void main( String[] args){
		GetalRij gr = new GetalRij( 100000, 200000);
	}

	// Hulpmethode voor tijdsbepaling
	private static long tijd(){
		
		return System.currentTimeMillis();
	}

}
