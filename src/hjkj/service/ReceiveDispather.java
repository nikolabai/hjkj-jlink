package hjkj.service;


/**
 * 接收的数据分发处理
 * @author YUB
 *
 */
public class ReceiveDispather {

	private byte[] receiveData;

    private int dest; //解析出的目的地址
    private int src; //解析出的源地址
    private short code; //解析出的命令类型

	//dao在此声明

    //将接收的参数传值进来
	public ReceiveDispather(byte[] data) {
		this.receiveData = data;
	}

	public void setReceiveData(byte[] data){
	    this.receiveData = data;
    }

	public void DataHandle(){

        //解析消息头
        dest = receiveData[2];
        src = receiveData[3];
//        code = Util.bytesToShort(receiveData[6], receiveData[7]);

        //判断目的板卡地址是否为自己
        //if(GlobalVariate.getId() != data[3])
        //	return;
        //判断消息类型
        switch(code)
        {
//            //握手信息
//            case (code.HANDSHAKE_TYPE): //测试用
//            {
//                // 先设置窗口风格
//                if(!SaveObject.createMainInterface())
//                    System.out.println("主窗口初始化失败！！");
//                else
//                {
//                    // 添加按钮监听事件
//                    SaveObject.getMainMethod().initValue();
//                    SaveObject.getMainMethod().addListener();
//                    SaveObject.getMainMethod().startProcedure();
//                }
//                SendFakeTopu.sendFakeTopu();
//            }
//            break;
//            //即时消息
//            case (code.MESSAGE_TYPE):
//            {
//                disposeMessage();
//            }
//            break;
//            //视频信息
//            case(code.VIDEO_TYPE):
//            {
//                disposeVideo();
//            }
//            break;
//            // 音频信息
//            case(code.AUDIO_TYPE):
//            {
//                disposeAudio();
//            }
//            break;
//            // 文件信息
//            case(code.FILE_TYPE):
//            {
//                disposeFile();
//            }
//            break;
//            case(code.ROUTER_TYPE):
//            {}
//            break;
//            //拓扑信息
//            case(code.TOPU_TYPE):
//            {
//                disposeTopu();
//            }
//            break;
//            default:
//            {
//                NetDataProcess.netDataDispath(receiveData);
//            }
        }
	}

}
