package hjkj.data;

/**
 * Created by YUB on 17/3/15.
 * 命令类型，静态final字段
 */
public class CMDCode {
    //业务类型命令
    public final static short MESSAGE_TYPE = 0x0001; //即时消息
    public final static short VIDEO_TYPE = 0x0002; //视频
    public final static short AUDIO_TYPE = 0x0003; //音频
    public final static short FILE_TYPE = 0x0004; //文件
    public final static short ROUTER_TYPE = 0x0005; //路由
    public final static short TOPU_TYPE = 0x0006; //拓扑

    //网管类型命令@MDH-20161221:Row14-27 modify cmd type chapter2.2
    public static final short HANDSHAKE_TYPE = 0x007E; //握手
    public static final short NET_IN = 0x000A; //入网信息
    public static final short INITIALISE_CONFIGURE_TYPE = 0x0100; //初始化配置
    public static final short CONFIGURE_SYSTEM = 0x0105; //系统配置
    public static final short CONFIGURE_QUERY = 0x0205; //查询配置
    public static final short ONLINE_UPGRADE_TYPE = 0x01AA; //在线升级
    public static final short QUERY_SELF_PROPERTY = 0x0305; //性能查询命令
    public static final short QUERY_SELF_PROPERTY_REPLY = 0x030A; //性能查询应答
    public static final short QUERY_CONFIGURE = 0x0405; //设备及配置查询命令
    public static final short QUERY_CONFIGURE_REPLY = 0x040A; //设备及配置查询应答
    public static final short QUERY_NODE = 0x0505; //节点状态查询命令
    public static final short QUERY_NODE_REPLY = 0x050A; //节点状态查询应答
    public static final short QUERY_ALARM = 0x0605; //节点告警查询命令
    public static final short QUERY_ALARM_REPLY = 0x060A; //节点告警查询应答

    public static final short TEST_J_MESSAGE = 0x1001; //测试J0.1消息
    public static final short PPTL_BUSSINESS_MESSAGE = 0x1003; //PPLI业务消息
    public static final short TIMESLOT_PLANNING = 0x1006; //时隙规划文件
    public static final short J_PROPERTY = 0x1007; //J链的性能信息
    public static final short J_ALARM = 0x1009; //J链的告警信息
    public static final short J_REPORT = 0x100A; //J链的上报信息
    public static final short J_INITIALISE = 0x100B; //J链初始化信息
//    public static final short QUERY_ALARM_REPLY = ; //T链的入网判断信息
//    public static final short QUERY_ALARM_REPLY = ; //指挥表信息
//    public static final short QUERY_ALARM_REPLY = ; //查询路由表信息
//    public static final short QUERY_ALARM_REPLY = ; //回应路由表信息


}
