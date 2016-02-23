package opdracht03;
<<<<<<< HEAD
import junit.framework.TestCase;
=======
import java.util.Random;
>>>>>>> branch 'master' of https://github.com/SaartjeSaar/SoftwareEngineering2.3.git

public class SnelheidOefening extends TestCase {

	/**
	 * @param args
	 */
	public static void main( String[] args){
		GetalRij gr = new GetalRij(100000, 100001);	
		//getalA
		Random random = new Random();
		//(range) + minimum
		int zoekWaarde = random.nextInt(100000);
		long startA = tijd();
		gr.zitErinA(zoekWaarde);
		long endA = tijd();	
		System.out.println("De totaal verlopen tijd A is: " + (endA -startA) + " milliseconden");
		
		//getalB
		//(range) + minimum
		zoekWaarde = random.nextInt(100000);
		long startB = tijd();
		gr.zitErinB(zoekWaarde);
		long endB = tijd();
		System.out.println("De totaal verlopen tijd B is: " + (endB -startB) + " milliseconden");
		
		//getalC
		zoekWaarde = random.nextInt(100000);
		gr.sorteer();
		long startC = tijd();
		gr.zitErinC(zoekWaarde);
		long endC = tijd();
		System.out.println("De totaal verlopen tijd C is: " + (endC -startC) + " milliseconden");	
		
		//getalD
		zoekWaarde = random.nextInt(100000);
		gr.sorteer();
		long startD = tijd();
		gr.zitErinD(zoekWaarde);
		long endD = tijd();
		System.out.println("De totaal verlopen tijd D is: " + (endD -startD) + " milliseconden");	
		
	}
	
	// Hulpmethode voor tijdsbepaling
	private static long tijd(){
		
		return System.currentTimeMillis();
	}
}
