package cn.edu.bjfu.en.im;

import java.util.List;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Studentsys {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentOV> arrStudent = new ArrayList<StudentOV>();
		
			arrStudent.add(new StudentOV(10000, "zhang", 19));
			arrStudent.add(new StudentOV(10001, "que", 19));
			arrStudent.add(new StudentOV(10002, "zhou", 19));
		
			StudentOV c = arrStudent.get(1);
			System.out.println(c.getNo()+"-"+c.getName()+"-"+c.getAge());
			arrStudent.remove(1);
			StudentOV z = arrStudent.get(1);
			System.out.println(z.getNo()+"-"+z.getName()+"-"+z.getAge());
	}
}


