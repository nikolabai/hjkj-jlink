package hjkj.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

import hjkj.ui.panel.ConfigAlarmPanel;
import hjkj.ui.panel.ConfigInitPanel;
import hjkj.ui.panel.ConfigSlotPanel;
import hjkj.ui.panel.InfoNodePanel;
import hjkj.ui.panel.InfoRcvPanel;
import hjkj.ui.panel.ToolPanel;
import hjkj.util.WindowMethod;

public class ConfigFrame {

	// 主界面窗口
	private final JFrame mainWindow = new JFrame("配置界面");

	// 布局中的面板
	private JPanel backPanel;
	// 左上 工具栏
	private JTabbedPane tabbedPane;
	// 右上 系统提示信息=用户+时间
	private JPanel alarmPanel;
	// 中间 拓扑
	private JPanel slotPanel;
	// 右二上 节点信息
	private JPanel initPanel;

	public ConfigFrame(){
			super();
			// 初始化主界面
			initialize();
			// 显示界面
			mainWindow.setVisible(true);

		}

	// 初始化主界面
	private void initialize() {
		mainWindow.setLayout(new BorderLayout());
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 背景面板
		backPanel = new JPanel();
		backPanel.setBackground(Color.WHITE);
		backPanel.setLayout(null);

		// 选项卡
		tabbedPane = new JTabbedPane();
		tabbedPane.setTabPlacement(JTabbedPane.TOP);
		tabbedPane.setBounds(2, 0, 996, 600);
		
		initPanel = new ConfigInitPanel();
		slotPanel = new ConfigSlotPanel();
		alarmPanel = new ConfigAlarmPanel();
		
		tabbedPane.addTab("初始化配置", null, initPanel, "");
		tabbedPane.addTab("时隙配置", null, slotPanel, "");
		tabbedPane.addTab("告警配置", null, alarmPanel, "");

		// 主界面大小和位置设置
		mainWindow.add(tabbedPane);
		mainWindow.setPreferredSize(new Dimension(960, 600));
		WindowMethod.setSoftInScreenCenter(mainWindow);
		mainWindow.pack();
		mainWindow.setResizable(false);
	}

	private Border getLineBorder() {
		return BorderFactory.createLineBorder(Color.LIGHT_GRAY);
	}

	public static void main(String[] args) {
		new ConfigFrame();
	}
}
