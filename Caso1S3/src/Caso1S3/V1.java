package Caso1S3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblSumarNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumarTresEnteros;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número");
			lblNewLabel.setBounds(31, 21, 85, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número");
			lblSegundoNmero.setBounds(31, 66, 85, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblSumarNmero = new JLabel("Tercer número");
			lblSumarNmero.setBounds(31, 120, 85, 14);
			contentPane.add(lblSumarNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(126, 18, 116, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(126, 63, 116, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(126, 117, 116, 20);
			contentPane.add(txtN3);
		}
		{
			btnNewButton = new JButton("Sumar dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(269, 17, 133, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumarTresEnteros = new JButton("Sumar tres enteros");
			btnSumarTresEnteros.addActionListener(this);
			btnSumarTresEnteros.setBounds(269, 62, 133, 23);
			contentPane.add(btnSumarTresEnteros);
		}
		{
			btnNewButton_2 = new JButton("Sumar dos reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(269, 116, 133, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(31, 161, 359, 75);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnSumarTresEnteros) {
			do_btnSumarDosEnteros_actionPerformed(e);
		}
	}
	protected void do_btnSumarDosEnteros_actionPerformed(ActionEvent e) {
		
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			int n3=Integer.parseInt(txtN3.getText());
			Calculadora c= new Calculadora(n1, n2, n3);
			txtS.append("La suma es:"+c.Sumar(n1, n2, n3));
			
		} catch (Exception e2) {
			MostrarError();
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			Calculadora c= new Calculadora(n1, n2);
			txtS.append("La suma es: "+c.Sumar(n1, n2));//txtS.append para que aparezca en el cuadro JTextArea
		} catch (Exception e2) {
			MostrarError();
		}
		
	}
	private void MostrarError() {//Se crea un metodo para que muestre un mensaje del error
		JOptionPane.showMessageDialog(this,"Ingrese números(s) validos(s)");
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		double num1=Double.parseDouble(txtN1.getText());
		double num2=Double.parseDouble(txtN1.getText());
		Calculadora c= new Calculadora(num1, num2);
		txtS.append("La suma de dos reales es: "+c.Sumar(num1, num2));
		
	}
}
