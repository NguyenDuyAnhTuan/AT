import javax.swing.*;
import java.awt.event.*;
public class TinhTongGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính Tổng Hai Số");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nhãn và ô nhập số thứ nhất
        JLabel label1 = new JLabel("Số thứ nhất:");
        label1.setBounds(20, 20, 100, 25);
        frame.add(label1);

        JTextField field1 = new JTextField();
        field1.setBounds(130, 20, 120, 25);
        frame.add(field1);

        // Nhãn và ô nhập số thứ hai
        JLabel label2 = new JLabel("Số thứ hai:");
        label2.setBounds(20, 60, 100, 25);
        frame.add(label2);

        JTextField field2 = new JTextField();
        field2.setBounds(130, 60, 120, 25);
        frame.add(field2);

        // Nút tính tổng
        JButton btnTinhTong = new JButton("Tính tổng");
        btnTinhTong.setBounds(90, 100, 100, 30);
        frame.add(btnTinhTong);

        // Nhãn kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");
        resultLabel.setBounds(20, 150, 250, 25);
        frame.add(resultLabel);

        // Sự kiện khi nhấn nút
        btnTinhTong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(field1.getText());
                    double so2 = Double.parseDouble(field2.getText());
                    double tong = so1 + so2;

                    resultLabel.setText("Kết quả: " + tong);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}