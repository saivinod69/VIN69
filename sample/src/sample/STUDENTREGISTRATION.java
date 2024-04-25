package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class STUDENTREGISTRATION {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENTREGISTRATION window = new STUDENTREGISTRATION();
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
	public STUDENTREGISTRATION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(73, 26, 271, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(73, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(73, 92, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(73, 129, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(73, 154, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(147, 150, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(286, 150, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(73, 179, 63, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setBounds(146, 176, 76, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 11));
		c2.setBounds(224, 175, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setFont(new Font("Tahoma", Font.BOLD, 11));
		c3.setBounds(323, 176, 97, 23);
		frame.getContentPane().add(c3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.BOLD, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "EEE", "ECE", "CS", "IOT"}));
		cb1.setBounds(167, 125, 89, 22);
		frame.getContentPane().add(cb1);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		t1 = new JTextField();
		t1.setBounds(148, 62, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(147, 89, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=t1.getText();
				String name=t2.getText();
				String branch=(String)cb1.getSelectedItem();
				String gender="";
				String langs="";
				if(r1.isSelected())
				{
					gender="Male";
				}
				if(r1.isSelected())
				{
					gender="Female";
				}
				if(c1.isSelected())
				{
					langs=langs+"c  ";
				}
				if(c2.isSelected())
				{
					langs=langs+"java ";
				}
				if(c1.isSelected())
				{
					langs=langs+"         python";
				}
				JOptionPane.showMessageDialog(btnNewButton, "ROLL :"+roll+"\n NAME :"+name+
						"\n BRANCH :"+branch+"\n GENDER :"+gender+"\n PROG LANGS :"+langs);

			}
		});
		btnNewButton.setBounds(167, 211, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
