package insertionSort;

import java.util.ArrayList;
import modelo.Persona;

public class InsertionSort{
	private int comparaciones = 0;
	private int intercambios = 0;
	private long tiempo = 0;
	/* insertion sort para Arrays*/
	public void sortArray( int arreglo[] ){ 
		int n = arreglo.length; 
		int temp = 0;
		long inicio=0, fin=0;
		inicio = System.currentTimeMillis();
		for( int i=1; i<n; ++i ){ 
			int key = arreglo[i]; 
			int j = i-1;
			temp = arreglo[j];
			while( j>=0 && arreglo[j] > key ){ 
				if(j>0) temp = arreglo[j-1];
				arreglo[j+1] = arreglo[j]; 
				j = j-1;
				intercambios++;
				comparaciones++;
			}
			if(key>temp) comparaciones++;
			arreglo[j+1] = key;
		} 
		fin = System.currentTimeMillis();
		tiempo = fin - inicio;
	}
	/* imprime arreglo */
	public void printArray(int arreglo[]){ 
		int n = arreglo.length; 
		System.out.println("Array: ");
		for( int i=0; i<n; ++i ) { 
			System.out.print(arreglo[i] + " "); 
		}	
		System.out.println(); 
	}
	/*comparaciones*/
	public int getComparaciones() {
		return comparaciones;
	}
	/*intercambios*/
	public int getIntercambios() {
		return intercambios;
	}
	/*tiempo*/
	public long getTiempo() {
		return tiempo;
	}
	/* insertion sort para Collections*/
	public void sortCollection(ArrayList<Persona> collection) {
		int in, out;
		for (out = 1; out < collection.size(); out++) {
			Persona temp = collection.get(out);
			in = out;
			while (in > 0 && collection.get(in - 1).getNombre().compareTo(temp.getNombre())>0 ) {
				collection.set(in,collection.get(in - 1));
				--in;
			}
			collection.set(in,temp);
		}
	}
	/* imprime collection */
	public String printCollection( ArrayList<Persona> A ) {
		String s = " ";
		int posicion = 0;
		System.out.println(A.size());
		for (Persona dato : A) {
			s = s.concat(dato.getNombre());
			posicion++;
			if( posicion < A.size() ) s = s.concat(", ");
		}
		return s;
	}
}
