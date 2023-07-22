package com.sis.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sis.dao.StudentDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent frame = new DeleteStudent();
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
	public DeleteStudent() {
		setTitle("Delete Student Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enrollment Number");
		lblNewLabel.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblNewLabel.setBounds(22, 51, 168, 33);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("HP Simplified Light", Font.PLAIN, 20));
		textField.setBounds(200, 51, 203, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enrollment=textField.getText();
				StudentDAO sd=new StudentDAO();
				int x=sd.deleteStudent(enrollment);
				if(x>0) {
					JOptionPane.showMessageDialog(null, "Student Deleted Successfully",null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Failed to delete Student",null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 102, 102));
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 18));
		btnNewButton.setBounds(180, 175, 173, 39);
		contentPane.add(btnNewButton);
	}

}
