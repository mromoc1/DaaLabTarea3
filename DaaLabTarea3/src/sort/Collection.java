package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection {
	public static void sort( ArrayList<String> al ) {
        Collections.sort(al);  
	}
	public static void printCollection( ArrayList<String> al ) {
		System.out.println("Collection.sort() :\n" + al); 
	}
}
