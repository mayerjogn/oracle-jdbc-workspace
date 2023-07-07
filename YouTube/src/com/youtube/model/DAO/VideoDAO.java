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

import com.youtube.model.VO.Category;
import com.youtube.model.VO.Video;

import config.ServerInfo;

public class VideoDAO implements VideoDAOTemplate {

	private Properties p = new Properties();

	public VideoDAO() {
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
	public int addVideo(Video video) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("addVideo"));
		st.setString(1,video.getVideoTitle());
		st.setString(2, video.getVideoUrl());
		st.setString(3, video.getVideoPhoto());
		st.setInt(4, video.getCategory().getCategoryCode());
		st.setInt(5, video.getChannel().getChannelCode());
		st.setString(6, video.getMember().getMemberId());
		
		int result = st.executeUpdate();
		closeAll(st, conn);
		return result;
		
		
	}

	@Override
	public int updateVide(Video video) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("updateVideo"));
		
		
		
		int result = st.executeUpdate();
		closeAll(st, conn);
		return result;
	}

	@Override
	public int deleteVideo(int videoCode) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("deleteVideo"));
		
		
		
		
		int result = st.executeUpdate();
		closeAll(st, conn);
		return result;
	}

	@Override
	public ArrayList<Video> videoAllList() throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("videoAllList"));
		return null;
	}

	@Override
	public ArrayList<Video> channelVideoList(int channelCode) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("channelVideoList"));
		
		return null;
	}

	@Override
	public Video viewVideo(int videoCode) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("viewVideo"));
		
		return null;
	}

	@Override
	public ArrayList<Category> categoryList() throws SQLException {
		Connection conn = getConnect();
		PreparedStatement st = conn.prepareStatement(p.getProperty("categoryList"));
		
		ResultSet rs = st.executeQuery();
		ArrayList<Category> list = new ArrayList<>();
		while(rs.next()) {
			list.add(new Category(rs.getInt("category_code"), rs.getString("category_name")));
			
		}
		closeAll(rs, st, conn);
		return list;
	}

}
