package Bai2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class FramePTBacHai extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texta;
	private JTextField textb;
	private JTextField textc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePTBacHai frame = new FramePTBacHai();
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
	public FramePTBacHai() {
		setBackground(new Color(0, 255, 255));
		setFont(new Font("Times New Roman", Font.BOLD, 16));
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC HAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 352);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 49, 77, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSB.setBounds(44, 87, 77, 28);
		contentPane.add(lblNhpSB);
		
		JLabel lblCnhpSA = new JLabel("Nhập số c:");
		lblCnhpSA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCnhpSA.setBounds(44, 125, 77, 28);
		contentPane.add(lblCnhpSA);
		
		texta = new JTextField();
		texta.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		texta.setBounds(131, 55, 139, 19);
		contentPane.add(texta);
		texta.setColumns(10);
		
		textb = new JTextField();
		textb.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textb.setColumns(10);
		textb.setBounds(131, 93, 139, 19);
		contentPane.add(textb);
		
		textc = new JTextField();
		textc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textc.setColumns(10);
		textc.setBounds(131, 131, 139, 19);
		contentPane.add(textc);
		
		JButton btnNewButton = new JButton("Giải PT");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(357, 52, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(255, 255, 128));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setBounds(357, 92, 97, 23);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("Delta:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 173, 52, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("x1:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(44, 211, 52, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("x2:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(44, 249, 52, 28);
		contentPane.add(lblNewLabel_1_2);
	}

}
