package hjkj.ui.panel.main;

import hjkj.ui.SendMsgFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ToolPanel extends JPanel implements ActionListener{

	//	private JBtnBar toolBar;
	private JButton configBtn;
	private JButton queryBtn;
	private JButton sendBtn;
	
	public ToolPanel() {
		initial();
	}
	
	private void initial(){
		this.setLayout(null);
		
		String[] buttonNames= { "配置管理", "信息查询", "发送消息"};
		this.setBounds(0, 0, 300, 20);
		
		configBtn = new JButton(buttonNames[0]);
		configBtn.setBounds(0, 0, 100, 20);
		queryBtn = new JButton(buttonNames[1]);
		queryBtn.setBounds(100, 0, 100, 20);
		sendBtn = new JButton(buttonNames[2]);
		sendBtn.setBounds(200, 0, 100, 20);
		
		this.add(configBtn);
		this.add(queryBtn);
		this.add(sendBtn);
		
//		this.add(toolBar);
		this.setBackground(Color.cyan);

		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SendMsgFrame().setVisible(true);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource().equals(""))
		System.out.println(e.getSource().toString());
	}
}
