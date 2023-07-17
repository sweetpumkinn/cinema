package snackbar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import c_loginout.Sign_in;

public class Admin_Snack_panel extends JPanel {

	Sign_in sign_in;
	private JTable table;
	private JScrollPane jscroll;
	private DefaultTableModel tableModel;
	Object ob[][] = new Object[0][4];
	String[] title = { "발주번호", "품목명", "수량", "가격" };
	private JTextField textField;
	public String selectedName1; 

	public Admin_Snack_panel(Sign_in signin) {
		this.sign_in = signin;

		tableModel = new DefaultTableModel(ob, title);
		setLayout(null);
		table = new JTable(tableModel);
		jscroll = new JScrollPane(table);
		jscroll.setBounds(6, 10, 776, 620);
		jscroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jscroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);		
		add(jscroll);

		JButton btnNewButton = new JButton("발주 취소");
		btnNewButton.setBounds(6, 640, 375, 35);
		add(btnNewButton);

		JButton b_all = new JButton("발주 전체보기");
		b_all.setBounds(415, 640, 367, 35);
		add(b_all);

		textField = new JTextField();
		textField.setBounds(209, 703, 172, 21);
		add(textField);
		textField.setColumns(10);

		JLabel jlabel_a = new JLabel("발주번호로 정보 검색");
		jlabel_a.setBounds(26, 704, 171, 18);
		jlabel_a.setFont(new Font("굴림", Font.BOLD, 15));
		add(jlabel_a);

		JButton b_search = new JButton("검 색");
		b_search.setBounds(415, 696, 172, 35);
		add(b_search);

		JButton b_back = new JButton("돌아가기");
		b_back.setBounds(610, 696, 172, 35);
		add(b_back);

		// 돌아가기
		b_back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sign_in.card.show(sign_in.pg, "admin");
			}
		});
	}

}
