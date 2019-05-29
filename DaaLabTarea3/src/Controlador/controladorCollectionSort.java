package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import Vista.panelCollectionSort;

public class controladorCollectionSort implements ActionListener,KeyListener{
	panelCollectionSort panel;
	sort.Collection sort = new sort.Collection();
	
	public controladorCollectionSort(panelCollectionSort panel) {
		this.panel = panel;
		
		this.panel.botonIniciar.addActionListener(this);
		this.panel.textField.addKeyListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panel.botonIniciar) {
			
			if(panel.textField.getText().equals("")||panel.boxOrden.getSelectedIndex() == 1 && Integer.parseInt(panel.textField.getText()) > 9) {
				JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Cantidad de Elementos Válida",null,JOptionPane.WARNING_MESSAGE);
			}else {
				//int A[] = new int[Integer.parseInt(panel.textField.getText())];
				ArrayList<String> listaColoresTemp = new ArrayList<String>();
				ArrayList<String> A = new ArrayList<String>();
				listaColoresTemp.add("verde");
				listaColoresTemp.add("amarillo");
				listaColoresTemp.add("azul");
				listaColoresTemp.add("rojo");
				listaColoresTemp.add("morado");
				listaColoresTemp.add("café");
				listaColoresTemp.add("negro");
				listaColoresTemp.add("blanco");
				listaColoresTemp.add("ambar");
				listaColoresTemp.add("gris");
				listaColoresTemp.add("naranjo");
				Random random = new Random();
				
				if(panel.boxMagnitud.getSelectedIndex() == 0) {
					if(panel.boxOrden.getSelectedIndex() == 0) {
						//DESORENADO
						for(int i=0 ; i < Integer.parseInt(panel.textField.getText()) ; i++) {
							A.add(listaColoresTemp.get( random.nextInt(listaColoresTemp.size())));
						}
					}
					
				}
				sort = new sort.Collection();
				this.panel.textArea.setText("Estado Actual Método Collections.Sort:\n");
				this.panel.textArea.append("Arreglo de Entrada : "+ sort.printCollection(A) + "\n");
				if(panel.boxOrden.getSelectedIndex() == 0) {
					sort.sort(A);
				}
				this.panel.textArea.append("Arreglo de Salida : "+ sort.printCollection(A) + "\n");
				this.panel.textArea.append("\n" + "Tiempo Transcurrido : "+ sort.getTiempo() );
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
