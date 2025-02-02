package cn.edu.bjfu.en.im.homework_1;

public class StudentVO {
	private int no;
	private String name;
	private int age;

	public StudentVO(int thisNo, String thisName, int thisAge) {
		this.no = thisNo;
		this.name = thisName;
		this.age = thisAge;
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

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("StudentVO [no=" + no + ", name=" + name + ", age=" + age + "]");
		
		return stringBuilder.toString();
//		return "StudentVO [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
