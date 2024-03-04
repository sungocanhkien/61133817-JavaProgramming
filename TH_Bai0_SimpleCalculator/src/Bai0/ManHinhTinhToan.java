package Bai0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhTinhToan frame = new ManHinhTinhToan();
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
	public ManHinhTinhToan() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("Chương Trình Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 45, 143, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSTh.setBounds(44, 101, 143, 25);
		contentPane.add(lblNhpSTh);
		
		textField = new JTextField();
		textField.setBounds(183, 49, 212, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 105, 212, 19);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Cộng");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(81, 186, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnTr = new JButton("Trừ");
		btnTr.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTr.setBounds(194, 187, 85, 21);
		contentPane.add(btnTr);
		
		JButton btnNhn = new JButton("Nhân");
		btnNhn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNhn.setBounds(304, 187, 85, 21);
		contentPane.add(btnNhn);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnChia.setBounds(428, 187, 85, 21);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(44, 258, 143, 25);
		contentPane.add(lblKtQuTnh);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 262, 212, 19);
		contentPane.add(textField_2);
	}
}
