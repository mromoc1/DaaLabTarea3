package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection {
	long tiempo = 0;
	public void sort( ArrayList<String> al ) {
		long inicio = System.currentTimeMillis();
        Collections.sort(al);  
        long fin = System.currentTimeMillis();
        tiempo = fin - inicio;
	}
	
	public String printCollection( ArrayList<String> A ) {
		String s = " ";
		int posicion = 0;
		System.out.println(A.size());
		for (String dato : A) {
			s = s.concat(dato);
			posicion++;
			if( posicion < A.size() ) s = s.concat(", ");
		}
		return s;
	}
	/*tiempo*/
	public long getTiempo() {
		return tiempo;
	}
}
