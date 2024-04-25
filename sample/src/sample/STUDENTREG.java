package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class STUDENTREG {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					STUDENTREG window = new STUDENTREG();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public STUDENTREG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(96, 25, 357, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(203, 70, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(332, 67, 109, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(203, 124, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb2 = new JTextField();
		tb2.setBounds(332, 121, 109, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(203, 175, 75, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(203, 223, 46, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "ECE", "DS", "EEE", "CS"}));
		cb1.setBounds(332, 171, 109, 22);
		frame.getContentPane().add(cb1);
		
		tb3 = new JTextField();
		tb3.setBounds(332, 224, 109, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getSelectedText();
				String roll=tb2.getSelectedText();
				String branch=(String)cb1.getSelectedItem();
				String marks=tb3.getSelectedText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into student values('"+name+"','"+roll+"',,"+"'"+branch+"','"+m+"')";
					Statement stn=(Statement) con.createStatement();
					((java.sql.Statement) stn).executeUpdate(q);
					JOptionPane.showMessageDialog(btnNewButton,"inserted successfully");
					con.close();
					
					
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(261, 271, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lbbab\\Downloads\\student-oj7omjel5czo10l6.jpg"));
		lblNewLabel_5.setBounds(0, 0, 475, 409);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
