package cn.edu.bjfu.en.im;

public class Student {
	int no; String name; int age;
	Student(int thisNo, String thisName, int thisAge){
		no=thisNo;
		name=thisName;
		age=thisAge;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
