package Vista;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Controlador.controladorInsertionSort;
import Controlador.controladorMergeSort;
import Controlador.controladorQuickSort;
import java.awt.Color;
public class Principal extends JFrame {
	private Font f = new Font("Century Gothic", Font.PLAIN, 14);
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 317);
		getContentPane().add(panelCentral(), BorderLayout.CENTER);
	}
	
	
	public JTabbedPane panelCentral() {
		JTabbedPane panel = new JTabbedPane();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setFont(f);
		
		panel.addTab("Insertion Sort", null, panelInsertionSort(), null);
		
		panel.addTab("Merge Sort", null, panelMergeSort(), null);
		
		panel.addTab("Quick Sort", null, panelQuickSort(), null);
		
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
	

}
