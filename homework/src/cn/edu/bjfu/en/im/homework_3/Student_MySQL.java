package cn.edu.bjfu.en.im.homework_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import com.mysql.jdbc.PreparedStatement;

public class Student_MySQL {

	public static Connection open() {
		Connection conn = null;
		try {
			// 1. 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 获取到指定数据库的连接对象
			String url = "jdbc:mysql://localhost/im2016";
			conn = DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void insert(int no, String name, int age) throws SQLException {

		Connection conn = open();
		// 带问号的sql语句
		String sql = "insert into testIt (no,name,age) values (?,?,?)";
		// 3.获取PreparedStatement对象，用以执行sql语句
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
		// sql重的?替换为具体值, setInt, setString,序号从1开始
		ps.setInt(1, no);
		ps.setString(2, name);
		ps.setInt(3, age);
		// 4.通过PreparedStatement对象执行sql语句
		int count = ps.executeUpdate();// 执行sql，
		// 返回：到数据库中有几条记录受到了影响
		if (count > 0)
			{
			System.out.println("insert ok.");
			}
		close(conn);
	}

	public static void updateAge(int no, int age) throws SQLException {

		Connection conn = open();
		// 带问号的sql语句
		String sql = "update testIt set age=? where no=?";
		// 3.获取PreparedStatement对象，用以执行sql语句
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
		// sql重的?替换为具体值, setInt, setString,序号从1开始
		ps.setInt(2, no);
		ps.setInt(1, age);
		// 4.通过PreparedStatement对象执行sql语句
		int count = ps.executeUpdate();// 执行sql，
		// 返回：到数据库中有几条记录受到了影响
		if (count > 0)
			System.out.println("update ok.");
		close(conn);
	}
	
	public static void delete(int no) throws SQLException {

		Connection conn = open();
		// 带问号的sql语句
		String sql = "delete from testIt where no=?";
		// 3.获取PreparedStatement对象，用以执行sql语句
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
		// sql重的?替换为具体值, setInt, setString,序号从1开始
		ps.setInt(1, no);
		// 4.通过PreparedStatement对象执行sql语句
		int count = ps.executeUpdate();// 执行sql，
		// 返回：到数据库中有几条记录受到了影响
		if (count > 0)
			System.out.println("delete ok.");
		close(conn);
	}
	public static void close(Connection conn) {
		if (conn == null)
			return;
		try {
			conn.close();// 关闭连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = open();
		insert(1, "ABC", 20);
		insert(2, "A2", 19);
		insert(3, "C3", 20);
		updateAge(3, 18);// 修改学号为3号的同学为18岁
		delete(2);// 删除学号为2号的同学

	}

}
