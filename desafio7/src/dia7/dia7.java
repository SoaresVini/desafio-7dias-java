package dia7;
/**
 * @author Vinicius Soares
 * @date 13/10/2022
 * 
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class dia7 extends JFrame {

	private JPanel contentPane;
	private JTextField n1;
	private JTextField n2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dia7 frame = new dia7();
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
	public dia7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		n1 = new JTextField();
		n1.setBounds(110, 10, 114, 19);
		contentPane.add(n1);
		n1.setColumns(10);

		n2 = new JTextField();
		n2.setBounds(110, 41, 114, 19);
		contentPane.add(n2);
		n2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Numero 1 :");
		lblNewLabel.setBounds(12, 12, 97, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setBounds(12, 45, 97, 15);
		contentPane.add(lblNewLabel_1);

		
	
		
		JButton btMais = new JButton("+");
		btMais.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {

				Double n1D = Double.valueOf(String.valueOf(n1.getText()));
				Double n2D = Double.valueOf(String.valueOf(n2.getText()));
				
				Double calc = n1D + n2D;

				JOptionPane.showMessageDialog(null, calc);

			}
		});
		btMais.setBounds(32, 89, 54, 25);
		contentPane.add(btMais);

		JButton btMenos = new JButton("-");
		btMenos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double n1D = Double.valueOf(String.valueOf(n1.getText()));
				Double n2D = Double.valueOf(String.valueOf(n2.getText()));
				
				Double calc = n1D - n2D;

				JOptionPane.showMessageDialog(null, calc);

			}
		});
		btMenos.setBounds(95, 89, 54, 25);
		contentPane.add(btMenos);

		JButton btDiv = new JButton("/");
		btDiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Double n1D = Double.valueOf(String.valueOf(n1.getText()));
				Double n2D = Double.valueOf(String.valueOf(n2.getText()));
				
				Double calc = n1D / n2D;

				JOptionPane.showMessageDialog(null, calc);
			}
		});
		btDiv.setBounds(219, 89, 54, 25);
		contentPane.add(btDiv);

		JButton btMult = new JButton("*");
		btMult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Double n1D = Double.valueOf(String.valueOf(n1.getText()));
				Double n2D = Double.valueOf(String.valueOf(n2.getText()));
				
				Double calc = n1D * n2D;

				JOptionPane.showMessageDialog(null, calc);
			}
		});
		btMult.setBounds(156, 89, 54, 25);
		contentPane.add(btMult);
	}
}
