package hjkj.ui.panel;

import java.awt.Color;

import javax.swing.JPanel;

public class AlarmQuerypanel extends JPanel {
	private JPanel backpane;
	
	
	
	
	public AlarmQuerypanel(){
		init();
	}
	
	public void init(){
		backpane = new JPanel();
		backpane.setBackground(Color.black);
	}
}
