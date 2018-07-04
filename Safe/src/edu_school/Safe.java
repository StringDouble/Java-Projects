package edu_school;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Safe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Safe frame = new Safe();
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
	public Safe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblCode.setBounds(54, 45, 63, 27);
		contentPane.add(lblCode);
		
		textField = new JTextField();
		textField.setBounds(199, 45, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblResult.setBounds(54, 90, 82, 27);
		contentPane.add(lblResult);
	}
}
