package Vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class panelArraySort extends JPanel {
	private Font f = new Font("Century Gothic", Font.PLAIN, 16);
	
	public JTextField textField;
	public JComboBox boxMagnitud,boxOrden;
	public JButton botonIniciar;
	public JTextArea textArea;
	
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	

	
	public panelArraySort() {
		setLayout(new BorderLayout(0, 0));

		add(panelInteractivo(),BorderLayout.NORTH);
		add(panelMensaje(),BorderLayout.CENTER);
		
	}
	
	public JPanel panelInteractivo() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,4,0,0));
		
		
		boxMagnitud = new JComboBox();
		boxMagnitud.setFont(f);
		boxMagnitud.setBackground(Color.LIGHT_GRAY);
		for(int i =1;i<=5;i++)
			boxMagnitud.addItem("Magnitud "+i);
		
		lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		
		label_1 = new JLabel("Generar:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(f);
		panel.add(label_1);
		
		label = new JLabel("N° de Elementos");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(f);
		panel.add(label);
		
		label_2 = new JLabel("");
		panel.add(label_2);
		panel.add(boxMagnitud);
		
		boxOrden = new JComboBox();
		boxOrden.setFont(f);
		boxOrden.setBackground(Color.LIGHT_GRAY);
		boxOrden.addItem("Desordenado");
		boxOrden.addItem("Ordenado");
		panel.add(boxOrden);
		
		textField = new JTextField();
		textField.setFont(f);
		panel.add(textField);
		textField.setColumns(10);
		
		botonIniciar = new JButton(" Iniciar ");
		botonIniciar.setBackground(Color.LIGHT_GRAY);
		botonIniciar.setFont(f);
		panel.add(botonIniciar);
		
		return panel;
	}
	
	public JPanel panelMensaje() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setFont(f);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setText("Estado Actual Método Arrays.Sort:");
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		return panel;
	}

}
