package hjkj.util;

import java.sql.*;

public class JDBCUtils {
	
	//�رս��������������
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		close(rs);
		close(stmt);
		close(conn);
	}
	
	//�ر�����������
	public static void close(Statement stmt, Connection conn) {
		close(stmt);
		close(conn);
	}
	
	//�رս����������
	public static void close(ResultSet rs, Statement stmt){
		close(rs);
		close(stmt);
	}
	
	//�ر�����
	public static void close(Connection conn) {
		try {
			if(conn!=null) {
				conn.close();
			}
		}
		catch(Exception e){
			System.out.println("�ر����ݿ�����ʧ��!");
		}
	}
	
	//�ر�����
	public static void close(Statement stmt) {
		try {
			if(stmt!=null){
				stmt.close();
			}
		}
		catch(Exception e){
			System.out.println("�ر�����ʧ��!");
		}
	}
	
	//�رս����
	public static void close(ResultSet rs) {
		try {
			if(rs!=null){
				rs.close();
			}
		}
		catch(Exception e){
			System.out.println("�رս����ʧ��!");
		}
	}

}
