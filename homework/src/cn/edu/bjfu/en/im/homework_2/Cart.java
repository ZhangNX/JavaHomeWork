package cn.edu.bjfu.en.im.homework_2;

import java.util.HashMap;
import java.util.Map;
import cn.edu.bjfu.en.im.homework_2.BookVO;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, BookVO> mapBook = new HashMap<Integer, BookVO>();

		mapBook.put(0001, new BookVO("信息管理", 20, 2));

		BookVO thisbook = mapBook.get(0001);
		System.out.println(thisbook.toString());

		mapBook.put(0002, new BookVO("统计学", 25, 4));
		mapBook.put(0003, new BookVO("高等数学", 26, 2));
		int priceBook = 0;
		for (int a : mapBook.keySet()) {
			BookVO book = mapBook.get(a);
			if(book.getNum()!=0){
				priceBook+=book.getBookPrice()*book.getNum();
			}
		}
		System.out.println(priceBook);
	}

}
