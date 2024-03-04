package Bai1;

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

public class LoginJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDangNhap;
	private JTextField textMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJFrame frame = new LoginJFrame();
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
	public LoginJFrame() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("ĐĂNG NHẬP HỆ THỐNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(37, 41, 106, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMtKhu.setBounds(37, 76, 106, 31);
		contentPane.add(lblMtKhu);
		
		textDangNhap = new JTextField();
		textDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textDangNhap.setBounds(135, 48, 167, 19);
		contentPane.add(textDangNhap);
		textDangNhap.setColumns(10);
		
		textMatKhau = new JTextField();
		textMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textMatKhau.setColumns(10);
		textMatKhau.setBounds(135, 82, 167, 19);
		contentPane.add(textMatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDangNhap.setBounds(153, 125, 125, 31);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		//Lấy về tên DN và mật khẩu
		String strTen = textDangNhap.getText();
		String strMK = textMatKhau.getText();
		//Xử lý
		if(strTen.equals("63CNTT") && strMK.equals("123"))
		{
			//Hiện trang chủ
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			// Ẩn from đăng nhập
			this.setVisible(false);
		}else {
			// Báo lỗi
		}
	}

}
