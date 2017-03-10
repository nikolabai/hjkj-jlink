package hjkj.ui.panel;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class InfoRcvPanel extends JPanel{

	private JPanel backPanel;
	private JTable mainTable;
	private JScrollPane mainScroll;
	
	private JLabel rcvInfoLbl;	
	
	public InfoRcvPanel() {
		initial();
	}

	// 放置右侧列表框
		private void initial()
		{
			this.setLayout(null);
			this.setBounds(0, 0, 230, 488);
			
			rcvInfoLbl = new JLabel("接收显示");
			rcvInfoLbl.setBackground(Color.LIGHT_GRAY);
			rcvInfoLbl.setBounds(90, 0, 100, 20);
			this.add(rcvInfoLbl);
			
			
			mainTable = new JTable();
			mainTable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			// 初始化内容表头
			Object[] headCol = { "ID" , "类型" , "内容" , "时间" };
			// 添加表格
			mainScroll = new JScrollPane(mainTable);
			mainScroll.setBounds(0, 20, 230, 488);
			// 设置表头
			((DefaultTableModel) mainTable.getModel()).setColumnIdentifiers(headCol);
			// 设置列表居中
			DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
			cr.setHorizontalAlignment(JLabel.CENTER);
			mainTable.setDefaultRenderer(Object.class, cr);
		
			mainTable.revalidate();
			
//			this.add(backPanel);
			this.add(mainScroll);
			this.setBackground(Color.blue);
		}
}
