package opdracht03;
import java.util.Random;
import junit.framework.TestCase;

public class SnelheidOefening extends TestCase {

	/**
	 * @param args
	 */
	public static void main( String[] args){
		GetalRij gr = new GetalRij(100000, 200000);		
	}
	
	public void testOperations() throws Exception{
		
		GetalRij gr = new GetalRij(100000, 200000);
		
		try{
			Random random = new Random();
			//(range) + minimum
			int zoekWaarde = random.nextInt(200000) + 0;
			long start = System.currentTimeMillis();
			gr.zitErinA(zoekWaarde);
			long end = System.currentTimeMillis();
			System.out.println("De totaal verlopen tijd is: " + (end -start) + " seconden");
		}catch(Exception e){
			fail("Het getal is buiten bereik");
		}
	}

	
	// Hulpmethode voor tijdsbepaling
	private static long tijd(){
		return System.currentTimeMillis();
	}
}
