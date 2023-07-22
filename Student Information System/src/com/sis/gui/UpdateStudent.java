package com.sis.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sis.bean.StudentBean;
import com.sis.dao.StudentDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent frame = new UpdateStudent();
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
	public UpdateStudent() {
		setBackground(new Color(204, 153, 255));
		setTitle("Update Student Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblNewLabel.setBounds(31, 66, 151, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblAddress.setBounds(31, 98, 151, 32);
		contentPane.add(lblAddress);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblBranch.setBounds(31, 132, 151, 32);
		contentPane.add(lblBranch);
		
		JLabel lblCollege = new JLabel("College");
		lblCollege.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblCollege.setBounds(31, 165, 151, 32);
		contentPane.add(lblCollege);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSemester.setBounds(31, 197, 151, 32);
		contentPane.add(lblSemester);
		
		JLabel lblSubjectMarks = new JLabel("Subject 1 marks");
		lblSubjectMarks.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks.setBounds(31, 229, 151, 32);
		contentPane.add(lblSubjectMarks);
		
		JLabel lblSubjectMarks_4 = new JLabel("Subject 2 marks");
		lblSubjectMarks_4.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks_4.setBounds(31, 263, 151, 32);
		contentPane.add(lblSubjectMarks_4);
		
		JLabel lblSubjectMarks_1 = new JLabel("Subject 3 marks");
		lblSubjectMarks_1.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks_1.setBounds(31, 299, 151, 32);
		contentPane.add(lblSubjectMarks_1);
		
		JLabel lblSubjectMarks_2 = new JLabel("Subject 4 marks");
		lblSubjectMarks_2.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks_2.setBounds(31, 333, 151, 32);
		contentPane.add(lblSubjectMarks_2);
		
		JButton btnNewButton = new JButton("Update Record");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String enrollment=textField.getText();
				String name=textField_1.getText();
				String address=textField_2.getText();
				String branch=textField_3.getText();
				String college=textField_4.getText();
				int semester=Integer.parseInt(textField_5.getText());
				float subject1=Float.parseFloat(textField_6.getText());
				float subject2=Float.parseFloat(textField_7.getText());
				float subject3=Float.parseFloat(textField_8.getText());
				float subject4=Float.parseFloat(textField_9.getText());
				StudentDAO sd=new StudentDAO();
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(enrollment);
				sb.setName(name);
				sb.setAddress(address);
				sb.setBranch(branch);
				sb.setCollege(college);
				sb.setSemester(semester);
				sb.setSubject1(subject1);
				sb.setSubject2(subject2);
				sb.setSubject3(subject3);
				sb.setSubject4(subject4);
				int x=sd.updateStudent(sb);
				if(x>0) {
					JOptionPane.showMessageDialog(null, "Student Updated Successfully",null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Failed to update record",null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 18));
		btnNewButton.setBounds(297, 464, 187, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblEnrollmentToBe = new JLabel("Enrollment to be Updated");
		lblEnrollmentToBe.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblEnrollmentToBe.setBounds(31, 24, 233, 32);
		contentPane.add(lblEnrollmentToBe);
		
		textField = new JTextField();
		textField.setBounds(274, 24, 151, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 66, 151, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 98, 513, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(192, 132, 151, 29);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(192, 165, 151, 29);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(192, 197, 151, 29);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(192, 229, 151, 29);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(192, 263, 151, 29);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(192, 299, 151, 29);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(192, 333, 151, 29);
		contentPane.add(textField_9);
	}
}
