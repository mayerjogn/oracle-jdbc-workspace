package com.youtube.model.DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.youtube.model.VO.Member;
import com.youtube.model.VO.Subscribe;

import config.ServerInfo;

public class MemberDAO implements MemberDAOTemplate {
	private Properties p = new Properties();

	public MemberDAO() {
		try {
			p.load(new FileInputStream("src/config/jdbc.properties"));
			try {
				Class.forName(ServerInfo.DRIVER_NAME);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Connection getConnect() throws SQLException {

		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
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
		closeAll(st, conn);
	}

	@Override
	public int register(Member member) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("register"));
		st.setString(1, member.getMemberId());
		st.setString(2, member.getMemberPassword());
		st.setString(3, member.getMemberNickname());
		
		int result = st.executeUpdate();
		closeAll(st,conn);
		return result;
	}

	@Override
	public Member login(String id, String password) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("login"));
		st.setString(1, id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		Member m = null;
		
		if(rs.next()) {
			m = new Member();
			
			m.setMemberId(rs.getString("member_id"));
			m.setMemberPassword(rs.getString("member_password"));
			m.setMemberNickname(rs.getString("member_nickname"));
		}
			closeAll(rs, st, conn);
		return m;
	}

	@Override
	public int addSubscribe(Subscribe subscribe) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("addSubscribe"));
		return 0;
	}

	@Override
	public int deleteSubscribe(int subsCode) throws SQLException {
		return 0;
	}

	@Override
	public ArrayList<Subscribe> mySubscribeList(String memberid) throws SQLException {
		return null;
	}

}
