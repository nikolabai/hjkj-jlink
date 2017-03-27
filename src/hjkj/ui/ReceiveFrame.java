package hjkj.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gavin on 2017/3/21.
 *
 */
public class ReceiveFrame extends JFrame implements ActionListener {

    //单例
    private static ReceiveFrame receiveFrame;
    public static ReceiveFrame getInstance(){
        if(receiveFrame == null){
            receiveFrame = new ReceiveFrame();
        }
        return receiveFrame;
    }

    //
    private JPanel backPanel;
    private JTable mainTable;
    private JScrollPane mainScroll;

    private JLabel rcvInfoLbl;

    public ReceiveFrame() {
        initial();
    }

    // 放置右侧列表框
    private void initial()
    {
        this.setLayout(null);
        this.setBounds(600, 100, 300, 300);
        this.setResizable(false);


        rcvInfoLbl = new JLabel("接收显示");
        rcvInfoLbl.setBackground(Color.LIGHT_GRAY);
        rcvInfoLbl.setBounds(120, 0, 100, 20);
        this.add(rcvInfoLbl);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        mainTable = new JTable();
        mainTable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        // 初始化内容表头
        Object[] headCol = { "ID" , "类型" , "内容" , "时间" };
        // 添加表格
        mainScroll = new JScrollPane(mainTable);
        mainScroll.setBounds(0, 20, 300, 280);
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






    public static void main(String[] args) {
        new ReceiveFrame().setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
