package Bai2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FramePTBacHai extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC HAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 300);
		contentPane = new JPanel();
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
	}

}
