package chicago_pi;

import java.awt.EventQueue;

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

public class MainGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1182, 753);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1182, 64);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHICAGOCRIME");
		lblNewLabel.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 30));
		lblNewLabel.setBounds(50, 13, 240, 38);
		panel_1.add(lblNewLabel);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		btnLogOut.setBackground(Color.DARK_GRAY);
		btnLogOut.setBounds(1002, 13, 154, 35);
		panel_1.add(btnLogOut);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("Odaberi podru\u010Dje...");
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 64, 340, 689);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPodruje = new JLabel("Podru\u010Dje");
		lblPodruje.setBounds(51, 97, 102, 19);
		lblPodruje.setForeground(Color.WHITE);
		lblPodruje.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		panel_2.add(lblPodruje);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox.setBounds(51, 120, 228, 27);
		comboBox.addItem("dummy one");
		comboBox.addItem("dummy two");
		comboBox.addItem("dummy three");
		panel_2.add(comboBox);
		
		JLabel lblVrijeme = new JLabel("Vrijeme");
		lblVrijeme.setForeground(Color.WHITE);
		lblVrijeme.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblVrijeme.setBounds(51, 213, 102, 19);
		panel_2.add(lblVrijeme);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_1.setBounds(159, 236, 120, 27);
		comboBox_1.addItem("00:00"); comboBox_1.addItem("01:00");
		comboBox_1.addItem("02:00"); comboBox_1.addItem("03:00");
		comboBox_1.addItem("04:00"); comboBox_1.addItem("05:00");
		comboBox_1.addItem("06:00"); comboBox_1.addItem("07:00");
		comboBox_1.addItem("08:00"); comboBox_1.addItem("09:00");
		comboBox_1.addItem("10:00"); comboBox_1.addItem("11:00");
		comboBox_1.addItem("12:00"); comboBox_1.addItem("13:00");
		comboBox_1.addItem("14:00"); comboBox_1.addItem("15:00");
		comboBox_1.addItem("16:00"); comboBox_1.addItem("17:00");
		comboBox_1.addItem("18:00"); comboBox_1.addItem("19:00");
		comboBox_1.addItem("20:00"); comboBox_1.addItem("21:00");
		comboBox_1.addItem("22:00"); comboBox_1.addItem("22:00");
		comboBox_1.addItem("23:00");
		panel_2.add(comboBox_1);
		
		JLabel lblOd = new JLabel("Od:");
		lblOd.setForeground(Color.WHITE);
		lblOd.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblOd.setBounds(108, 245, 39, 19);
		panel_2.add(lblOd);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_2.setBounds(159, 268, 120, 27);
		comboBox_2.addItem("00:00"); comboBox_2.addItem("01:00");
		comboBox_2.addItem("02:00"); comboBox_2.addItem("03:00");
		comboBox_2.addItem("04:00"); comboBox_2.addItem("05:00");
		comboBox_2.addItem("06:00"); comboBox_2.addItem("07:00");
		comboBox_2.addItem("08:00"); comboBox_2.addItem("09:00");
		comboBox_2.addItem("10:00"); comboBox_2.addItem("11:00");
		comboBox_2.addItem("12:00"); comboBox_2.addItem("13:00");
		comboBox_2.addItem("14:00"); comboBox_2.addItem("15:00");
		comboBox_2.addItem("16:00"); comboBox_2.addItem("17:00");
		comboBox_2.addItem("18:00"); comboBox_2.addItem("19:00");
		comboBox_2.addItem("20:00"); comboBox_2.addItem("21:00");
		comboBox_2.addItem("22:00"); comboBox_2.addItem("23:00");
		panel_2.add(comboBox_2);
		
		JLabel lblDo = new JLabel("Do:");
		lblDo.setForeground(Color.WHITE);
		lblDo.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblDo.setBounds(108, 272, 39, 19);
		panel_2.add(lblDo);
		
		JLabel lblTipZloina = new JLabel("Tip zlo\u010Dina");
		lblTipZloina.setForeground(Color.WHITE);
		lblTipZloina.setFont(new Font("Raleway SemiBold", Font.PLAIN, 16));
		lblTipZloina.setBounds(51, 353, 102, 19);
		panel_2.add(lblTipZloina);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Raleway", Font.PLAIN, 15));
		comboBox_3.setBounds(51, 376, 228, 27);
		comboBox_3.addItem("dummy one");
		comboBox_3.addItem("dummy two");
		comboBox_3.addItem("dummy three");
		panel_2.add(comboBox_3);
		
		JButton btnOdaberi = new JButton("ODABERI");
		btnOdaberi.setForeground(Color.BLACK);
		btnOdaberi.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		btnOdaberi.setBackground(Color.LIGHT_GRAY);
		btnOdaberi.setBounds(93, 479, 154, 35);
		panel_2.add(btnOdaberi);
		
		JButton btnPovijestPretraivanja = new JButton("POVIJEST PRETRA\u017DIVANJA");
		btnPovijestPretraivanja.setForeground(Color.BLACK);
		btnPovijestPretraivanja.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 14));
		btnPovijestPretraivanja.setBackground(Color.GRAY);
		btnPovijestPretraivanja.setBounds(60, 575, 219, 35);
		panel_2.add(btnPovijestPretraivanja);
	}
}
