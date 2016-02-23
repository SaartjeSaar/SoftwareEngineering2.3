package opdracht03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GetalRij {
	private int[] getallen;
	
	public GetalRij( int aantal, int max ){
		// Belangrijke aanname: aantal < max, anders kunnen de getallen niet uniek zijn.
		getallen = new int[aantal];
		vulArrayMetUniekeWaarden( aantal, max );
	}

	private void vulArrayMetUniekeWaarden(int aantal, int max) {
		// Vul een hulplijst met getallen 0, ..., max
		ArrayList hulpLijst = new ArrayList( max );
		for ( int i=0; i<max; i++){
			hulpLijst.add( i );
		}
		
		// Stop 'aantal' random waarden in getallen
		Random r = new Random();
		for ( int i=0; i<aantal; i++){
			// Het omzetten van Integer naar int gaat sinds Java 1.5 automatisch (unboxing).
			int getal = (Integer) (hulpLijst.remove( r.nextInt( hulpLijst.size())));
			getallen[i] = getal;
		}
	}
	
	public boolean zitErinA( int zoekWaarde ){
		boolean inhoudA = false;
		int index = 0;
		while(index < getallen.length){
			if(zoekWaarde == getallen[index]){
				inhoudA = true;
				System.out.println("Het gezochte getal A: " + zoekWaarde +" is gevonden");
			}
			index++;
		}		
		return inhoudA;
	}

	public boolean zitErinB( int zoekWaarde ){
		boolean inhoudB = false;
		int index = 0;
		while(!inhoudB && index < getallen.length){
			if(getallen[index] == zoekWaarde){
				inhoudB = true;
				System.out.println("Het gezochte getal B: " + zoekWaarde +" is gevonden");
			}
			index++;
		}
		return inhoudB;
	}

	public boolean zitErinC( int zoekWaarde ){
		boolean inhoudC = false;
		int index = 0;
		while(!inhoudC && index < getallen.length){
			if(getallen[index] == zoekWaarde){
				inhoudC = true;
				System.out.println("Het gezochte getal C: " + zoekWaarde +" is gevonden");
			}
			index++;
		}
		return inhoudC;
	}

	public boolean zitErinD( int zoekWaarde ){
		boolean inhoudD = false;
		int gevonden = gr.binarySearch();
			if(gevonden == zoekWaarde){
				inhoudD = true;
				System.out.println("Het gezochte getal D: " + zoekWaarde +" is gevonden");
			}
		return inhoudD;
	}
	
	public void sorteer(){
		Arrays.sort( getallen);
	}
	
	public void print(){
		for( int i=0; i<getallen.length; i++)
			System.out.println(getallen[i]);
	}

}
