
package hjkj.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
/**
 * 
 * @author hj Gavin
 *
 */

public class SendMsgFrame extends JFrame implements ActionListener{
	private JPanel paneltop;
	private JPanel panelcenter;
	private JPanel panelbottom;
	//中间组件
	private JRadioButton radio1;
	private JRadioButton radio11;
	private JRadioButton radio12;
	private JRadioButton radio13;
	private JRadioButton radio14;
	
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	
	private  JTextField textField11;
	private  JTextField textField12;
	private  JTextField textField13;
	private  JTextField textField14;
	private  JTextField textField15;
	private  JTextField textField16;
	private  JTextField textField17;
	private  JTextField textField18;
	
	private JLabel label111;
	private JLabel label112;
	private JLabel label113;
	private JLabel label114;
	private JLabel label115;
	private JLabel label116;
	private JLabel label117;
	private JLabel label118;
	//南部组件
	private JRadioButton radio2;
	private JRadioButton radio21;
	private JRadioButton radio22;
	private JRadioButton radio23;
	private JRadioButton radio24;
	
	private JLabel label21;
	private JLabel label22;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	
	private  JTextField textField21;
	private  JTextField textField22;
	private  JTextField textField23;
	private  JTextField textField24;
	private  JTextField textField25;
	private  JTextField textField26;
	private  JTextField textField27;
	private  JTextField textField28;
	private  JTextField textField29;
	
	private JLabel label211;
	private JLabel label212;
	private JLabel label213;
	private JLabel label214;
	private JLabel label215;
	private JLabel label216;
	private JLabel label217;
	private JLabel label218;
	private JLabel label219;
	
	private JButton but1;
	private JButton but2;
	
	private JScrollPane  scrollPane;
	private JList<Integer> list1;
	//北部组件
	private JLabel label31;
	private JLabel label32;
	private JTextField textField31;
	private JTextField textField32;
	private JButton  button31;
	private JButton  button32;
	
