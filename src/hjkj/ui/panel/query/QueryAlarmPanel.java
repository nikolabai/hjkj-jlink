package hjkj.ui.panel.query;

import java.awt.Color;

import javax.swing.JPanel;

public class QueryAlarmPanel extends JPanel {
	private JPanel backpane;
	
	
	
	
	public QueryAlarmPanel(){
		init();
	}
	
	public void init(){
		backpane = new JPanel();
		backpane.setBackground(Color.black);
	}
}
