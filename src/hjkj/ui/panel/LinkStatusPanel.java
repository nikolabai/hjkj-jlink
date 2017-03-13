package hjkj.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class LinkStatusPanel extends JPanel{
    private JPanel backpane;
	
	
	
	
	public LinkStatusPanel(){
		init();
	}
	
	public void init(){
		setBackground(Color.red);
		setLayout(new BorderLayout());
		backpane = new JPanel();
		backpane.setBackground(Color.blue);
		add(backpane);
	}
}
