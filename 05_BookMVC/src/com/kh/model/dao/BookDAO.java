package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.model.vo.Book;
import com.kh.model.vo.Member;
import com.kh.model.vo.Rent;

import config.ServerInfo;

public class BookDAO implements BookDAOTemplate{

		private Properties p = new Properties();
		
		public BookDAO() {
			try {
				p.load(new FileInputStream("src/config/jdbc.properties"));
				try {
					Class.forName(ServerInfo.DRIVER_NAME);
					System.out.println("driver loading...");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	@Override
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement st, Connection conn) throws SQLException {
		st.close();
		conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement st, Connection conn) throws SQLException {
		rs.close();
		closeAll(st,conn);
	}

	@Override
	public ArrayList<Book> printBookAll() throws SQLException {
		// SQL문 SELECT, 테이블 : TB_BOOk
		// ArrayList에 추가할 때 add 메서드
		// rs.getString("bk_title"); bktitle (X)
				
		Connection conn = getConnect();		
		PreparedStatement st= conn.prepareStatement(p.getProperty("printBookAll"));
		ResultSet rs = st.executeQuery();
		
		ArrayList<Book> book = new ArrayList<Book>();
		
		while(rs.next()) {
			
			book.add( new Book(rs.getInt("bk_No"),rs.getString("bk_Title"),rs.getString("bk_Author")));			
		}
		
		return book;
	}

	@Override
	public int registerBook(Book book) throws SQLException {
		// 반환값 타입이 int인 경우 다 st.executeUpdate()!
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("registerBook"));
		
		st.setString(1, book.getBkTitle());
		st.setString(2, book.getBkAuthor());		
		int result = st.executeUpdate();		
		closeAll(st,conn);
		return result;
		
	}

	@Override
	public int sellBook(int no) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("sellBook"));
		st.setInt(1, no);
		
		int result = st.executeUpdate();
		
		closeAll(st,conn);
		// 책 삭제! DELETE문!
		
		
		return result;
	}

	@Override
	public int registerMember(Member member) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("registerMember"));
		st.setInt(1, member.getMemberNo());
		st.setString(2, member.getMemberId());
		st.setString(3, member.getMemberName());
		int result = st.executeUpdate();
		closeAll(st,conn);
		return result;
	}

	@Override
	public Member login(String id, String password) throws SQLException {
		// char rs.getString("status").charAt(0)
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement("login");
		st.setString(1, id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		Member m = null;
//		while(rs.next()) {
//			m = new Member(id,
//					rs.getString("password"),
//					rs.getString("status").charAt(0));
//		}
			
		return m;
		
	
	}

	@Override
	public int deleteMember(String id, String password) throws SQLException {
		// UPDATE - STATUS를 Y로!		
		// status가 n이면 회원 유지, y면 회원 탈퇴
		// n이 기본값! <--- 회원 유지!
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement("deleteMember");
		st.setString(1, id);
		st.setString(2, password);
		int result = st.executeUpdate();
		closeAll(st,conn);
		return result;
	}

	@Override
	public int rentBook(Rent rent) throws SQLException {
		// 책 대여 기능 INSERT ~~ TB_RENT
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement("rentBook");
		
		return 0;
	}

	@Override
	public int deleteRent(int no) throws SQLException {
		// UPDATE - STATUS를 Y로!
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement("deleteRent");
		int result = st.executeUpdate();
		closeAll(st,conn);
		return result;
		
	}

	@Override
	public ArrayList<Rent> printRentBook(String id) throws SQLException {
		// SQL문 - JOIN 필요 테이블 다 엮어야 됨 
		// 이유 --> rent_no, rent_date, bk_tktle, bk_author
		// 조건은 memeber_id 가지고 가져오니까?
		// while문 안에서 ! Rent rent = new Rent();
		// setter 사용!
		// rest.setBook(new Book(rs.getString("bk_title"), rs.getString("bk_author")));
		return null;
	}

}
