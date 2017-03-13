package hjkj.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import hjkj.ui.panel.AlarmQuerypanel;
import hjkj.ui.panel.LinkStatusPanel;
import hjkj.ui.panel.NodeStatusPanel;
import hjkj.ui.panel.PerformanceQueryPanel;

/**
 * 
 * @author hj Gavin 查询界面
 */
public class QueryFrame extends JFrame implements ActionListener{
	private JPanel panel1;
	private JPanel panel2;
	private JTabbedPane tabbedPane1;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	
	public QueryFrame(){
		init();
		setVisible(true);
	}
	private void init(){
		setBounds(300, 200, 1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(" 信息查询界面");
		
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(0,40));
		panel1.setLayout(null);
		add(panel1,BorderLayout.NORTH);
		
		label1 = new JLabel("设备类型");
		label1.setBounds(20, 10, 60, 20);
		panel1.add(label1);
		
		label2 = new JLabel("嵌入式版本");
		label2.setBounds(180, 10, 80, 20);
		panel1.add(label2);
		
		label3 = new JLabel("FPGA版本");
		label3.setBounds(360, 10, 60, 20);
		panel1.add(label3);
		
		label4 = new JLabel("错包门限");
		label4.setBounds(530, 10, 60, 20);
		panel1.add(label4);
		
		textField1= new JTextField();
		textField1.setBounds(80, 10, 80, 20);
		panel1.add(textField1);
		
		textField2= new JTextField();
		textField2.setBounds(250, 10, 80, 20);
		panel1.add(textField2);
		
		textField3= new JTextField();
		textField3.setBounds(420, 10, 80, 20);
		panel1.add(textField3);
		
		textField4= new JTextField();
		textField4.setBounds(590,10, 80, 20);
		panel1.add(textField4);

		//选项卡
		tabbedPane1 = new JTabbedPane();
		tabbedPane1.setBackground(Color.orange);
		add(tabbedPane1,BorderLayout.CENTER);

		NodeStatusPanel nodeStatusPanel =new NodeStatusPanel();
		tabbedPane1.addTab("节点状态",null, nodeStatusPanel,null);
		LinkStatusPanel linkStatusPanel = new LinkStatusPanel();
		tabbedPane1.addTab("链路状态",null, linkStatusPanel,null);
		AlarmQuerypanel alarmQuerypanel = new AlarmQuerypanel();
		tabbedPane1.addTab("告警查询",null, alarmQuerypanel,null);
		PerformanceQueryPanel performanceQueryPanel = new PerformanceQueryPanel();
		tabbedPane1.addTab("性能查询",null, performanceQueryPanel,null);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		new QueryFrame();
	}
}
