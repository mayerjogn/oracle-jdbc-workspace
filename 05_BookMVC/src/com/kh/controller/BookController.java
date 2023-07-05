package com.kh.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.BookDAO;
import com.kh.model.vo.Book;
import com.kh.model.vo.Member;
import com.kh.model.vo.Rent;

public class BookController {

	private BookDAO dao = new BookDAO();
	private Member member = new Member(); // 로그인 정보 여기에 담기
	
	public ArrayList<Book> printBookAll() throws SQLException{ //select
		
			return dao.printBookAll();
	}
	
	public boolean registerBook(Book book) { //insert
		try 
		{
			if(dao.registerBook(book) > 0)
				return true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean sellBook(int no) { //delete
		return false;
	}
	public boolean registerMember(Member member) {
		return false;
	}
	
	public Member login(String id, String password) { //n인 경우 로그인
		return member;
	}
	
	public boolean deleteMember() { // update 사용
		// 위에 member 변수 로그인때 담아놓아서 매개변수 따로 안받은거
		return false;
	}
	
	public boolean rentBook(int no) { // 책 대여 기능 INSERT ~~ TB_RENT
		return false;
		
	}
	public boolean deleteRent(int no) { // UPDATE - STATUS를 Y로!
		return false;
	}
	
	public ArrayList<Rent> printRentBook(){ 
		return null;
	}

	
}





