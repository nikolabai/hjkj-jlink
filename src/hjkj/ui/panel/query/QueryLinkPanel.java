package hjkj.ui.panel.query;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class QueryLinkPanel extends JPanel{
    private JPanel backpane;
	
	
	
	
	public QueryLinkPanel(){
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
