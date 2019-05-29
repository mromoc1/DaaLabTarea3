package insertionSort;

import java.util.ArrayList;
import modelo.Collection;

public class InsertionSort{
	int comparaciones = 0;
	int intercambios = 0;
	long tiempo = 0;
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
	public void sortCollection(ArrayList<Collection> collection) {
		int in, out;
		for (out = 1; out < collection.size(); out++) {
			Collection temp = collection.get(out);
			in = out;
			while (in > 0 && collection.get(in - 1).getValor() > temp.getValor()) {
				collection.set(in,collection.get(in - 1));
				--in;
			}
			collection.set(in,temp);
		}
	}
	/* imprime collection */
	public void printCollection(ArrayList<Collection> collection){ 
		System.out.println("Collection: ");
		for (Collection e : collection) {
			System.out.println(e.getValor());
		}
	}
}
