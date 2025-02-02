package cn.edu.bjfu.en.im.homework_2;

public class BookVO {
	private String bookName;
	private int bookPrice;
	private int num;

	BookVO(String thisBookName, int thisBookPrice) {
		bookName = thisBookName;
		bookPrice = thisBookPrice;

	}

	BookVO(String thisBookName, int thisBookPrice, int thisNum) {
		bookName = thisBookName;
		bookPrice = thisBookPrice;
		num = thisNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "BookOV [bookName=" + bookName + ", bookPrice=" + bookPrice
				+ "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

}