	//构造方法
	public SendMsgFrame() {
		init();
		setVisible(true);
	}
	private void init(){
		this.setLayout(new BorderLayout());
		setBounds(400, 100, 650, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//北部布局
		paneltop = new JPanel();
		paneltop.setPreferredSize(new Dimension(0,100));
		paneltop.setLayout(null);
		this.add(paneltop,BorderLayout.NORTH);
	
		label31 = new JLabel("目的航记号");
		label31.setBounds(20, 20, 100, 20);
		paneltop.add(label31);
		label32 = new JLabel("文本内容");
		label32.setBounds(20, 40, 100, 20);
		paneltop.add(label32);
		textField31 = new JTextField();
		textField31.setBounds(120, 20, 100, 20);
		paneltop.add(textField31);
		textField32 = new JTextField();
		textField32.setBounds(120, 40, 100, 20);
		paneltop.add(textField32);
		
		button31 = new JButton("but1");
		button31.setBounds(320, 20, 60, 20);
		paneltop.add(button31);
		button32 = new JButton("but2");
		button32.setBounds(320, 40, 60, 20);
		paneltop.add(button32);
				
				
				
		// 中间布局
		panelcenter = new JPanel();
		panelcenter.setLayout(null);
		add(panelcenter,BorderLayout.CENTER);
		
		radio1= new JRadioButton("PPLI空中消息");
		radio1.setBounds(0, 0, 200, 20);
		panelcenter.add(radio1);
		
		radio11= new JRadioButton("北纬");
		radio11.setBounds(0, 50, 80, 20);
		panelcenter.add(radio11);
		radio12= new JRadioButton("南纬");
		radio12.setBounds(0, 70, 80, 20);
		panelcenter.add(radio12);
		radio13= new JRadioButton("东经");
		radio13.setBounds(300, 50, 80, 20);
		panelcenter.add(radio13);
		radio14= new JRadioButton("西经");
		radio14.setBounds(300, 70, 80, 20);
		panelcenter.add(radio14);
		
		label11= new JLabel("时间质量");
		label11.setBounds(20, 30, 100, 20);
		panelcenter.add(label11);
		label12= new JLabel("航向");
		label12.setBounds(20, 90, 100, 20);
		panelcenter.add(label12);
		label13= new JLabel("高度");
		label13.setBounds(320, 30, 100, 20);
		panelcenter.add(label13);
		label14= new JLabel("速度");
		label14.setBounds(320, 90, 100, 20);
		panelcenter.add(label14);
		
		textField11=new JTextField();
		textField11.setBounds(100, 30, 100, 20);
		panelcenter.add(textField11);
		textField12=new JTextField();
		textField12.setBounds(100, 50, 100, 20);
		panelcenter.add(textField12);
		textField13=new JTextField();
		textField13.setBounds(100, 70, 100, 20);
		panelcenter.add(textField13);
		textField14=new JTextField();
		textField14.setBounds(100,90, 100, 20);
		panelcenter.add(textField14);
		textField15=new JTextField();
		textField15.setBounds(400, 30, 100, 20);
		panelcenter.add(textField15);
		textField16=new JTextField();
		textField16.setBounds(400, 50, 100, 20);
		panelcenter.add(textField16);
		textField17=new JTextField();
		textField17.setBounds(400, 70, 100, 20);
		panelcenter.add(textField17);
		textField18=new JTextField();
		textField18.setBounds(400, 90, 100, 20);
		panelcenter.add(textField18);
		
		label111= new JLabel("(0~15)");
		label111.setBounds(210, 30, 50, 20);
		panelcenter.add(label111);
		label112= new JLabel("(0~90°)");
		label112.setBounds(210, 50, 50, 20);
		panelcenter.add(label112);
		label113= new JLabel("(0~90°)");
		label113.setBounds(210, 70, 50, 20);
		panelcenter.add(label113);
		label114= new JLabel("(0~360°)");
		label114.setBounds(210, 90, 50, 20);
		panelcenter.add(label114);
		label115= new JLabel("(0~204755)英尺");
		label115.setBounds(510, 30, 100, 20);
		panelcenter.add(label115);
		label116= new JLabel("(0~180)");
		label116.setBounds(510, 50, 50, 20);
		panelcenter.add(label116);
		label117= new JLabel("(0~180°)");
		label117.setBounds(510, 70, 50, 20);
		panelcenter.add(label117);
		label118= new JLabel("(0~4094)h");
		label118.setBounds(510, 90, 100, 20);
		panelcenter.add(label118);
		
		but1 =new JButton("发送");
		but1.setBounds(550, 120, 60, 20);
		panelcenter.add(but1);
		//南部布局
		panelbottom = new JPanel();
		panelbottom.setPreferredSize(new Dimension(0,200));
		panelbottom.setLayout(null);
		add(panelbottom, BorderLayout.SOUTH);
		
		radio2= new JRadioButton("PPLI陆地消息");
		radio2.setBounds(0, 0, 200, 20);
		panelbottom.add(radio2);
		
		radio21= new JRadioButton("北纬");
		radio21.setBounds(0, 50, 80, 20);
		panelbottom.add(radio21);
		radio22= new JRadioButton("南纬");
		radio22.setBounds(0, 70, 80, 20);
		panelbottom.add(radio22);
		radio23= new JRadioButton("东经");
		radio23.setBounds(300, 50, 80, 20);
		panelbottom.add(radio23);
		radio24= new JRadioButton("西经");
		radio24.setBounds(300, 70, 80, 20);
		panelbottom.add(radio24);
		
		label21= new JLabel("字标识");
		label21.setBounds(20, 30, 100, 20);
		panelbottom.add(label21);
		label22= new JLabel("海拔");
		label22.setBounds(20, 90, 100, 20);
		panelbottom.add(label22);
		label23= new JLabel("陆地活动");
		label23.setBounds(20, 110, 100, 20);
		panelbottom.add(label23);
		label24= new JLabel("时间质量");
		label24.setBounds(320, 30, 100, 20);
		panelbottom.add(label24);
		label25= new JLabel("陆地身份");
		label25.setBounds(320, 90, 100, 20);
		panelbottom.add(label25);
		
		
		list1 = new JList<>(new Integer[] {1, 2 ,3 });
		scrollPane = new JScrollPane(list1);
//		textField21=new JTextField();
		scrollPane.setBounds(100, 30, 100, 20);
		panelbottom.add(scrollPane);
		textField22=new JTextField();
		textField22.setBounds(100, 50, 100, 20);
		panelbottom.add(textField22);
		textField23=new JTextField();
		textField23.setBounds(100, 70, 100, 20);
		panelbottom.add(textField23);
		textField24=new JTextField();
		textField24.setBounds(100,90, 100, 20);
		panelbottom.add(textField24);
		textField25=new JTextField();
		textField25.setBounds(400, 30, 100, 20);
		panelbottom.add(textField25);
		textField26=new JTextField();
		textField26.setBounds(400, 50, 100, 20);
		panelbottom.add(textField26);
		textField27=new JTextField();
		textField27.setBounds(400, 70, 100, 20);
		panelbottom.add(textField27);
		textField28=new JTextField();
		textField28.setBounds(400, 90, 100, 20);
		panelbottom.add(textField28);
		textField29=new JTextField();
		textField29.setBounds(100,110, 100, 20);
		panelbottom.add(textField29);
		
//		label211= new JLabel("(0~15)");
//		label211.setBounds(210, 30, 50, 20);
//		panelbottom.add(label211);
		label212= new JLabel("(0~90°)");
		label212.setBounds(210, 50, 50, 20);
		panelbottom.add(label212);
		label213= new JLabel("(0~90°)");
		label213.setBounds(210, 70, 50, 20);
		panelbottom.add(label213);
		label214= new JLabel("(0~51175)英尺");
		label214.setBounds(210, 90, 100, 20);
		panelbottom.add(label214);
		label215= new JLabel("(0~15)");
		label215.setBounds(510, 30, 100, 20);
		panelbottom.add(label215);
		label216= new JLabel("(0~180)");
		label216.setBounds(510, 50, 50, 20);
		panelbottom.add(label216);
		label217= new JLabel("(0~180°)");
		label217.setBounds(510, 70, 50, 20);
		panelbottom.add(label217);
		label218= new JLabel("坦克");
		label218.setBounds(510, 90, 100, 20);
		panelbottom.add(label218);
		label219= new JLabel("陆地身份正在移动");
		label219.setBounds(210, 110, 150, 20);
		panelbottom.add(label219);
		
		but2 =new JButton("发送");
		but2.setBounds(550, 130, 60, 20);
		panelbottom.add(but2);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		new SendMsgFrame();
	}
}
