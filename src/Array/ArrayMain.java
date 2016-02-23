package Array;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		ArrayVergelijker v = new ArrayVergelijker();
		
		int[] array1 = {1, 2, 3}; //Maak arrays aan om te vergelijken.
		int[] array2 = {4, 5, 6};
		
		ArrayMain.run(v, array1, array2); //Start de thread.
		
		int[] array3 = {1, 2, 3};
		int[] array4 = {4, 5};
		
		ArrayMain.run(v, array3, array4);
	}
	
	private static void run(ArrayVergelijker v, int[] array1, int[] array2){
		//Print de inhoud van de arrays.
		System.out.println("Array 1 is :");
		
		System.out.println(Arrays.toString(array1));
		
		System.out.println("Array 2 is :");
		
		System.out.println(Arrays.toString(array2));
		
		try{
			//Print resultaat van de som.
			int[] result = v.sumArray(array1, array2);
			
			System.out.println("Array 1 + 2 is :");
			
			System.out.println(Arrays.toString(result));
			
		}catch(ArraySizeException ae){
			System.out.println(ae.getMessage());
		}finally{
			System.out.println("\n");
		}
	}

}
