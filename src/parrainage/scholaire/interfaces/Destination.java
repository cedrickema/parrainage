package parrainage.scholaire.interfaces;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;


public class Destination  {

	private JFrame fame1;
	private JTextField txt_user;
	private JPasswordField txt_password;

	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {

					Destination c = new Destination ();
					c.fame1.setVisible(true);
					
		
	}

	
	public Destination() {
		initialize();
	}	


	private void initialize() {
		fame1 = new JFrame();
		fame1.setResizable(false);
		fame1.getContentPane().setBackground(Color.PINK);
		fame1.getContentPane().setForeground(Color.BLACK);
		fame1.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\CARTE MEMOIRE\\Folder.jpg"));
		fame1.setBackground(new Color(0, 0, 255));
		fame1.setFont(new Font("Italic", Font.PLAIN, 14));
		fame1.setForeground(new Color(0, 204, 102));
		fame1.setTitle("parrainage scolaire");
		fame1.setBounds(100, 100, 645, 367);
		fame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txt_user = new JTextField();
		txt_user.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txt_user.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblUserName = new JLabel("username :");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton annuler = new JButton("Annuler");
		annuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fame1.setVisible(false);
			}
		});
		annuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblConnection = new JLabel("");
		lblConnection.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Saved Pictures\\download.jpg"));
		lblConnection.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		
		JButton cnx = new JButton("Connexion");
		cnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname= txt_user.getText();
				String psd= txt_password.getText();
				if(uname.equals("creche123") && psd.equals("narukota")) {
					JOptionPane.showMessageDialog(fame1,"connexion r�ussir");
					PageDeFonctionalite c = new PageDeFonctionalite();
					c.setVisible(true);
					fame1.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(fame1,"Mot de passe ou nom d'utilisateur incorect");
				}
			}
		});
		cnx.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout groupLayout = new GroupLayout(fame1.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(197)
							.addComponent(lblUserName)
							.addGap(18)
							.addComponent(txt_user, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(203)
							.addComponent(lblPassword)
							.addGap(18)
							.addComponent(txt_password, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(220)
							.addComponent(cnx)
							.addGap(26)
							.addComponent(annuler))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(161)
							.addComponent(lblConnection, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(190, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblConnection, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(lblUserName))
						.addComponent(txt_user, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(txt_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(annuler)
						.addComponent(cnx)))
		);
		fame1.getContentPane().setLayout(groupLayout);
		
	}
			
}

