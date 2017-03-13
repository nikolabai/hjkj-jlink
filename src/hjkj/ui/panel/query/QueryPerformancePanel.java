package hjkj.ui.panel.query;

import java.awt.Color;

import javax.swing.JPanel;

public class QueryPerformancePanel extends JPanel {
	private JPanel backpane;
	
	
	
	
	public QueryPerformancePanel(){
		init();
	}
	
	public void init(){
		backpane = new JPanel();
		backpane.setBackground(Color.ORANGE);
	}

}
