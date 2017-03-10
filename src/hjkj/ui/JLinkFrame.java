package hjkj.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import hjkj.ui.panel.AccessPanel;
import hjkj.ui.panel.InfoNodePanel;
import hjkj.ui.panel.InfoRcvPanel;
import hjkj.ui.panel.ToolPanel;
import hjkj.util.WindowMethod;

/**
 * J链主面板
 * @author YUB
 *
 */
public class JLinkFrame{
	
	// 主界面窗口
	private final JFrame mainWindow = new JFrame("LINK16");
	
	// 布局中的面板
	private JPanel backPanel;
	//左上 工具栏
	private JPanel toolPanel;
	//右上 系统提示信息=用户+时间
	private JPanel accessPanel;
	//中间 拓扑 
	private JPanel centerPanel;
	//右二上 节点信息
	private JPanel infoNodePanel;
	//右下 接受显示
	private JPanel infoRcvPanel;
	
	public JLinkFrame(){
		super();
		// 初始化主界面
		initialize();
		// 显示界面
		mainWindow.setVisible(true);

	}
	
	// 初始化主界面
	private void initialize()
	{
		mainWindow.setLayout(new BorderLayout());
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//背景面板
		backPanel = new JPanel();
		backPanel.setBackground(Color.WHITE);
		backPanel.setLayout(null);
		
		//工具栏
		toolPanel = new ToolPanel();
		toolPanel.setBackground(Color.WHITE);
		toolPanel.setBounds(0, 0, 720, 20);
		backPanel.add(toolPanel);
		
		//系统提示信息
		accessPanel = new AccessPanel();
		accessPanel.setBackground(Color.WHITE);
		accessPanel.setBounds(730, 0, 230, 20);
		backPanel.add(accessPanel);
		
		//拓扑
		centerPanel = new JPanel();
		centerPanel.setBackground(Color.LIGHT_GRAY);
		centerPanel.setBorder(getLineBorder());
		centerPanel.setBounds(2, 20, 728, 580);
		backPanel.add(centerPanel);
		
		//节点信息
		infoNodePanel = new InfoNodePanel();
		infoNodePanel.setBorder(getLineBorder());
		infoNodePanel.setBackground(Color.WHITE);
		infoNodePanel.setBounds(730, 20, 230, 92);
		backPanel.add(infoNodePanel);
		
		//接收显示
		infoRcvPanel = new InfoRcvPanel();
		infoRcvPanel.setBorder(getLineBorder());
		infoRcvPanel.setBackground(Color.WHITE);
		infoRcvPanel.setBounds(730, 112, 230, 488);
		backPanel.add(infoRcvPanel);
		
		//主界面大小和位置设置
		mainWindow.add(backPanel);
		mainWindow.setPreferredSize(new Dimension(960, 600));
		WindowMethod.setSoftInScreenCenter(mainWindow);	
		mainWindow.pack();
		mainWindow.setResizable(false);
	}

	private Border getLineBorder() {
		return BorderFactory.createLineBorder(Color.LIGHT_GRAY);
	}
	
	public static void main(String[] args) {
		new JLinkFrame();
	}

}
