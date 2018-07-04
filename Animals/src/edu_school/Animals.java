package edu_school;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Animals extends JFrame {

	private JPanel contentPane;
	private JTextField txtOriginalFileName;
	private JTextField txtTransformedFileName;
	private JTextField txtOpenFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animals frame = new Animals();
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
	public Animals() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlControl = new JPanel();
		pnlControl.setBackground(new Color(152, 251, 152));
		pnlControl.setBounds(6, 6, 280, 546);
		contentPane.add(pnlControl);
		pnlControl.setLayout(null);
		
		JLabel lblDataPreparation = new JLabel("Data Preparation");
		lblDataPreparation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataPreparation.setBounds(6, 6, 268, 16);
		pnlControl.add(lblDataPreparation);
		
		JLabel lblOriginalFail = new JLabel("Original File:");
		lblOriginalFail.setBounds(6, 34, 108, 16);
		pnlControl.add(lblOriginalFail);
		
		JLabel lblTransformedFile = new JLabel("Transformed File:");
		lblTransformedFile.setBounds(6, 97, 147, 16);
		pnlControl.add(lblTransformedFile);
		
		txtOriginalFileName = new JTextField();
		txtOriginalFileName.setBounds(96, 59, 130, 26);
		pnlControl.add(txtOriginalFileName);
		txtOriginalFileName.setColumns(10);
		
		txtTransformedFileName = new JTextField();
		txtTransformedFileName.setBounds(96, 125, 130, 26);
		pnlControl.add(txtTransformedFileName);
		txtTransformedFileName.setColumns(10);
		
		JButton btnPrepare = new JButton("Prepare");
		btnPrepare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrepare.setBounds(6, 168, 117, 29);
		pnlControl.add(btnPrepare);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(157, 168, 117, 29);
		pnlControl.add(btnSave);
		
		JLabel lblSketch = new JLabel("Sketch:");
		lblSketch.setBounds(6, 250, 61, 16);
		pnlControl.add(lblSketch);
		
		JLabel lblLoadFil = new JLabel("Load File:");
		lblLoadFil.setBounds(53, 278, 61, 16);
		pnlControl.add(lblLoadFil);
		
		txtOpenFileName = new JTextField();
		txtOpenFileName.setBounds(96, 306, 130, 26);
		pnlControl.add(txtOpenFileName);
		txtOpenFileName.setColumns(10);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDraw.setBounds(6, 355, 117, 29);
		pnlControl.add(btnDraw);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(157, 355, 117, 29);
		pnlControl.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(157, 428, 117, 29);
		pnlControl.add(btnExit);
		
		JPanel pnlData = new JPanel();
		pnlData.setBackground(new Color(152, 251, 152));
		pnlData.setBounds(294, 6, 280, 546);
		contentPane.add(pnlData);
		pnlData.setLayout(null);
		
		JLabel lblOriginalData = new JLabel("Original Data:");
		lblOriginalData.setBounds(6, 33, 127, 16);
		pnlData.add(lblOriginalData);
		
		JTextArea txaOriginalData = new JTextArea();
		txaOriginalData.setBounds(6, 55, 268, 193);
		pnlData.add(txaOriginalData);
		
		JLabel lblTransformedData = new JLabel("Transformed Data:");
		lblTransformedData.setBounds(6, 277, 162, 16);
		pnlData.add(lblTransformedData);
		
		JTextArea txaTransformedData = new JTextArea();
		txaTransformedData.setBounds(6, 305, 268, 216);
		pnlData.add(txaTransformedData);
		
		JPanel pnlCanvas = new JPanel();
		pnlCanvas.setBounds(577, 6, 257, 546);
		contentPane.add(pnlCanvas);
	}
}
