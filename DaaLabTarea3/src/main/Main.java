package main;

import insertionSort.InsertionSort;
import modelo.Collection;
import java.util.ArrayList;

public class Main {
	/* main temporal */
	public static void main( String args[] ){		
		InsertionSort insertionSort = new InsertionSort();
		//test array
		int arreglo[] = {12, 11, 13, 5, 6}; 		 
		insertionSort.sortArray(arreglo);  //ordenar  array
		insertionSort.printArray(arreglo); //imprimir array
		//test collection
		ArrayList<Collection> collection= new ArrayList<Collection>(); 
		collection.add(new Collection(12)); 
		collection.add(new Collection(11));
		collection.add(new Collection(13));
		collection.add(new Collection(5));
		collection.add(new Collection(6));
		insertionSort.sortCollection(collection); //ordenar  collection
		insertionSort.printCollection(collection);//imprimir collection
	} 
}
