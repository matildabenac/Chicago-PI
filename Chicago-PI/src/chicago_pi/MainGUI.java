package chicago_pi;

import java.awt.EventQueue;

import java.awt.Dimension;
import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.JComboBox;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainGUI {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ConnectionManager cntMan = new ConnectionManager();
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setMinimumSize(new Dimension(1470, 700));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 3500, 64);
		frame.getContentPane().add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHICAGOCRIME");
		lblNewLabel.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 30));
		lblNewLabel.setBounds(50, 13, 240, 38);
		panel_1.add(lblNewLabel);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		btnLogOut.setBackground(Color.DARK_GRAY);
		btnLogOut.setBounds(450, 13, 154, 35);
		panel_1.add(btnLogOut);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 340, 1200);
		frame.getContentPane().add(panel_2);
		panel_2.setToolTipText("Odaberi podru\u010Dje...");
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setLayout(null);
		
		JLabel lblPodrucje = new JLabel("Podru\u010Dje");
		lblPodrucje.setBounds(51, 97, 102, 19);
		lblPodrucje.setForeground(Color.WHITE);
		lblPodrucje.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		panel_2.add(lblPodrucje);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox.setBounds(51, 120, 228, 27);
		comboBox.addItem("All");
		cntMan.CreateConnection();
		ResultSet rsBlock = cntMan.sendQuery("SELECT DISTINCT Block FROM Crime ORDER BY Block");
		try {
			while(rsBlock.next())
			{
				comboBox.addItem(rsBlock.getString("Block"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cntMan.CloseConnection();
		panel_2.add(comboBox);
		
		JLabel lblVrijeme = new JLabel("Vrijeme");
		lblVrijeme.setForeground(Color.WHITE);
		lblVrijeme.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblVrijeme.setBounds(51, 190, 102, 19);
		panel_2.add(lblVrijeme);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_1.setBounds(159, 215, 120, 27);
		comboBox_1.addItem("00:00"); 
		comboBox_1.addItem("01:00");
		comboBox_1.addItem("02:00"); 
		comboBox_1.addItem("03:00");
		comboBox_1.addItem("04:00"); 
		comboBox_1.addItem("05:00");
		comboBox_1.addItem("06:00"); 
		comboBox_1.addItem("07:00");
		comboBox_1.addItem("08:00"); 
		comboBox_1.addItem("09:00");
		comboBox_1.addItem("10:00"); 
		comboBox_1.addItem("11:00");
		comboBox_1.addItem("12:00");
		
		comboBox_1.addItem("13:00"); 
		comboBox_1.addItem("14:00");
		comboBox_1.addItem("15:00"); 
		comboBox_1.addItem("16:00");
		comboBox_1.addItem("17:00"); 
		comboBox_1.addItem("18:00");
		comboBox_1.addItem("19:00"); 
		comboBox_1.addItem("20:00");
		comboBox_1.addItem("21:00"); 
		comboBox_1.addItem("22:00");
		comboBox_1.addItem("23:00"); 

		panel_2.add(comboBox_1);
		
		JLabel lblOd = new JLabel("Od:");
		lblOd.setForeground(Color.WHITE);
		lblOd.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblOd.setBounds(108, 217, 39, 19);
		panel_2.add(lblOd);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_2.setBounds(159, 250, 120, 27); 
		comboBox_2.addItem("01:00");
		comboBox_2.addItem("02:00"); 
		comboBox_2.addItem("03:00");
		comboBox_2.addItem("04:00"); 
		comboBox_2.addItem("05:00");
		comboBox_2.addItem("06:00"); 
		comboBox_2.addItem("07:00");
		comboBox_2.addItem("08:00"); 
		comboBox_2.addItem("09:00");
		comboBox_2.addItem("10:00"); 
		comboBox_2.addItem("11:00");
		comboBox_2.addItem("12:00");
		
		comboBox_2.addItem("13:00"); 
		comboBox_2.addItem("14:00");
		comboBox_2.addItem("15:00"); 
		comboBox_2.addItem("16:00");
		comboBox_2.addItem("17:00"); 
		comboBox_2.addItem("18:00");
		comboBox_2.addItem("19:00"); 
		comboBox_2.addItem("20:00");
		comboBox_2.addItem("21:00"); 
		comboBox_2.addItem("22:00");
		comboBox_2.addItem("23:00");
		comboBox_2.addItem("00:00");
		panel_2.add(comboBox_2);
		
		JLabel lblDo = new JLabel("Do:");
		lblDo.setForeground(Color.WHITE);
		lblDo.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblDo.setBounds(108, 252, 39, 19);
		panel_2.add(lblDo);
		
		
		JLabel lblTipZloina = new JLabel("Tip zlo\u010Dina");
		lblTipZloina.setForeground(Color.WHITE);
		lblTipZloina.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblTipZloina.setBounds(51, 325, 102, 19);
		panel_2.add(lblTipZloina);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_3.setBounds(51, 348, 228, 27);
		comboBox_3.addItem("All");
		cntMan.CreateConnection();
		ResultSet rsPrimary = cntMan.sendQuery("SELECT DISTINCT Primary_type FROM Crime ORDER BY Primary_type");
		try {
			while(rsPrimary.next())
			{
				comboBox_3.addItem(rsPrimary.getString("Primary_type"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cntMan.CloseConnection();
		panel_2.add(comboBox_3);
		
		JLabel format_baze = new JLabel("Format baze");
		format_baze.setForeground(Color.WHITE);
		format_baze.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		format_baze.setBounds(51, 422, 100, 19);
		panel_2.add(format_baze);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_4.setBounds(175, 420, 100, 27);
		comboBox_4.addItem("sql"); 
		comboBox_4.addItem("csv");
		panel_2.add(comboBox_4);
		
		JLabel algoritam = new JLabel("Algoritam");
		algoritam.setForeground(Color.WHITE);
		algoritam.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		algoritam.setBounds(51, 452, 100, 19);
		panel_2.add(algoritam);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_5.setBounds(175, 450, 100, 27);
		comboBox_5.addItem("Apriori"); 
		comboBox_5.addItem("Filtered Associator");
		panel_2.add(comboBox_5);
		
		JButton btnOdaberi = new JButton("ODABERI");
		btnOdaberi.setForeground(Color.BLACK);
		btnOdaberi.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		btnOdaberi.setBackground(Color.LIGHT_GRAY);
		btnOdaberi.setBounds(93, 520, 154, 35);
		panel_2.add(btnOdaberi);
		
		
		JButton btnPovijestPretraivanja = new JButton("POVIJEST PRETRA\u017DIVANJA");
		btnPovijestPretraivanja.setForeground(Color.BLACK);
		btnPovijestPretraivanja.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 14));
		btnPovijestPretraivanja.setBackground(Color.GRAY);
		btnPovijestPretraivanja.setBounds(60, 575, 219, 35);
		panel_2.add(btnPovijestPretraivanja);
		
		JTextPane pane = new JTextPane();
		pane.setBounds(400, 130, 1000, 700);
		frame.getContentPane().add(pane);
		
		btnOdaberi.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		        AprioriAlghorithm apr = new AprioriAlghorithm(comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(), comboBox.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString());
		        String str = apr.search();
		        pane.setText(str);
		    }
		});
		
	}
}
