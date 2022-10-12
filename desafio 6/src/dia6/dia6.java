package dia6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class dia6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	Pessoa x = new Pessoa();

	ArrayList pessoas = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dia6 frame = new dia6();
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
	public dia6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(29, 14, 70, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Idade: ");
		lblNewLabel_1.setBounds(29, 41, 49, 15);
		contentPane.add(lblNewLabel_1);

		txtNome = new JTextField();
		txtNome.setBounds(82, 12, 135, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				x.setnome(txtNome.getText());
				x.setidade(txtIdade.getText());

				pessoas.add(x);

			}
		});
		btCadastrar.setBounds(82, 74, 114, 25);
		contentPane.add(btCadastrar);

		txtIdade = new JTextField();
		txtIdade.setBounds(82, 43, 95, 19);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
	}

}
