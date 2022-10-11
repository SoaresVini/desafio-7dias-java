package dia4;

/**
 * @author Sam Pfleger Mendes
 * @date 09/10/2022
 * 
 * incompleto
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class dia4 extends JFrame {

	private JPanel num;
	private JTextField textField_1;
	private JTextField nume;
	ArrayList<Double> numeros = new ArrayList();
	private JTextField maiorText;
	private JTextField menorText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dia4 frame = new dia4();
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
	public dia4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 228);
		num = new JPanel();
		num.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(num);
		num.setLayout(null);

		nume = new JTextField();
		nume.setBounds(104, 16, 114, 19);
		num.add(nume);
		nume.setColumns(10);

		

		JButton exibir = new JButton("Exibir");
		exibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double maior = Double.MIN_VALUE;
				Double menor = Double.MAX_VALUE;

				for (int i = 0; i < numeros.size(); i++) {

					if (maior < numeros.get(i)) {

						maior = numeros.get(i);
						
						maiorText.setText(String.valueOf(maior));
					}

					if (menor > numeros.get(i)) {

						menor = numeros.get(i);

						menorText.setText(String.valueOf(menor));
				}
				
				}
	
			}
		});
		exibir.setBounds(104, 154, 108, 25);
		num.add(exibir);

		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				numeros.add(Double.valueOf(nume.getText()));

			}
		});
		Cadastrar.setBounds(104, 117, 108, 25);
		num.add(Cadastrar);

		JLabel lblNewLabel = new JLabel("Maior");
		lblNewLabel.setBounds(35, 47, 70, 15);
		num.add(lblNewLabel);

		JLabel lblMenor = new JLabel("Menor");
		lblMenor.setBounds(35, 79, 70, 15);
		num.add(lblMenor);
		
		maiorText = new JTextField();
		maiorText.setEditable(false);
		maiorText.setColumns(10);
		maiorText.setBounds(104, 46, 114, 19);
		num.add(maiorText);
		
		menorText = new JTextField();
		menorText.setEditable(false);
		menorText.setColumns(10);
		menorText.setBounds(104, 76, 114, 19);
		num.add(menorText);
	}
}
