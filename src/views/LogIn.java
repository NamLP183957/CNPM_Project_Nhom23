package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.User;
import controllers.LogInStatus;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	private JLabel status;
	private LogInStatus logIn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setTitle("log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 283);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User name");
		lblNewLabel.setIcon(new ImageIcon("G:\\hoc phan 20201\\cnpm\\poject\\CNPM_Project_Nhom23\\src\\icon\\Write.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 68, 114, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(134, 73, 220, 22);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\hoc phan 20201\\cnpm\\poject\\CNPM_Project_Nhom23\\src\\icon\\Key.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 112, 114, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel loginstatus = new JLabel("Log in");
		loginstatus.setForeground(Color.DARK_GRAY);
		loginstatus.setBackground(Color.WHITE);
		loginstatus.setIcon(new ImageIcon("G:\\hoc phan 20201\\cnpm\\poject\\CNPM_Project_Nhom23\\src\\icon\\client.png"));
		loginstatus.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		loginstatus.setHorizontalAlignment(SwingConstants.CENTER);
		loginstatus.setBounds(0, 0, 361, 57);
		contentPane.add(loginstatus);
		
		JButton login = new JButton("Log in");
		login.setVerticalAlignment(SwingConstants.TOP);
		login.setHorizontalAlignment(SwingConstants.LEFT);
		login.setIcon(new ImageIcon("G:\\hoc phan 20201\\cnpm\\poject\\CNPM_Project_Nhom23\\src\\icon\\001_06.gif"));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logIn = new LogInStatus();
				String sta = logIn.getNoticeOnLogIn(username.getText(), String.valueOf(password.getPassword()));
				if(sta!=null) {
					status.setText(sta);
				}else {
					MainFrame mainLayout = new MainFrame();
					mainLayout.setVisible(true);
					setVisible(false);
					status.setText("");
					username.setText("");
					password.setText("");
				}
			}

		});
		
		login.setFont(new Font("Times New Roman", Font.BOLD, 14));
		login.setBounds(10, 165, 114, 33);
		contentPane.add(login);
		
		JButton create = new JButton("Create new account");
		create.setIcon(new ImageIcon("G:\\hoc phan 20201\\cnpm\\poject\\CNPM_Project_Nhom23\\src\\icon\\001_03.gif"));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status.setText(LogInStatus.getNoticeOnCreate(username.getText(),String.valueOf(password.getPassword())));
			}
		});
		create.setFont(new Font("Times New Roman", Font.BOLD, 14));
		create.setBounds(165, 165, 189, 33);
		contentPane.add(create);
		
		status = new JLabel("");
		status.setBackground(new Color(255, 255, 255));
		status.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setBounds(0, 209, 361, 25);
		status.setForeground(Color.red);
		contentPane.add(status);
		
		password = new JPasswordField();
		password.setBounds(134, 117, 220, 22);
		contentPane.add(password);
	}
}
