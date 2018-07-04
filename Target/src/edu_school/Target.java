package edu_school;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Target extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JPanel panel;
	private JButton btnDraw;
	private JButton btnClear;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Target frame = new Target();
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
	public Target() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(227, 21, 286, 278);
		contentPane.add(panel);
		
		txt1 = new JTextField();
		txt1.setBounds(83, 151, 67, 26);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d = Integer.parseInt(txt1.getText());
				
				Graphics g = panel.getGraphics();
				
				int w = (int) panel.getWidth();
				int h = (int) panel.getHeight();
				
				
				for (int i = 0; i <= d; i++) {
				g.fillOval(0, 0, w, h);
				g.setColor(Color.GREEN);
				g.fillOval(10, 10, w-d, h-d);
				g.setColor(Color.blue);
				g.fillOval(20, 20, w-2*d, h-2*d);
				g.setColor(Color.GREEN);
				g.fillOval(30, 30, w-3*d, h-3*d);
				g.setColor(Color.blue);
				g.fillOval(40, 40, w-4*d, h-4*d);
				g.setColor(Color.GREEN);
				g.fillOval(50, 50, w-5*d, h-5*d);
				g.setColor(Color.blue);
				g.fillOval(60, 60, w-6*d, h-6*d);
				g.setColor(Color.GREEN);
				g.fillOval(70, 70, w-7*d, h-7*d);
				g.setColor(Color.blue);
				g.fillOval(80, 80, w-8*d, h-8*d);
				g.setColor(Color.GREEN);
				g.fillOval(90, 90, w-9*d, h-9*d);
				g.setColor(Color.blue);
				g.fillOval(100, 100, w-10*d, h-10*d);
				}
			
	
			}
		});
		btnDraw.setBounds(6, 226, 117, 29);
		contentPane.add(btnDraw);
		
		JLabel lblDiameterOfThe = new JLabel("Distance between the circles");
		lblDiameterOfThe.setBounds(23, 123, 232, 16);
		contentPane.add(lblDiameterOfThe);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
			}
		});
		btnClear.setBounds(115, 226, 117, 29);
		contentPane.add(btnClear);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(58, 270, 117, 29);
		contentPane.add(btnExit);
	}
}
