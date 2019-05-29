package Vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Controlador.controladorArraySort;
import Controlador.controladorCollectionSort;
import Controlador.controladorInsertionSort;
import Controlador.controladorMergeSort;
import Controlador.controladorQuickSort;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Principal extends JFrame {
	private Font f = new Font("Century Gothic", Font.PLAIN, 14);
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 353);
		getContentPane().add(panelCentral(), BorderLayout.CENTER);
	}
	
	
	public JTabbedPane panelCentral() {
		JTabbedPane panel = new JTabbedPane();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setFont(f);
		
		panel.addTab("Acerca de",null,panelAcercade(),null);
		panel.addTab("Insertion Sort", null, panelInsertionSort(), null);	
		panel.addTab("Merge Sort", null, panelMergeSort(), null);	
		panel.addTab("Quick Sort", null, panelQuickSort(), null);		
		panel.addTab("Array Sort", null, panelArraySort(), null);
		panel.addTab("Collection Sort", null, panelCollectionSort(), null);
		
		return panel;
	}
	public JPanel panelAcercade() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			panel.add(scrollPane);
			{
				JTextArea textArea = new JTextArea();
				textArea.setLineWrap(true);
				textArea.setEditable(false);
				textArea.setFont(f);
				textArea.setText("- Equipo de Trabajo: \n"
						+ "Marcelo Romo (Jefe de Proyecto).\n"
						+ "Claudio Andrade (Desarrollador).\n"
						+ "Diego Miranda (Desarrollador).\n"
						+ "- Asignatura: Laboratorio de Diseño y Análisis de Algoritmos. \n"
						+ "- Profesor: Erick Castillo Bastias. \n"
						+ "\n- Software:\n"
						+ "El Software implementado tiene como objetivo brindar apoyo "
						+ "al usuario en cuanto a los algoritmos de ordenamiento, en particular "
						+ "los algoritmos de Quick sort, Merge sort e Insertion sort, posee una "
						+ "visualización detallada del resultado obtenido tras ejecutar estos algoritmos"
						+ " con elementos ordenados o aleatorios, con ello el usuario podrá aclarar dudas o"
						+ " sacar conclusiones de que algoritmo es más conveniente según la situación.\n");
				scrollPane.setViewportView(textArea);
			}
		}
		
		return panel;
	}
	
	public JPanel panelQuickSort() {
		panelQuickSort panel = new panelQuickSort();
		controladorQuickSort controlador = new controladorQuickSort(panel);
		
		return panel;
	}
	
	public JPanel panelMergeSort() {
		panelMergeSort panel = new panelMergeSort();
		controladorMergeSort controlador = new controladorMergeSort(panel);
		
		return panel;
	}
	
	public JPanel panelInsertionSort() {
		panelInsertionSort panel = new panelInsertionSort();
		controladorInsertionSort controlador = new controladorInsertionSort(panel);
		
		return panel;
		
	}
	
	public JPanel panelArraySort() {
		panelArraySort panel = new panelArraySort();
		controladorArraySort controlador = new controladorArraySort(panel);
		
		return panel;
		
	}
	
	public JPanel panelCollectionSort() {
		panelCollectionSort panel = new panelCollectionSort();
		controladorCollectionSort controlador = new controladorCollectionSort(panel);
		
		return panel;
		
	}

}
