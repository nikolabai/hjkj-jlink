package hjkj.ui.panel.main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoNodePanel extends JPanel{

	private JPanel backPanel;
	
	private JLabel nodeInfoLbl;	
	
	private JLabel nameLbl;
	private JLabel snrLbl;
	private JLabel pkgRcvLbl;
	private JLabel pkgSndLbl;
	private JLabel pkgErrLbl;
	private JLabel rateErrLbl;
	
	private JLabel name;
	private JLabel snr;
	private JLabel pkgRcv;
	private JLabel pkgSnd;
	private JLabel pkgErr;
	private JLabel rateErr;
	
	public InfoNodePanel() {
		initial();
	}
	
	private void initial(){
		
		this.setLayout(null);
		this.setBounds(0, 0, 220, 200);
		
		nodeInfoLbl = new JLabel("节点信息");
		nodeInfoLbl.setBackground(Color.LIGHT_GRAY);
		nodeInfoLbl.setBounds(90, 0, 100, 20);
		this.add(nodeInfoLbl);
		
		backPanel = new JPanel();
		backPanel.setBackground(Color.WHITE);
		backPanel.setBounds(20, 20, 200, 70);
		backPanel.setLayout(new GridLayout(3, 4));
		
		String[] nodeNames = {"名称","信噪比","接收包","发送包","错误包","误码率"};
		nameLbl = new JLabel(nodeNames[0] + ":");
		name = new JLabel("……");
		backPanel.add(nameLbl);
		backPanel.add(name);
		
		snrLbl = new JLabel(nodeNames[1] + ":");
		snr = new JLabel("……");
		backPanel.add(snrLbl);
		backPanel.add(snr);
		
		pkgRcvLbl = new JLabel(nodeNames[2] + ":");
		pkgRcv = new JLabel("……");
		backPanel.add(pkgRcvLbl);
		backPanel.add(pkgRcv);
		
		pkgSndLbl = new JLabel(nodeNames[3] + ":");
		pkgSnd = new JLabel("……");
		backPanel.add(pkgSndLbl);
		backPanel.add(pkgSnd);
		
		pkgErrLbl = new JLabel(nodeNames[4] + ":");
		pkgErr = new JLabel("……");
		backPanel.add(pkgErrLbl);
		backPanel.add(pkgErr);
		
		rateErrLbl = new JLabel(nodeNames[5] + ":");
		rateErr = new JLabel("……");
		backPanel.add(rateErrLbl);
		backPanel.add(rateErr);
		
		this.add(backPanel);
		this.setBackground(Color.blue);
	}
}
