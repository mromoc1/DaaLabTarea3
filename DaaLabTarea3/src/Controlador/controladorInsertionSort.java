package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import Insertion.Collection;
import Insertion.InsertionSort;
import Vista.panelInsertionSort;

public class controladorInsertionSort implements ActionListener,KeyListener{
	panelInsertionSort panel;
	InsertionSort sort;
	
	public controladorInsertionSort(panelInsertionSort panel) {
		this.panel = panel;
		
		this.panel.botonIniciar.addActionListener(this);
		this.panel.textField.addKeyListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panel.botonIniciar) {
			
			if(panel.textField.getText().equals("")||panel.boxOrden.getSelectedIndex() == 1 && Integer.parseInt(panel.textField.getText()) > 9) {
				JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Cantidad de Elementos Válida",null,JOptionPane.WARNING_MESSAGE);
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
				sort = new InsertionSort();
				this.panel.textArea.setText("Estado Actual Algoritmo Insertion Sort:\n"
						+  "\n"
						+ "Arreglo de Entrada : " + Arrays.toString(A) +"\n");
				double tiempoInicio = 0, tiempoFinal = 0, tiempo;
				if(panel.boxOrden.getSelectedIndex() == 0) {
					tiempoInicio = System.currentTimeMillis();
					
					sort.sortArray(A);
				
					tiempoFinal = System.currentTimeMillis();
					tiempo = tiempoFinal - tiempoInicio;
					
				}else {
					ArrayList<Collection> collection= new ArrayList<Collection>();
					for(int i = 0; i<A.length; i++) {
						collection.add(new Collection(A[i]));
					}
					tiempoInicio = System.currentTimeMillis();
					sort.sortCollection(collection);
					tiempoFinal = System.currentTimeMillis();
					tiempo = tiempoFinal - tiempoInicio;
					
				}
				
				this.panel.textArea.append("Arreglo de Salida : " + Arrays.toString(A) + "\n"
						+ "N° de Comparaciones : " + sort.getNumeroComparaciones() + "\n"
						+ "N° de Intercambios : "+ sort.getNumeroIntercambios() + "\n"
						+ "Tiempo Transcurrido : "+ tiempo);
				
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
