package week_10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter First Number :");
		lblNewLabel.setBounds(44, 17, 118, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(196, 12, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Second Number");
		lblNewLabel_1.setBounds(44, 57, 118, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 52, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(44, 107, 98, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(196, 102, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "%"}));
		comboBox.setBounds(349, 53, 79, 26);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int num1 = Integer.parseInt(textField.getText());
					int num2 = Integer.parseInt(textField_1.getText());
					
					String operator = comboBox.getSelectedItem().toString();
					
					float res =0;
					
					switch(operator) {
					case "+":
						res = num1 + num2;
						break;
					case "-":
						res = num1 - num2;
						break;
			
						
						}
					textField_2.setText(" " + res);
					
					
				}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Something Went Wrong");
				}

				
			}
		});
		btnNewButton.setBounds(44, 169, 117, 29);
		contentPane.add(btnNewButton);
		
		

	}
}
