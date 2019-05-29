package sort;

import java.util.Arrays;

public class Array {
	long tiempo = 0;
	public void sort( int[] arr ) {
		long inicio = System.currentTimeMillis();
		Arrays.sort(arr);
		long fin = System.currentTimeMillis();
		tiempo = fin - inicio;
	}
	public void printArray( int[] arr) {
		System.out.printf("%s", Arrays.toString(arr));
	}
	/*tiempo*/
	public long getTiempo() {
		return tiempo;
	}
}
