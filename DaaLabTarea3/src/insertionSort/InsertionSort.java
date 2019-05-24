package insertionSort;

import java.util.ArrayList;
import modelo.Collection;

public class InsertionSort{
	/* insertion sort para Arrays*/
	public void sortArray( int arreglo[] ){ 
		int n = arreglo.length; 
		for( int i=1; i<n; ++i ){ 
			int key = arreglo[i]; 
			int j = i-1;
			while( j>=0 && arreglo[j] > key ){ 
				arreglo[j+1] = arreglo[j]; 
				j = j-1; 
			} 
			arreglo[j+1] = key; 
		} 
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
	/* imprime arreglo */
	public void printArray(int arreglo[]){ 
		int n = arreglo.length; 
		System.out.println("Array: ");
		for( int i=0; i<n; ++i ) { 
			System.out.print(arreglo[i] + " "); 
		}	
		System.out.println(); 
	}
	/* imprime collection */
	public void printCollection(ArrayList<Collection> collection){ 
		System.out.println("Collection: ");
		for (Collection e : collection) {
			System.out.println(e.getValor());
		}
	}
}
