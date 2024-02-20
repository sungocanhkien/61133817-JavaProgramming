package Java_Swing;
import javax.swing.*; 
import java.awt.event.*; 

public class MenuExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Example"); // Tạo một cửa sổ JFrame với tiêu đề "Menu Example"
        JMenuBar menuBar = new JMenuBar(); // Tạo một menu bar JMenuBar
        JMenu fileMenu = new JMenu("File"); // Tạo một menu "File" JMenu
        
        JMenuItem newItem = new JMenuItem("New"); // Tạo một JMenuItem "New"
        JMenuItem openItem = new JMenuItem("Open"); // Tạo một JMenuItem "Open"
        JMenuItem saveItem = new JMenuItem("Save"); // Tạo một JMenuItem "Save"
        JMenuItem exitItem = new JMenuItem("Exit"); // Tạo một JMenuItem "Exit"
        
        fileMenu.add(newItem); // Thêm mục "New" vào menu "File"
        fileMenu.add(openItem); // Thêm mục "Open" vào menu "File"
        fileMenu.add(saveItem); // Thêm mục "Save" vào menu "File"
        fileMenu.add(exitItem); // Thêm mục "Exit" vào menu "File"
        
        fileMenu.add(newItem); // Thêm mục "New" vào menu "File"
        fileMenu.add(openItem); // Thêm mục "Open" vào menu "File"
        fileMenu.add(saveItem); // Thêm mục "Save" vào menu "File"
        fileMenu.add(exitItem); // Thêm mục "Exit" vào menu "File"
        
        exitItem.addActionListener(new ActionListener() { // Thêm sự kiện ActionListener cho mục "Exit" để thoát chương trình
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Thoát chương trình khi mục "Exit" được nhấp
            }
        });
        
        menuBar.add(fileMenu); // Thêm menu "File" vào menu bar
        frame.setJMenuBar(menuBar); // Đặt menu bar vào cửa sổ JFrame
        
        frame.setSize(300, 200); // Đặt kích thước của cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đặt hành động mặc định khi đóng cửa sổ
        frame.setVisible(true); // Hiển thị cửa sổ
	}
}
