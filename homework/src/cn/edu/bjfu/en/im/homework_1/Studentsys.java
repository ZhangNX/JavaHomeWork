package cn.edu.bjfu.en.im.homework_1;

import java.util.List;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Studentsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentVO> arrStudent = new ArrayList<StudentVO>();

		arrStudent.add(new StudentVO(10000, "zhang", 19));
		arrStudent.add(new StudentVO(10001, "que", 19));
		arrStudent.add(new StudentVO(10002, "zhou", 19));

		System.out.println(arrStudent.toString());

		StudentVO c = arrStudent.get(1);
		System.out.println(c.getNo() + "-" + c.getName() + "-" + c.getAge());
		arrStudent.remove(1);
		StudentVO z = arrStudent.get(1);
		System.out.println(z.getNo() + "-" + z.getName() + "-" + z.getAge());
	}
}
