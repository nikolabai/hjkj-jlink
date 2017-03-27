package hjkj.ui.panel.main;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by YUB on 17/3/14.
 */
public class DirectTablePanel extends JPanel{

    private JTable mainTable;
    private JScrollPane mainScroll;

    private JLabel titleLbl;

    private JButton editBtn;
    private JButton okBtn;

    public DirectTablePanel() {
        initial();
    }

    private void initial()
    {
        this.setLayout(null);
        this.setBounds(0, 0, 230, 288);

        //标题
        titleLbl = new JLabel("指挥表信息");
        titleLbl.setBackground(Color.LIGHT_GRAY);
        titleLbl.setBounds(90, 0, 100, 20);
        this.add(titleLbl);

        //表格（放在mainscroll中）
        mainTable = new JTable();
        mainTable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        // 初始化内容表头
        Object[] headCol = { "转发源" , "源类型" , "消息类型" , "目的源", "目的类型" };

        // 添加表格
        mainScroll = new JScrollPane(mainTable);
        mainScroll.setBounds(0, 20, 230, 245);

        // 设置表头
        ((DefaultTableModel) mainTable.getModel()).setColumnIdentifiers(headCol);

        // 设置列表居中
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);
        mainTable.setDefaultRenderer(Object.class, cr);
        mainTable.revalidate();
        this.add(mainScroll);

        //添加按钮
        editBtn = new JButton("编辑");
        editBtn.setBounds(120, 266, 50, 20);
        this.add(editBtn);
        okBtn = new JButton("确认");
        okBtn.setBounds(172, 266, 50, 20);
        this.add(okBtn);

        this.setBackground(Color.blue);
    }
}
