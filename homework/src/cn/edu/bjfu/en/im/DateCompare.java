package cn.edu.bjfu.en.im;

public class DateCompare {

	static boolean doCompare(String date1, String date2) {
		String[] array1 = new String[10];
		array1 = date1.split("-");
		int dateNum1 = 0;
		int[] num1 = new int[3];
		for (int i = 0; i <= 2; i++) {
			num1[i] = Integer.parseInt(array1[i]);
		}
		dateNum1 = num1[0] * 10000 + num1[1] * 100 + num1[2] * 1;
		// System.out.println(dateNum1);
		String[] array2 = new String[10];
		array2 = date2.split("-");
		int dateNum2 = 0;
		int[] num2 = new int[3];
		for (int i = 0; i <= 2; i++) {
			num2[i] = Integer.parseInt(array2[i]);
		}
		dateNum2 = num2[0] * 10000 + num2[1] * 100 + num2[2] * 1;
		// System.out.println(dateNum2);
		if (dateNum1 < dateNum2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String da1;
		String da2;
		da1 = "2000-10-20";
		da2 = "2001-10-10";
		boolean str1IsBefore = doCompare(da1, da2);
		System.out.println(str1IsBefore);
	}

}
