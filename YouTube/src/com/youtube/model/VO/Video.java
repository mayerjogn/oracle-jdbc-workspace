package com.youtube.model.VO;

import java.util.Date;

public class Video {

	private int videoCode;
	private String videoTitle;
	private String videoDesc;
	private Date videoDate;
	private int videoView;
	private String videoUrl;
	private String videoPhoto;
	private Category category;
	private Channel channel;
	private Member member;
	
	public Video() {}

	public Video(int videoCode, String videoTitle, String videoDesc, Date videoDate, int videoView, String videoUrl,
			String videoPhoto, Category category, Channel channel, Member member) {
		super();
		this.videoCode = videoCode;
		this.videoTitle = videoTitle;
		this.videoDesc = videoDesc;
		this.videoDate = videoDate;
		this.videoView = videoView;
		this.videoUrl = videoUrl;
		this.videoPhoto = videoPhoto;
		this.category = category;
		this.channel = channel;
		this.member = member;
	}

	public int getVideoCode() {
		return videoCode;
	}

	public void setVideoCode(int videoCode) {
		this.videoCode = videoCode;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getVideoDesc() {
		return videoDesc;
	}

	public void setVideoDesc(String videoDesc) {
		this.videoDesc = videoDesc;
	}

	public Date getVideoDate() {
		return videoDate;
	}

	public void setVideoDate(Date videoDate) {
		this.videoDate = videoDate;
	}

	public int getVideoView() {
		return videoView;
	}

	public void setVideoView(int videoView) {
		this.videoView = videoView;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getVideoPhoto() {
		return videoPhoto;
	}

	public void setVideoPhoto(String videoPhoto) {
		this.videoPhoto = videoPhoto;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Video [videoCode=" + videoCode + ", videoTitle=" + videoTitle + ", videoDesc=" + videoDesc
				+ ", videoDate=" + videoDate + ", videoView=" + videoView + ", videoUrl=" + videoUrl + ", videoPhoto="
				+ videoPhoto + ", category=" + category + ", channel=" + channel + ", member=" + member + "]";
	}
	
	
}
