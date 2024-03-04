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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePTBacHai extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texta;
	private JTextField textb;
	private JTextField textc;
	private JTextField textDelta;
	private JTextField textX1;
	private JTextField textX2;

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
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(44, 49, 77, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNhpSB.setBounds(44, 87, 77, 28);
		contentPane.add(lblNhpSB);
		
		JLabel lblCnhpSA = new JLabel("Nhập số c:");
		lblCnhpSA.setFont(new Font("Times New Roman", Font.BOLD, 16));
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
		
		JButton btnGPT = new JButton("Giải PT");
		btnGPT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamGPT();
			}
		});
		btnGPT.setBackground(new Color(128, 255, 255));
		btnGPT.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnGPT.setBounds(357, 52, 97, 23);
		contentPane.add(btnGPT);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamReset();
			}
		});
		btnReset.setBackground(new Color(255, 255, 128));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setBounds(357, 92, 97, 23);
		contentPane.add(btnReset);
		
		JLabel txtDelta = new JLabel("Delta:");
		txtDelta.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtDelta.setBounds(44, 173, 52, 28);
		contentPane.add(txtDelta);
		
		JLabel txtx1 = new JLabel("x1:");
		txtx1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtx1.setBounds(44, 211, 52, 28);
		contentPane.add(txtx1);
		
		JLabel txtx2 = new JLabel("x2:");
		txtx2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtx2.setBounds(44, 249, 52, 28);
		contentPane.add(txtx2);
		
		textDelta = new JTextField();
		textDelta.setEditable(false);
		textDelta.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textDelta.setBounds(106, 179, 165, 19);
		contentPane.add(textDelta);
		textDelta.setColumns(10);
		
		textX1 = new JTextField();
		textX1.setEditable(false);
		textX1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textX1.setColumns(10);
		textX1.setBounds(105, 218, 165, 19);
		contentPane.add(textX1);
		
		textX2 = new JTextField();
		textX2.setEditable(false);
		textX2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textX2.setColumns(10);
		textX2.setBounds(106, 256, 165, 19);
		contentPane.add(textX2);
	}
	void HamReset() {
		texta.setText("");
		textb.setText("");
		textc.setText("");
	}
	void HamGPT() {
		double a = Double.parseDouble(texta.getText());
		double b = Double.parseDouble(texta.getText());
		double c = Double.parseDouble(texta.getText());
		
		double delta = b*b-4*a*c;
		
		textDelta.setText(String.valueOf(delta));
	}

}
