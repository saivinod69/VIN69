package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MOVIETICKETBOOKING {

	protected static final int YESOPTION = 0;
	private JFrame frame;
	private final JLabel lblNewLabel_1 = new JLabel("MOVIE TICKET BOOKING");
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOVIETICKETBOOKING window = new MOVIETICKETBOOKING();
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
	public MOVIETICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(93, 43, 101, -18);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(117, 11, 205, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setBackground(new Color(255, 128, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(79, 67, 60, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(211, 64, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE NAME");
		lblNewLabel_3.setForeground(new Color(255, 255, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(79, 117, 101, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KGF", "DUNE", "RRR"}));
		cb1.setBounds(221, 113, 76, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(20, 117, -92, -18);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TICKETS");
		lblNewLabel_5.setForeground(new Color(255, 255, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(79, 180, 76, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBackground(new Color(255, 255, 255));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		cb2.setBounds(221, 176, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals	("KGF"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals	("DUNE"))
				{
					bill=bill+nt*250;
				}
				if(movie.equals	("RRR"))
				{
					bill=bill+nt*350;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"NAME:"+name+"\n MOVIE NAME :"+movie+"\n TICKETS :"+nt);
				if(res==YESOPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED");
				}
					
				}
		});
		btnNewButton.setBounds(168, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online lbbab\\Downloads\\dune-movie-poster.jpg"));
		lblNewLabel_6.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
