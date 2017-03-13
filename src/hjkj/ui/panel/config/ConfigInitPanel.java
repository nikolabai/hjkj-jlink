package hjkj.ui.panel.config;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfigInitPanel extends JPanel{

	private JLabel idTLbl;
	private JLabel idJLbl;
	private JTextField idJ;
	private JTextField idT;
	
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
		
		confirmBtn = new JButton("确认");
		confirmBtn.setBounds(530, 300, 80, 30);
		this.add(confirmBtn);
		
	}

}
