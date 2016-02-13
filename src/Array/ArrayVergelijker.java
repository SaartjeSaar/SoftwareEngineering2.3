package Array;

public class ArrayVergelijker {
	public ArrayVergelijker(){}
	
	public int[] sumArray(int[] array1, int[] array2) throws ArraySizeException{
		if(array1.length != array2.length){
			throw new ArraySizeException(	
					"Array lengte komt niet overeen. \n" + 
					"Array1 lengte : " + array1.length + "\n" +
					"Array2 lengte : " + array2.length);
		}else{
			//Berekend de som en geeft door aan het main bestand.
			int[] toReturn = new int[array1.length];
			for(int i = 0; i < array1.length; i++){
				toReturn[i] = (array1[i] + array2[i]);
			}			
			return toReturn;
		}
	}
}
