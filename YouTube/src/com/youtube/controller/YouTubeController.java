package com.youtube.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.youtube.model.DAO.ChannelDAO;
import com.youtube.model.DAO.MemberDAO;
import com.youtube.model.DAO.VideoDAO;
import com.youtube.model.VO.Category;
import com.youtube.model.VO.Channel;
import com.youtube.model.VO.Member;
import com.youtube.model.VO.Video;

public class YouTubeController {

	private Member m = new Member();
	private Channel channel = new Channel();

	private MemberDAO memberDao = new MemberDAO();
	private ChannelDAO channelDao = new ChannelDAO();
	private VideoDAO videoDao = new VideoDAO();

	public boolean register(Member member) {
		try {
			if (memberDao.register(member) == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public Member login(String id, String password) {
		
		
		try {
			m = memberDao.login(id, password);
			if (m != null)
				return m;
			else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return m;

	}

	public boolean addChannel(Channel channel) {

		try {
			channel.setMember(m);
			if (channelDao.addChannel(channel) == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean updateChannel(Channel channel) {
		myChannel();
		try {
			channel.setChannelCode(this.channel.getChannelCode());
			if (channelDao.updateChannel(channel) == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deleteChannel() {
		myChannel();
		try {
			if (channelDao.deleteChannel(this.channel.getChannelCode()) == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Channel myChannel() {
		try {
			channel = channelDao.myChannel(this.m.getMemberId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return channel;
	}

	public boolean addVideo(Video video) {
		myChannel();
		
		video.setChannel(this.channel);
		video.setMember(this.m);
		
		try {
			if (videoDao.addVideo(video) == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<Category> categoryList() {
		try {
			return videoDao.categoryList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}