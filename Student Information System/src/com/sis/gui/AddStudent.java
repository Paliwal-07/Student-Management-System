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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

@SuppressWarnings("serial")
public class AddStudent extends JFrame {

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
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AddStudent() {
		setTitle("Add Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enrollment No");
		lblNewLabel.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblNewLabel.setBounds(21, 38, 188, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblName.setBounds(21, 75, 188, 33);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblAddress.setBounds(21, 111, 188, 33);
		contentPane.add(lblAddress);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblBranch.setBounds(21, 146, 188, 33);
		contentPane.add(lblBranch);
		
		JLabel lblCollege = new JLabel("College");
		lblCollege.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblCollege.setBounds(21, 181, 188, 33);
		contentPane.add(lblCollege);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSemester.setBounds(21, 216, 188, 33);
		contentPane.add(lblSemester);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblGender.setBounds(21, 251, 188, 33);
		contentPane.add(lblGender);
		
		JLabel lblSubjectMarks = new JLabel("Subject 1 marks");
		lblSubjectMarks.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks.setBounds(21, 285, 188, 33);
		contentPane.add(lblSubjectMarks);
		
		JLabel lblSubjectMarks_2 = new JLabel("Subject 2 marks");
		lblSubjectMarks_2.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks_2.setBounds(21, 319, 188, 33);
		contentPane.add(lblSubjectMarks_2);
		
		JLabel lblSubjectMarks_3 = new JLabel("Subject 3 marks");
		lblSubjectMarks_3.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks_3.setBounds(21, 353, 188, 33);
		contentPane.add(lblSubjectMarks_3);
		
		JLabel lblSubjectMarks_4 = new JLabel("Subject 4 marks");
		lblSubjectMarks_4.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		lblSubjectMarks_4.setBounds(21, 387, 188, 33);
		contentPane.add(lblSubjectMarks_4);
		
		textField = new JTextField();
		textField.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField.setBounds(219, 38, 145, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(219, 75, 145, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(219, 111, 409, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(219, 146, 145, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(219, 181, 145, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(219, 216, 145, 33);
		contentPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("HP Simplified", Font.PLAIN, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(219, 253, 145, 28);
		contentPane.add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(219, 285, 145, 33);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(219, 319, 145, 33);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(219, 353, 145, 33);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(219, 387, 145, 33);
		contentPane.add(textField_9);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String enrollment=textField.getText();
				String name=textField_1.getText();
				String address=textField_2.getText();
				String branch=textField_3.getText();
				String college=textField_4.getText();
				int semester=Integer.parseInt(textField_5.getText());
				String gender=(String) comboBox.getSelectedItem();
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
				sb.setGender(gender);
				sb.setSubject1(subject1);
				sb.setSubject2(subject2);
				sb.setSubject3(subject3);
				sb.setSubject4(subject4);
				int x=sd.addStudent(sb);
				if(x>0) {
					JOptionPane.showMessageDialog(null, "Student Added Successfully",null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Failed to add Student",null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnAdd.setFont(new Font("MV Boli", Font.PLAIN, 18));
		btnAdd.setBounds(324, 477, 85, 33);
		contentPane.add(btnAdd);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
