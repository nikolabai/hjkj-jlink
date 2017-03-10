package hjkj.ui.panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfigSlotPanel extends JPanel{

	private JLabel jTypeLbl;
	private JLabel repeatLbl;
	private JLabel startLbl;
	private JComboBox<String> jType;
	private JComboBox<Integer> repeat;
	private JTextField start;
	
	private String[] jTypeNames = { "PPLI1", "PPLI2", "PPLI3" };
	private Integer[] repeatNums = { 1, 2, 3, 4, 5 };
	
	private JButton confirmBtn;
	
	public ConfigSlotPanel() {
		initial();
	}
	
	private void initial(){
		this.setLayout(null);
		
		jTypeLbl = new JLabel("J消息类型：");
		jTypeLbl.setBounds(400, 100, 100, 30);
		this.add(jTypeLbl);
		
		jType = new JComboBox<>(jTypeNames);
		jType.setBounds(500, 100, 100, 30);
		this.add(jType);
		
		repeatLbl = new JLabel("重复率：");
		repeatLbl.setBounds(400, 140, 100, 30);
		this.add(repeatLbl);

		repeat = new JComboBox<>(repeatNums);
		repeat.setBounds(500, 140, 100, 30);
		this.add(repeat);
		
		startLbl = new JLabel("起始时隙:");
		startLbl.setBounds(400, 180, 100, 30);
		this.add(startLbl);
		
		start = new JTextField();
		start.setBounds(500, 180, 100, 30);
		this.add(start);
		
		confirmBtn = new JButton("确认发送");
		confirmBtn.setBounds(530, 300, 80, 30);
		this.add(confirmBtn);
		
	}

}
