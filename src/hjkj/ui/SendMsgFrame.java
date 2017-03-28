
package hjkj.ui;

import hjkj.bean.MsgJ01;
import hjkj.bean.MsgJ01Header;
import hjkj.service.MsgJ01Service;
import hjkj.util.DataManage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.*;

/**
 *
 * @author hj Gavin
 *
 */

public class SendMsgFrame extends JFrame{

	//单例
	private static SendMsgFrame sendMsgFrame;
	public static SendMsgFrame getInstance(){
		if(sendMsgFrame == null){
			sendMsgFrame = new SendMsgFrame();
		}
		return sendMsgFrame;
	}

	private JPanel paneltop;
	private JPanel panelcenter;
	private JPanel panelbottom;
	//中间组件
	private JLabel skymsg;
	private JRadioButton radioCenterNorth;
	private JRadioButton radioCenterSouth;
	private JRadioButton radioCenterEast;
	private JRadioButton radioCenterWest;

	private JLabel laCenterTimeQuality;
	private JLabel laCenterCourse;
	private JLabel laCenterHeight;
	private JLabel laCenterSpeed;

	private  JTextField tfCenterTime;
	private  JTextField tfCenterNorth;
	private  JTextField tfCenterSouth;
	private  JTextField tfCenterCourse;
	private  JTextField tfCenterHeight;
	private  JTextField tfCenterEast;
	private  JTextField tfCenterWest;
	private  JTextField tfCenterSpeed;

	private JLabel laCenter1;
	private JLabel laCenter2;
	private JLabel laCenter3;
	private JLabel laCenter4;
	private JLabel laCenter5;
	private JLabel laCenter6;
	private JLabel laCenter7;
	private JLabel laCenter8;
	//南部组件
	private JLabel landmsg;
	private JRadioButton radioSouthNouth;
	private JRadioButton radioSouthSouth;
	private JRadioButton radioSouthEast;
	private JRadioButton radioSouthWest;

	private JLabel laSouthMark;
	private JLabel laSouthAltitude;
	private JLabel laSouthLandActivity;
	private JLabel laSouthTime;
	private JLabel laSouthLandIdentity;

	//	private  JTextField textField21;
	private  JTextField tfSouthNorth;
	private  JTextField tfSouthSouth;
	private  JTextField tfSouthAltitude;
	private  JTextField tfSouthLandActivity;
	private  JTextField tfSouthTime;
	private  JTextField tfSouthEast;
	private  JTextField tfSouthWest;
	private  JTextField tfSouthLandIdentity;

	//	private JLabel label211;
	private JLabel laSouth1;
	private JLabel laSouth2;
	private JLabel laSouth3;
	private JLabel laSouth4;
	private JLabel laSouth5;
	private JLabel laSouth6;
	private JLabel laSouth7;
	private JLabel laSouth8;

	private JButton butCenterOK;
	private JButton but2;

	private JScrollPane  scrollPane;
	private JList<Integer> list1;
	//北部组件
	private JLabel laNorthDestination;
	private JLabel laNorthText;
	private JTextField tfNorthDestination;
	private JTextField tfNorthText;
	private JButton butNorthOK;
	//	private JButton  button32;
	private ButtonGroup bgcenterleft;
	private ButtonGroup bgcenterright;
	private ButtonGroup bgsouthleft;
	private ButtonGroup bgsouthright;


