package cn.edu.bjfu.en.im.homework_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cn.edu.bjfu.en.im.homework_7.*;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class RegisterDAO extends BaseDAO {

	public boolean add(RegisterVO vo) {
		Connection conn = open();
		boolean f = false;
		try {

			// 带问号的sql语句
			String sql = "insert into register (name,pwd) values (?,?)";
			// 3.获取PreparedStatement对象，用以执行sql语句 
			PreparedStatement ps = (PreparedStatement) conn
					.prepareStatement(sql);
			// sql重的?替换为具体值, setInt, setString,序号从1开始
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			// 4.通过PreparedStatement对象执行sql语句
			int count = ps.executeUpdate();// 执行sql，
			// 返回：到数据库中有几条记录受到了影响
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
	
	public boolean updateAge(RegisterVO vo) {

		Connection conn = this.open();
		boolean f = false;
		// 带问号的sql语句
		String sql = "update register set pwd=?  where name=?";
		// 3.获取PreparedStatement对象，用以执行sql语句
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			// sql重的?替换为具体值, setInt, setString,序号从1开始
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			// 4.通过PreparedStatement对象执行sql语句
			int count = ps.executeUpdate();// 执行sql，
			// 返回：到数据库中有几条记录受到了影响
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
	
	public RegisterVO findByName(String name){
		Connection conn = open();
		String sql="select name,pwd from register where name =?";
		RegisterVO vo = null;
		String thisName = null;String thisPwd = null;
		try {
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=(ResultSet) ps.executeQuery();	
			while(rs.next()){
				thisName=rs.getString("name");
				thisPwd=rs.getString("pwd");
			}
			if(thisName==null)
				 vo=new RegisterVO(thisName, thisPwd);
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
	
//	public static void main(String[] args){
//		StudentVO vo = new StudentVO(2, "abcdef", 20);
//		StudentDAO sDAO=new StudentDAO(); 
//		boolean bool=sDAO.updateAge(vo);
//		if(bool==true)
//		{
//			System.out.println("OK");//测试
//		}else {
//			System.out.println("NO");
//		}
		
//		RegisterDAO sDAO=new RegisterDAO(); 
//		RegisterVO vo = sDAO.findByName("zxm");
//		System.out.println(vo.toString());
//	}
}
