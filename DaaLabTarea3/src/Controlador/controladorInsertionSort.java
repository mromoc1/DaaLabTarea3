package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import Vista.panelInsertionSort;
import modelo.Persona;

public class controladorInsertionSort implements ActionListener,KeyListener{
	panelInsertionSort panel;
	insertionSort.InsertionSort sort = new insertionSort.InsertionSort();
	
	public controladorInsertionSort(panelInsertionSort panel) {
		this.panel = panel;
		
		this.panel.botonIniciar.addActionListener(this);
		this.panel.textField.addKeyListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panel.botonIniciar) {
			
			if(panel.textField.getText().equals("")||panel.boxOrden.getSelectedIndex() == 1 && Integer.parseInt(panel.textField.getText()) > 9) {
				JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Cantidad de Elementos V�lida",null,JOptionPane.WARNING_MESSAGE);
			}else {
				int A[] = new int[Integer.parseInt(panel.textField.getText())];
				
				if(panel.boxMagnitud.getSelectedIndex() == 0) {
					if(panel.boxOrden.getSelectedIndex() == 0) {
						//DESORENADO
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = ThreadLocalRandom.current().nextInt(10, 90)/*%10*10*/;
						}
					}else {
						//ORDENADO
						int j= 10;
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = j;
							j+=10;
						}
						
					}
					
				}else if(panel.boxMagnitud.getSelectedIndex() == 1){
					if(panel.boxOrden.getSelectedIndex() == 0) {
						//DESORENADO
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = ThreadLocalRandom.current().nextInt(100, 900)/*%10*100*/;
						}
					}else {
						//ORDENADO
						int j= 100;
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = j;
							j+=100;
						}
						
					}			
				}else if(panel.boxMagnitud.getSelectedIndex() == 2){
					if(panel.boxOrden.getSelectedIndex() == 0) {
						//DESORENADO
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = ThreadLocalRandom.current().nextInt(1000, 9000)/*%10*1000*/;
						}
					}else {
						//ORDENADO
						int j= 1000;
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = j;
							j+=1000;
						}
						
					}			
				}else if(panel.boxMagnitud.getSelectedIndex() == 3){
					if(panel.boxOrden.getSelectedIndex() == 0) {
						//DESORENADO
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = ThreadLocalRandom.current().nextInt(10000, 90000)/*%10*10000*/;
						}
					}else {
						//ORDENADO
						int j= 10000;
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = j;
							j+=10000;
						}
						
					}
				}else if(panel.boxMagnitud.getSelectedIndex() == 4){
					if(panel.boxOrden.getSelectedIndex() == 0) {
						//DESORENADO
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = ThreadLocalRandom.current().nextInt(100000, 900000)/*%10*100000*/;
						}
					}else {
						//ORDENADO
						int j= 100000;
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A[i] = j;
							j+=100000;
						}
					}
				}
				
				sort = new insertionSort.InsertionSort();
				if(panel.boxOrden.getSelectedIndex() == 0 || panel.boxOrden.getSelectedIndex() == 1) {
					this.panel.textArea.setText("Estado Actual Algoritmo Insertion Sort:\n"
							+  "\n"
							+ "Arreglo de Entrada : " + Arrays.toString(A) +"\n");
					sort.sortArray(A);
					this.panel.textArea.append("Arreglo de Salida : " + Arrays.toString(A) + "\n"
							+ "N� de Comparaciones : " + sort.getComparaciones() + "\n"
							+ "N� de Intercambios : "+ sort.getIntercambios() + "\n"
							+ "Tiempo Transcurrido : "+ sort.getTiempo() );
					
				}else if(panel.boxOrden.getSelectedIndex() == 2 || panel.boxOrden.getSelectedIndex() == 3){
					ArrayList<Persona> listaPersonasTemp = new ArrayList<Persona>();
					ArrayList<Persona> collection = new ArrayList<Persona>();
					listaPersonasTemp.add(new Persona("Diego"));
					listaPersonasTemp.add(new Persona("Marcelo"));
					listaPersonasTemp.add(new Persona("Rodrigo"));
					listaPersonasTemp.add(new Persona("Claudio"));
					listaPersonasTemp.add(new Persona("Bryan"));
					listaPersonasTemp.add(new Persona("Camilo"));
					listaPersonasTemp.add(new Persona("Fernando"));
					Random random = new Random();
					for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
						collection.add(listaPersonasTemp.get( random.nextInt(listaPersonasTemp.size())));
					}
					this.panel.textArea.setText("Estado Actual Algoritmo Insertion Sort:\n"
							+  "\n"
							+ "Coleccion de Entrada : " + sort.printCollection(collection) +"\n");
					long tiempoInicio = System.currentTimeMillis();
					sort.sortCollection(collection);
					long tiempoFinal = System.currentTimeMillis();
					long tiempo = tiempoFinal - tiempoInicio;
					this.panel.textArea.append("Coleccion de Salida : " + sort.printCollection(collection) + "\n"
							+ "Tiempo Transcurrido : "+ tiempo );
				}
				
						
			}
		}
	}

	
	public void keyPressed(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {
		if(e.getSource() == panel.textField) {
			char caracter = e.getKeyChar();
			if(((caracter < '0') || (caracter > '9')) && (caracter != '\b')){
			         e.consume();
			}
		}
	}

	
}
