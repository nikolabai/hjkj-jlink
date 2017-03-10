//package hjkj.service;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//
//
///**
// * 接收的数据分发处理
// * @author YUB
// *
// */
//public class ReveiveDispather {
//
//	private ObjectInputStream iStream;
//	private ObjectOutputStream oStream;
//
//	private MemberDao memberDao = new MemberDao();
//	private FilmDao filmDao = new FilmDao();
//	private BookDao bookDao = new BookDao();
//
//	public ReveiveDispather(ObjectInputStream iStream, ObjectOutputStream oStream) {
//		this.iStream = iStream;
//		this.oStream = oStream;
////		this.code = code;
//	}
//
//	public void DataHandle(){
//
//		Object codeObject;
//		String codeString;
//		String[] codeArray;
//
//		int code;
//
//		try {
//			while((codeObject = iStream.readObject()) != null){
//
//				codeString = codeObject.toString();
//				codeArray = codeString.split("/");
//
//				code = Integer.parseInt(codeArray[0]);
//
//				switch (code)
//				{
//					case 1:{
//						System.out.println("");
//						String name = codeArray[1];
//						String pwd = codeArray[2];
//						//
//						boolean isExit = memberDao.isMemberExit(new Member(name, pwd));
//
//						//
//						if(isExit){
//							System.out.println("");
//							ServerCode.setCode(ServerCode.LOGIN_RESPONSE_SUCCESS);
//						}
//						//
//						else{
//							System.out.println("");
//							ServerCode.setCode(ServerCode.LOGIN_RESPONSE_FAILURE);
//						}
//
//						//
//						oStream.writeObject(ServerCode.getCode());
//						break;
//					}
//					case 9:{
//						System.out.println("");
//						String mName = codeArray[1];
//						//
//						Member member = memberDao.getSimpleMember(mName);
//
//						int mid = member.getMid();
//						String realName = member.getRealName();
//						String startDate = member.getStartDate();
//						String endDate = member.getEndDate();
//						int age = member.getAge();
//						int sex = member.getSex();
//						String address = member.getAddress();
//						String phone = member.getPhone();
//
//						System.out.println("" + mid + "\t"
//								+ realName + "\t" + startDate + "\t" + endDate
//								+ "\t" + age + "\t" + sex + "\t" + address + "\t"
//								+ phone);
//
//						ServerCode
//								.setCode(ServerCode.REQUEST_PERSONAL_INFO_RESPONSE);
//						oStream.writeObject(ServerCode.getCode() + "/" + mid + "/"
//								+ realName + "/" + startDate + "/" + endDate + "/"
//								+ age + "/" + sex + "/" + address + "/" + phone);
//						break;
//					}
//					case 10:{
//						System.out.println("");
//						//
//						boolean flag = memberDao.updateMember(new Member(Integer.parseInt(codeArray[1]),
//								codeArray[2], codeArray[3],
//								Integer.parseInt(codeArray[4]), Integer.parseInt(codeArray[5]),
//								codeArray[6], codeArray[7]));
//
//						//
//						if(flag == true){
//							System.out.println("");
//							ServerCode.setCode(ServerCode.REQUEST_PERSONAL_INFO_RESPONSE);
//						}
//						else{
//							System.out.println("");
//							ServerCode.setCode(ServerCode.UPDATE_PERSONAL_INFO_FAILURE);
//						}
//
//						oStream.writeObject(ServerCode.getCode() + "");
//						break;
//					}
//					case 3:{
//						System.out.println("");
//						ArrayList<Film> filmList = new ArrayList<Film>();
//						filmList = filmDao.getAllFilms();
//
//						//
//						ServerCode.setCode(ServerCode.REQUEST_FILMS_RESPONSE);
//						FilmWrapper filmWrapper = new FilmWrapper(ServerCode.getCode(), filmList);
//						oStream.writeObject(filmWrapper);
//						break;
//					}
//				}
//
//
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}
