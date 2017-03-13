package hjkj.ui.panel.config;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfigAlarmPanel extends JPanel{

	private JLabel pkgErrLbl;
	private JComboBox<Integer> pkgErr;
	
	private Integer[] pkgErrNums = { 5, 10, 20, 50, 100 };
	
	private JButton confirmBtn;
	
	public ConfigAlarmPanel() {
		initial();
	}
	
	private void initial(){
		this.setLayout(null);
		
		pkgErrLbl = new JLabel("J消息类型：");
		pkgErrLbl.setBounds(400, 200, 100, 30);
		this.add(pkgErrLbl);
		
		pkgErr = new JComboBox<>(pkgErrNums);
		pkgErr.setBounds(500, 200, 100, 30);
		this.add(pkgErr);
		
		
		confirmBtn = new JButton("确认发送");
		confirmBtn.setBounds(530, 300, 80, 30);
		this.add(confirmBtn);
		
	}

}
