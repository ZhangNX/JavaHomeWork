package cn.edu.bjfu.en.im.homework_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cn.edu.bjfu.en.im.homework_1.*;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class StudentDAO extends BaseDAO {

	public boolean add(StudentVO vo) {
		Connection conn = open();
		boolean f = false;
		try {

			// ���ʺŵ�sql���
			String sql = "insert into testIt (no,name,age) values (?,?,?)";
			// 3.��ȡPreparedStatement��������ִ��sql���
			PreparedStatement ps = (PreparedStatement) conn
					.prepareStatement(sql);
			// sql�ص�?�滻Ϊ����ֵ, setInt, setString,��Ŵ�1��ʼ
			ps.setInt(1, vo.getNo());
			ps.setString(2, vo.getName());
			ps.setInt(3, vo.getAge());
			// 4.ͨ��PreparedStatement����ִ��sql���
			int count = ps.executeUpdate();// ִ��sql��
			// ���أ������ݿ����м�����¼�ܵ���Ӱ��
			if (count > 0) {
				f = true;
			} else {
				f = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.close(conn);
		}
		return f;
	}
	
	public boolean updateAge(StudentVO vo) {

		Connection conn = this.open();
		boolean f = false;
		// ���ʺŵ�sql���
		String sql = "update testIt set name=? ,age=? where no=?";
		// 3.��ȡPreparedStatement��������ִ��sql���
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			// sql�ص�?�滻Ϊ����ֵ, setInt, setString,��Ŵ�1��ʼ
			ps.setString(1, vo.getName());
			ps.setInt(2, vo.getAge());
			ps.setInt(3, vo.getNo());
			// 4.ͨ��PreparedStatement����ִ��sql���
			int count = ps.executeUpdate();// ִ��sql��
			// ���أ������ݿ����м�����¼�ܵ���Ӱ��
			if (count > 0)
				f=true;
			else 
				f=false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn);
		}
		return f;
	}
	
	public StudentVO findById(int no){
		Connection conn = open();
		String sql="select no, name,age from testit where no =?";
		StudentVO vo = null;
		int thisNo = 0;String thisName = null;int thisAge = 0;
		try {
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs=(ResultSet) ps.executeQuery();	
			while(rs.next()){
				thisNo=rs.getInt("no");
				thisName=rs.getString("name");
				thisAge=rs.getInt("age");
			}
			if(thisNo==no)
				 vo=new StudentVO(thisNo, thisName, thisAge);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vo;
	}
	
	public static void main(String[] args){
//		StudentVO vo = new StudentVO(2, "abcdef", 20);
//		StudentDAO sDAO=new StudentDAO(); 
//		boolean bool=sDAO.updateAge(vo);
//		if(bool==true)
//		{
//			System.out.println("OK");//����
//		}else {
//			System.out.println("NO");
//		}
		
		StudentDAO sDAO=new StudentDAO(); 
		StudentVO vo = sDAO.findById(5);
		System.out.println(vo.toString());
	}
}
