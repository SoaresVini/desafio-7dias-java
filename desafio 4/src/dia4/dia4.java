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
import java.awt.event.ActionEvent;

public class dia4 extends JFrame {

	private JPanel num;
	private JTextField nume;
	private Double[] cad ;
	private JTextField maior;
	private JTextField menor;
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
				
				Double maior1 = Double.MAX_VALUE;
				Double menor1 = Double.MIN_VALUE;
				
				String i = nume.getText();
				
				Integer x = Integer .valueOf(i);
				
				cad = new Double [x];
				
				for (Double double1 : cad) {
					
					if (cad[x]>maior1 ) {
						maior1 = cad[x];
					}
				}
		
				for (Double double1 : cad) {
					
					if (cad[x]< menor1 ) {
						menor1 = cad[x];
					}
				}
			}
		});
		exibir.setBounds(104, 154, 108, 25);
		num.add(exibir);

		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String i = nume.getText();
		
					Integer x = Integer .valueOf(i);
					
					cad = new Double [x];
					
					for (Double double1 : cad) {
						
						JOptionPane.showInputDialog( "Escreva um numero: "+cad,null);
						
					}
				
				
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
		
		maior = new JTextField();
		maior.setColumns(10);
		maior.setBounds(104, 47, 114, 19);
		num.add(maior);
		
		menor = new JTextField();
		menor.setColumns(10);
		menor.setBounds(104, 77, 114, 19);
		num.add(menor);
	}
}