	//构造方法
	public SendMsgFrame() {
		init();
		setVisible(true);
	}
	private void init(){
		this.setLayout(new BorderLayout());
		setBounds(400, 100, 650, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//北部布局
		paneltop = new JPanel();
		paneltop.setPreferredSize(new Dimension(0,100));
		paneltop.setLayout(null);
		this.add(paneltop,BorderLayout.NORTH);

		laNorthDestination = new JLabel("目的航记号");
		laNorthDestination.setBounds(20, 20, 100, 20);
		paneltop.add(laNorthDestination);
		laNorthText = new JLabel("文本内容");
		laNorthText.setBounds(20, 40, 100, 20);
		paneltop.add(laNorthText);
		tfNorthDestination = new JTextField();
		tfNorthDestination.setBounds(120, 20, 100, 20);
		paneltop.add(tfNorthDestination);
		tfNorthText = new JTextField();
		tfNorthText.setBounds(120, 40, 100, 20);
		paneltop.add(tfNorthText);

		butNorthOK = new JButton("确定");
		butNorthOK.setBounds(320, 20, 60, 20);
		paneltop.add(butNorthOK);
//		button32 = new JButton("but2");
//		button32.setBounds(320, 40, 60, 20);
//		paneltop.add(button32);



		// 中间布局
		panelcenter = new JPanel();
		panelcenter.setLayout(null);
		add(panelcenter,BorderLayout.CENTER);

		skymsg= new JLabel("PPLI空中消息");
		skymsg.setBounds(20, 0, 200, 20);
		panelcenter.add(skymsg);


		radioCenterNorth = new JRadioButton("北纬");
		radioCenterNorth.setBounds(0, 50, 80, 20);
		panelcenter.add(radioCenterNorth);
		radioCenterSouth = new JRadioButton("南纬");
		radioCenterSouth.setBounds(0, 70, 80, 20);
		panelcenter.add(radioCenterSouth);
		bgcenterleft =new ButtonGroup();
		bgcenterleft.add(radioCenterNorth);
		bgcenterleft.add(radioCenterSouth);
		radioCenterEast = new JRadioButton("东经");
		radioCenterEast.setBounds(300, 50, 80, 20);
		panelcenter.add(radioCenterEast);
		radioCenterWest = new JRadioButton("西经");
		radioCenterWest.setBounds(300, 70, 80, 20);
		panelcenter.add(radioCenterWest);
		bgcenterright =new ButtonGroup();
		bgcenterright.add(radioCenterEast);
		bgcenterright.add(radioCenterWest);

		laCenterTimeQuality = new JLabel("时间质量");
		laCenterTimeQuality.setBounds(20, 30, 100, 20);
		panelcenter.add(laCenterTimeQuality);
		laCenterCourse = new JLabel("航向");
		laCenterCourse.setBounds(20, 90, 100, 20);
		panelcenter.add(laCenterCourse);
		laCenterHeight = new JLabel("高度");
		laCenterHeight.setBounds(320, 30, 100, 20);
		panelcenter.add(laCenterHeight);
		laCenterSpeed = new JLabel("速度");
		laCenterSpeed.setBounds(320, 90, 100, 20);
		panelcenter.add(laCenterSpeed);

		tfCenterTime =new JTextField();
		tfCenterTime.setBounds(100, 30, 100, 20);
		panelcenter.add(tfCenterTime);
		tfCenterNorth =new JTextField();
		tfCenterNorth.setBounds(100, 50, 100, 20);
		panelcenter.add(tfCenterNorth);
		tfCenterSouth =new JTextField();
		tfCenterSouth.setBounds(100, 70, 100, 20);
		panelcenter.add(tfCenterSouth);
		tfCenterCourse =new JTextField();
		tfCenterCourse.setBounds(100,90, 100, 20);
		panelcenter.add(tfCenterCourse);
		tfCenterHeight =new JTextField();
		tfCenterHeight.setBounds(400, 30, 100, 20);
		panelcenter.add(tfCenterHeight);
		tfCenterEast =new JTextField();
		tfCenterEast.setBounds(400, 50, 100, 20);
		panelcenter.add(tfCenterEast);
		tfCenterWest =new JTextField();
		tfCenterWest.setBounds(400, 70, 100, 20);
		panelcenter.add(tfCenterWest);
		tfCenterSpeed =new JTextField();
		tfCenterSpeed.setBounds(400, 90, 100, 20);
		panelcenter.add(tfCenterSpeed);

		laCenter1 = new JLabel("(0~15)");
		laCenter1.setBounds(210, 30, 50, 20);
		panelcenter.add(laCenter1);
		laCenter2 = new JLabel("(0~90°)");
		laCenter2.setBounds(210, 50, 50, 20);
		panelcenter.add(laCenter2);
		laCenter3 = new JLabel("(0~90°)");
		laCenter3.setBounds(210, 70, 50, 20);
		panelcenter.add(laCenter3);
		laCenter4 = new JLabel("(0~360°)");
		laCenter4.setBounds(210, 90, 50, 20);
		panelcenter.add(laCenter4);
		laCenter5 = new JLabel("(0~204755)英尺");
		laCenter5.setBounds(510, 30, 100, 20);
		panelcenter.add(laCenter5);
		laCenter6 = new JLabel("(0~180)");
		laCenter6.setBounds(510, 50, 50, 20);
		panelcenter.add(laCenter6);
		laCenter7 = new JLabel("(0~180°)");
		laCenter7.setBounds(510, 70, 50, 20);
		panelcenter.add(laCenter7);
		laCenter8 = new JLabel("(0~4094)h");
		laCenter8.setBounds(510, 90, 100, 20);
		panelcenter.add(laCenter8);

		butCenterOK =new JButton("发送");
		butCenterOK.setBounds(550, 120, 60, 20);
		panelcenter.add(butCenterOK);
		//南部布局
		panelbottom = new JPanel();
		panelbottom.setPreferredSize(new Dimension(0,200));
		panelbottom.setLayout(null);
		add(panelbottom, BorderLayout.SOUTH);

		landmsg= new JLabel("PPLI陆地消息");
		landmsg.setBounds(20, 0, 200, 20);
		panelbottom.add(landmsg);

		radioSouthNouth = new JRadioButton("北纬");
		radioSouthNouth.setBounds(0, 50, 80, 20);
		panelbottom.add(radioSouthNouth);
		radioSouthSouth = new JRadioButton("南纬");
		radioSouthSouth.setBounds(0, 70, 80, 20);
		panelbottom.add(radioSouthSouth);
		bgsouthleft =new ButtonGroup();
		bgsouthleft.add(radioSouthNouth);
		bgsouthleft.add(radioSouthSouth);

		radioSouthEast = new JRadioButton("东经");
		radioSouthEast.setBounds(300, 50, 80, 20);
		panelbottom.add(radioSouthEast);
		radioSouthWest = new JRadioButton("西经");
		radioSouthWest.setBounds(300, 70, 80, 20);
		panelbottom.add(radioSouthWest);
		bgsouthright =new ButtonGroup();
		bgsouthright.add(radioSouthEast);
		bgsouthright.add(radioSouthWest);

		laSouthMark = new JLabel("字标识");
		laSouthMark.setBounds(20, 30, 100, 20);
		panelbottom.add(laSouthMark);
		laSouthAltitude = new JLabel("海拔");
		laSouthAltitude.setBounds(20, 90, 100, 20);
		panelbottom.add(laSouthAltitude);
		laSouthLandActivity = new JLabel("陆地活动");
		laSouthLandActivity.setBounds(20, 110, 100, 20);
		panelbottom.add(laSouthLandActivity);
		laSouthTime = new JLabel("时间质量");
		laSouthTime.setBounds(320, 30, 100, 20);
		panelbottom.add(laSouthTime);
		laSouthLandIdentity = new JLabel("陆地身份");
		laSouthLandIdentity.setBounds(320, 90, 100, 20);
		panelbottom.add(laSouthLandIdentity);


		list1 = new JList<>(new Integer[] {1, 2 ,3 });
		scrollPane = new JScrollPane(list1);
//		textField21=new JTextField();
		scrollPane.setBounds(100, 30, 100, 20);
		panelbottom.add(scrollPane);
		tfSouthNorth =new JTextField();
		tfSouthNorth.setBounds(100, 50, 100, 20);
		panelbottom.add(tfSouthNorth);
		tfSouthSouth =new JTextField();
		tfSouthSouth.setBounds(100, 70, 100, 20);
		panelbottom.add(tfSouthSouth);
		tfSouthAltitude =new JTextField();
		tfSouthAltitude.setBounds(100,90, 100, 20);
		panelbottom.add(tfSouthAltitude);
		tfSouthLandActivity =new JTextField();
		tfSouthLandActivity.setBounds(400, 30, 100, 20);
		panelbottom.add(tfSouthLandActivity);
		tfSouthTime =new JTextField();
		tfSouthTime.setBounds(400, 50, 100, 20);
		panelbottom.add(tfSouthTime);
		tfSouthEast =new JTextField();
		tfSouthEast.setBounds(400, 70, 100, 20);
		panelbottom.add(tfSouthEast);
		tfSouthWest =new JTextField();
		tfSouthWest.setBounds(400, 90, 100, 20);
		panelbottom.add(tfSouthWest);
		tfSouthLandIdentity =new JTextField();
		tfSouthLandIdentity.setBounds(100,110, 100, 20);
		panelbottom.add(tfSouthLandIdentity);

//		label211= new JLabel("(0~15)");
//		label211.setBounds(210, 30, 50, 20);
//		panelbottom.add(label211);
		laSouth1 = new JLabel("(0~90°)");
		laSouth1.setBounds(210, 50, 50, 20);
		panelbottom.add(laSouth1);
		laSouth2 = new JLabel("(0~90°)");
		laSouth2.setBounds(210, 70, 50, 20);
		panelbottom.add(laSouth2);
		laSouth3 = new JLabel("(0~51175)英尺");
		laSouth3.setBounds(210, 90, 100, 20);
		panelbottom.add(laSouth3);
		laSouth4 = new JLabel("(0~15)");
		laSouth4.setBounds(510, 30, 100, 20);
		panelbottom.add(laSouth4);
		laSouth5 = new JLabel("(0~180)");
		laSouth5.setBounds(510, 50, 50, 20);
		panelbottom.add(laSouth5);
		laSouth6 = new JLabel("(0~180°)");
		laSouth6.setBounds(510, 70, 50, 20);
		panelbottom.add(laSouth6);
		laSouth7 = new JLabel("坦克");
		laSouth7.setBounds(510, 90, 100, 20);
		panelbottom.add(laSouth7);
		laSouth8 = new JLabel("陆地身份正在移动");
		laSouth8.setBounds(210, 110, 150, 20);
		panelbottom.add(laSouth8);

		but2 =new JButton("发送");
		but2.setBounds(550, 130, 60, 20);
		panelbottom.add(but2);

		butNorthOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t = null;
				try {
					t = new Thread(new MsgJ01Service(getInitInfo()));
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				}
				t.start();
			}
		});


	}

	//获取要发送的信息，存入bean
	public MsgJ01 getInitInfo(){
		MsgJ01 msgJ01 = new MsgJ01();
		msgJ01.setJMsgHead(MsgJ01Header.getBytes());
		msgJ01.setDataType((byte)0);

		msgJ01.setFrameNum(DataManage.resetArray(4));
		msgJ01.setFrameTotal(DataManage.resetArray(4));

		//目的航迹号
		msgJ01.setDestTrackNumber(DataManage.shortToBytes((short)Integer.parseInt(tfNorthDestination.getText())));
		//数据内容
		byte[] data = tfNorthText.getText().getBytes();
		msgJ01.setData(data);
		//数据长度：报头加有效数据
		msgJ01.setDataLen(data);
		return msgJ01;
	}

	public static void main(String[] args) {
		new SendMsgFrame().setVisible(true);
	}
}
