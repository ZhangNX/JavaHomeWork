package cn.edu.bjfu.en.im;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("�������1�ۼӵ�������");
		int num=in.nextInt();
		System.out.println(sumToNum(num));
	}

	public static int sumToNum(int num){
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}
	
}