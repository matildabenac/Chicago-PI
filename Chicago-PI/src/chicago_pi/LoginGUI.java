package chicago_pi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class LoginGUI{
	
	// JTextField 
    static JTextField textField; 
  
    // JPasswodField 
    static JPasswordField passwordField; 

    public static void main(String[] args) {
        new LoginGUI();
    }

    public LoginGUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("ChicagoCrime");
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBackground(Color.LIGHT_GRAY);
                
                JPanel content = new JPanel(new GridBagLayout());  
                content.setBackground(Color.LIGHT_GRAY);
                content.setBorder(new EmptyBorder(20, 20, 20, 20));
                frame.setContentPane(content);
                frame.getContentPane().add(new LoginPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);           
            }
        });
    }

    public class LoginPane extends JPanel {

        public LoginPane() {
        	setBackground(Color.LIGHT_GRAY);
        	
        	setLayout(new GridBagLayout());
        	GridBagConstraints c = new GridBagConstraints();
        	
        	Border border1 = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 25);
        	setBorder(border1);
        	
        	c.gridx = 0;//set the x location of the grid for the next component
            c.gridy = 0;//set the y location of the grid for the next component
           
        	JLabel lblChicagocrime = new JLabel("CHICAGOCRIME");
    		lblChicagocrime.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 45));
    		lblChicagocrime.setBounds(410, 193, 348, 101);
    		add(lblChicagocrime, c);
    		
    		c.gridy = 1;//set the y location of the grid for the next component
    		JLabel separator1 = new JLabel();
    		separator1.setPreferredSize(new Dimension(10, 30));
    		add(separator1, c);
    		
    		Border border2 = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 8);    	
    		 		
    		c.gridy = 2;//set the y location of the grid for the next component
    		JLabel lblKorisnikoIme = new JLabel("Korisni\u010Dko ime");
    		lblKorisnikoIme.setFont(new Font("Raleway", Font.PLAIN, 17));
    		lblKorisnikoIme.setBounds(478, 312, 127, 35);
    		lblKorisnikoIme.setBorder(border2);
    		add(lblKorisnikoIme, c);
    		
    		Border border3 = BorderFactory.createLineBorder(Color.WHITE, 8);    	
    		
    		c.gridy = 3;//set the y location of the grid for the next component
    		textField = new JTextField();
    		textField.setFont(new Font("Georgia", Font.PLAIN, 16));
    		textField.setColumns(15); 
    		textField.setBorder(border3);
    		add(textField, c);
    		
    		c.gridy = 4;//set the y location of the grid for the next component
    		JLabel separator2 = new JLabel();
    		separator2.setPreferredSize(new Dimension(10, 25));
    		add(separator2, c);
    		
    		c.gridy = 5;//set the y location of the grid for the next component   		   		
    		JLabel lblLozinka = new JLabel("Lozinka");
    		lblLozinka.setFont(new Font("Raleway", Font.PLAIN, 17));    	
    		lblLozinka.setBorder(border2);
    		add(lblLozinka, c);
    		
    		c.gridy = 6;//set the y location of the grid for the next component   		 
    		passwordField = new JPasswordField();
    		passwordField.setFont(new Font("Georgia", Font.PLAIN, 16));
    		passwordField.setColumns(15);  	
    		passwordField.setBorder(border3);
    		add(passwordField, c);
    		
    		c.gridy = 7;//set the y location of the grid for the next component
    		JLabel separator3 = new JLabel();
    		separator3.setPreferredSize(new Dimension(10, 50));
    		add(separator3, c);
    		
    		c.gridy = 8;//set the y location of the grid for the next component   		 
    		JButton btnNewButton = new JButton("LOG IN");
    		btnNewButton.setBackground(UIManager.getColor("Button.focus"));
    		btnNewButton.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
    		btnNewButton.setForeground(UIManager.getColor("Button.focus"));
    		btnNewButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    			}
    		});
    		btnNewButton.setPreferredSize(new Dimension(150, 40));
    		add(btnNewButton, c);
    		
    		
        }

    }

}