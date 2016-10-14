package cn.edu.bjfu.en.im;

import java.util.List;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Studentsys {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> arrStudent = new ArrayList<Student>();
		
			arrStudent.add(new Student(10000, "zhang", 19));
			arrStudent.add(new Student(10001, "que", 19));
			arrStudent.add(new Student(10002, "zhou", 19));
		
			Student c = arrStudent.get(1);
			System.out.println(c.getNo()+"-"+c.getName()+"-"+c.getAge());
			arrStudent.remove(1);
			Student z = arrStudent.get(1);
			System.out.println(z.getNo()+"-"+z.getName()+"-"+z.getAge());
	}
}


