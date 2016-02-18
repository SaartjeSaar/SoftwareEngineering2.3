package opdracht03;
import java.util.Random;
import junit.framework.TestCase;

public class SnelheidOefening extends TestCase {

	/**
	 * @param args
	 */
	public static void main( String[] args){
		GetalRij gr = new GetalRij(100000, 200000);	
		//getalA
		Random random = new Random();
		//(range) + minimum
		int zoekWaarde = random.nextInt(200000) + 0;
		long startA = System.currentTimeMillis();
		gr.zitErinA(zoekWaarde);
		long endA = System.currentTimeMillis();	
		System.out.println("De totaal verlopen tijd A is: " + (endA -startA) + " milliseconden");
		
		//getalB
		random = new Random();
		//(range) + minimum
		zoekWaarde = random.nextInt(200000) + 0;
		long startB = System.currentTimeMillis();
		gr.zitErinB(zoekWaarde);
		long endB = System.currentTimeMillis();
		System.out.println("De totaal verlopen tijd B is: " + (endB -startB) + " milliseconden");	
	}
	
	// Hulpmethode voor tijdsbepaling
	private static long tijd(){
		return System.currentTimeMillis();
	}
}
