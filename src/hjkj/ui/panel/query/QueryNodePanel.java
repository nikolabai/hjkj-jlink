package hjkj.ui.panel.query;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class QueryNodePanel extends	JPanel{
	private JLabel label1;
	public QueryNodePanel(){
		init();
	}
	
	public void init(){
		this.setLayout(null);
		label1=new JLabel("噪音比");
		label1.setBounds(10, 0, 50, 20);
		this.add(label1);
		
		
	}
	
}
