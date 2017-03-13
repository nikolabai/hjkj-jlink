package hjkj.ui.panel;

import java.awt.Color;

import javax.swing.JPanel;

public class PerformanceQueryPanel extends JPanel {
	private JPanel backpane;
	
	
	
	
	public PerformanceQueryPanel(){
		init();
	}
	
	public void init(){
		backpane = new JPanel();
		backpane.setBackground(Color.ORANGE);
	}

}
