package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class UserUI  extends JFrame {

	public UserUI(){
		JFrame jFrame = new JFrame();
		
		
		
		Box box = Box.createVerticalBox();
		
		//hiển thị thông tin nhập liệu
		JPanel pnlUserInfo= new JPanel();
		//set border
		pnlUserInfo.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(new Color(0, 191, 255)), "Quản Lý Nhân viên", TitledBorder.CENTER,
				TitledBorder.TOP, new Font("arial", Font.BOLD, 40)));
		//set layout là 2 hàng và 4 cột
		pnlUserInfo.setLayout(new GridLayout(2, 4, 20, 20));
		pnlUserInfo.setMaximumSize(new Dimension(2000,120));
		pnlUserInfo.setMinimumSize(new Dimension(2000,120));
		
		pnlUserInfo.add(new JLabel("Mã Nhân Viên:"));
		final JTextField txtId = new JTextField(30);
		pnlUserInfo.add(txtId);
		pnlUserInfo.add(new JLabel("Tên Nhân Viên:"));
		final JTextField txtName = new JTextField(30);
		pnlUserInfo.add(txtName);
		pnlUserInfo.add(new JLabel("Năm sinh Nhân Viên:"));
		final JTextField txtBirthYear = new JTextField(30);
		pnlUserInfo.add(txtBirthYear);
		pnlUserInfo.add(new JLabel("Giới tính Nhân Viên:"));
		String[] listGender = { "Nam", "Nữ" };
		final JComboBox cmbGender = new JComboBox(listGender);
		pnlUserInfo.add(cmbGender);
		
		//hiển thị thông tin các nút
		JPanel pnlAction = new JPanel();
		final JButton btnAdd = new JButton("Thêm");
		pnlAction.add(btnAdd);
		final JButton btnDel = new JButton("Xóa");
		pnlAction.add(btnDel);
		final JButton btnUpdate = new JButton("Cập nhật");
		pnlAction.add(btnUpdate);
		
		//hiển thị bảng
		final DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Mã");
		model.addColumn("Tên");
		model.addColumn("Năm sinh");
		model.addColumn("Giới tính");
		
		//thêm dữ liệu ảo
		model.addRow(new Object[] {"1","Nguyễn Văn Tèo","2017","Nam"});
		model.addRow(new Object[] {"2","Trần Văn Tí","2014","Nam"});
		
		final JTable table = new JTable(model);
		final JScrollPane pane = new JScrollPane(table);
		
		box.add(pnlUserInfo);
		box.add(pnlAction);
		box.add(pane);
		jFrame.add(box);
		
		jFrame.setSize(2000, 1100);
		jFrame.setLocation(-8, 0);
		jFrame.setVisible(true);
	}
}
