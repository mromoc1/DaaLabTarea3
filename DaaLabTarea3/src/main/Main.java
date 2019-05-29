package main;

import insertionSort.InsertionSort;
import modelo.Persona;

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
		ArrayList<Persona> collection= new ArrayList<Persona>(); 
		collection.add(new Persona("Marcelo")); 
		collection.add(new Persona("Diego"));
		collection.add(new Persona("Claudio"));
		insertionSort.sortCollection(collection); //ordenar  collection
		System.out.println(insertionSort.printCollection(collection));//imprimir collection
	} 
}
