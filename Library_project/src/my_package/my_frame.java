package my_package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class my_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtUser;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					my_frame frame = new my_frame();
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
	public my_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 539);
		contentPane = new JPanel();
		contentPane.setToolTipText("mi marco");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setSize(643, 50);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		JPanel minuevopanel = new JPanel();// panel creation
		minuevopanel.setLocation(10, 10);
		minuevopanel.setBackground(Color.GREEN);// establecemos color del panel
		minuevopanel.setSize(643, 482);
		
		
		
		
		
		this.getContentPane().add(minuevopanel); // agregamos el panel a la ventana
		minuevopanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECCIONA TIPO DE BÚSQUEDA");
		lblNewLabel.setBounds(71, 28, 183, 13);
		minuevopanel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(275, 25, 109, 19);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Título", "Autor", "ISBN"}));
		minuevopanel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(394, 25, 215, 19);
		minuevopanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ADMINISTRADORES");
		lblNewLabel_1.setBounds(71, 200, 159, 13);
		minuevopanel.add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setToolTipText("User");
		txtUser.setForeground(new Color(255, 255, 255));
		txtUser.setBounds(151, 234, 96, 19);
		minuevopanel.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(151, 275, 96, 19);
		minuevopanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.setBounds(119, 319, 85, 21);
		minuevopanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("USER");
		lblNewLabel_2.setBounds(71, 237, 45, 13);
		minuevopanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setBounds(71, 278, 70, 13);
		minuevopanel.add(lblNewLabel_3);
		
		
		
		
		
		
		
		
		
		
	}
}
