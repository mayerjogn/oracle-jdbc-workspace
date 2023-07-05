package com.kh.controller;

import java.sql.Connection;
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
		try {
			dao.sellBook(no);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean registerMember(Member member) {
		// char rs.getString("status").charAt(0)
		try {
			dao.registerMember(member);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Member login(String id, String password) { //n인 경우 로그인
		// get으로 id랑 password 불러오는게아닌가?.. 성공하면 대충 이름 불러와주고 실패하면 null불러오고?
		try {// DAO 아직 완료안됨 다오부터 해결
			dao.login(id, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
	
	public boolean deleteMember() { // update 사용
		// 위에 member 변수 로그인때 담아놓아서 매개변수 따로 안받은거
		// UPDATE - STATUS를 Y로!		
		// status가 n이면 회원 유지, y면 회원 탈퇴
		// n이 기본값! <--- 회원 유지!
		// 실패의 경우도 있으니까 아이디랑 비밀번호 둘다 체크하고 boolean이고
		// 로그인돼있는지 확인까지 해야하니 if문써서  !=null로 체크해야되는거아닌가?
		if();
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





