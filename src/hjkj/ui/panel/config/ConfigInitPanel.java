package hjkj.ui.panel.config;

import hjkj.bean.ConfigInit;
import hjkj.service.ConfigInitService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class ConfigInitPanel extends JPanel{


	private JLabel idTLbl;
	private JLabel idJLbl;
	private JLabel ipLbl;
	private JLabel isNTRLbl;
	private JTextField idJ;
	private JTextField idT;
	private JTextField ip;
	private ButtonGroup isNTR;
	private JRadioButton isNTRY;
	private JRadioButton isNTRN;
	
	private JButton confirmBtn;
	
	public ConfigInitPanel() {
		initial();
	}
	
	private void initial(){
		this.setLayout(null);
		
		idJLbl = new JLabel("端机ID_J");
		idJLbl.setBounds(400, 100, 100, 20);
		this.add(idJLbl);

		idJ = new JTextField();
		idJ.setBounds(500, 100, 100, 20);
		this.add(idJ);
		
		idTLbl = new JLabel("端机ID_T");
		idTLbl.setBounds(400, 140, 100, 20);
		this.add(idTLbl);
		
		idT = new JTextField();
		idT.setBounds(500, 140, 100, 20);
		this.add(idT);

		ipLbl = new JLabel("IP");
		ipLbl.setBounds(400, 180, 100, 20);
		this.add(ipLbl);

		ip = new JTextField();
		ip.setBounds(500, 180, 100, 20);
		this.add(ip);

		isNTRLbl = new JLabel("时间基准");
		isNTRLbl.setBounds(400, 220, 100, 20);
		this.add(isNTRLbl);

		isNTR = new ButtonGroup();
		isNTRY = new JRadioButton("是");
		isNTRN = new JRadioButton("否");
		isNTR.add(isNTRY);
		isNTR.add(isNTRN);
		isNTRY.setBounds(500, 220, 50, 20);
		isNTRN.setBounds(550, 220, 50, 20);
		this.add(isNTRY);
		this.add(isNTRN);

		confirmBtn = new JButton("确认");
		confirmBtn.setBounds(530, 300, 80, 30);
		this.add(confirmBtn);

		confirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t = null;
				try {
					t = new Thread(new ConfigInitService(getInitInfo()));
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				}
				t.start();
			}
		});
		
	}

	//获取要发送的信息，存入bean
	public ConfigInit getInitInfo(){
		ConfigInit configInit = new ConfigInit();
		configInit.setXJId((byte)Integer.parseInt(idJ.getText()));
		configInit.setXTId((byte)Integer.parseInt(idT.getText()));
		configInit.setIp((byte)Integer.parseInt(ip.getText()));

		//设置NTR
		if(isNTR.getSelection() == isNTRY){
			configInit.setIsNTR((byte)1);
		}
		else {
			configInit.setIsNTR((byte) 0);
		}
		return configInit;
	}


}
