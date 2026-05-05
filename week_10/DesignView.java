package week_10;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesignView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignView frame = new DesignView();
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
	public DesignView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 353);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(245, 255, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setBounds(82, 16, 107, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(233, 16, 153, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fahenheight");
		lblNewLabel_1.setBounds(82, 69, 107, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(238, 69, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				double cel = Double.parseDouble(textField.getText());
				
				double f = ((9/5) * cel) +32;
				
				textField_1.setText(" " + f);
				}
				catch(Exception ex) {
					JOptionPane.showConfirmDialog(null, "something went Wrong");
					
				}
				
			}
		});
		btnNewButton.setBounds(82, 130, 117, 29);
		contentPane.add(btnNewButton);
		
		

	}
}
