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
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

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
		setBounds(100, 100, 604, 381);
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
		
		txtA = new JTextField();
		txtA.setBounds(183, 49, 212, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(183, 105, 212, 19);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý cộng
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCong.setBounds(81, 186, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTru.setBounds(194, 187, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNhan.setBounds(304, 187, 85, 21);
		contentPane.add(btnNhan);
		
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
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(183, 262, 212, 19);
		contentPane.add(txtKetQua);
	}
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu dữ liệu biến
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// Tính toán
		double tong = soA + soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu dữ liệu biến
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// Tính toán
		double tru = soA - soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tru));	
	}
}
