package hjkj.ui.panel.main;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import hjkj.util.DateUtils;

public class AccessPanel extends JPanel{


	// 用户名标签
	private JLabel userLabel;;
	// 时间标签
	private JLabel timeLabel;
	
	public AccessPanel() {
		initial();
	}

	private void initial() {
		userLabel = new JLabel("测试员");
		timeLabel = new JLabel("2016年06月14日 17:34:30");
		this.setBackground(Color.WHITE);
		this.setBounds(730, 0, 230, 20);
		this.setLayout(null);
		userLabel.setBounds(0, 0, 50, 20);
		this.add(userLabel);
		timeLabel.setBounds(60, 0, 200, 20);
		this.add(timeLabel);
		
		//时钟线程
		Thread thread = new Thread(new Runnable()
		{
			@ Override
			public void run()
			{
				while (true)
				{
					timeLabel.setText(DateUtils.getNowDate());
					try
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
		
	}

}
