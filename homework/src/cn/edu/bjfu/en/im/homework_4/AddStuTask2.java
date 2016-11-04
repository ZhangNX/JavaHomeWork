package cn.edu.bjfu.en.im.homework_4;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.Instant;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import cn.edu.bjfu.en.im.homework_3.Student_MySQL;

public class AddStuTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = Student_MySQL.open();
		try {
			Student_MySQL.insert(6, "zhang", 18);
			Student_MySQL.insert(7, "BU", 21);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
