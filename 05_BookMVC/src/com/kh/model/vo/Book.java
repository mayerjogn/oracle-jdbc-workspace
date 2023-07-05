package com.kh.model.vo;

public class Book {

	// 테이블 : TB_BOOK / 컬럼 : bk_no, bk_titile, bk_author
	public Book(String title, String author) {
		this.bkTitle = title;
		this.bkAuthor = author;
	}
	public Book(int bkNO, String bkTitle, String bkAuthor) {
		this.bkNO = bkNO;
		this.bkTitle = bkTitle;
		this.bkAuthor = bkAuthor;
	}
	private int bkNO;
	private String bkTitle;
	private String bkAuthor;
	public int getBkNO() {
		return bkNO;
	}
	public void setBkNO(int bkNO) {
		this.bkNO = bkNO;
	}
	public String getBkTitle() {
		return bkTitle;
	}
	public void setBkTitle(String bkTitle) {
		this.bkTitle = bkTitle;
	}
	public String getBkAuthor() {
		return bkAuthor;
	}
	public void setBkAuthor(String bkAuthor) {
		this.bkAuthor = bkAuthor;
	}
	@Override
	public String toString() {
		return "Book [bkNO=" + bkNO + ", bkTitle=" + bkTitle + ", bkAuthor=" + bkAuthor + "]";
	}
	
	
	
}
