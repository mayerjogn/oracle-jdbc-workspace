package com.youtube.model.VO;

import java.util.Date;

public class VideoLike {

	private int VideoLike;
	private Date VlikeDate;
	private int VideoCode;
	private Member member;
	public VideoLike() {}
	public VideoLike(int videoLike, Date vlikeDate, int videoCode, Member member) {
		super();
		VideoLike = videoLike;
		VlikeDate = vlikeDate;
		VideoCode = videoCode;
		this.member = member;
	}
	public int getVideoLike() {
		return VideoLike;
	}
	public void setVideoLike(int videoLike) {
		VideoLike = videoLike;
	}
	public Date getVlikeDate() {
		return VlikeDate;
	}
	public void setVlikeDate(Date vlikeDate) {
		VlikeDate = vlikeDate;
	}
	public int getVideoCode() {
		return VideoCode;
	}
	public void setVideoCode(int videoCode) {
		VideoCode = videoCode;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "Video_Like [VideoLike=" + VideoLike + ", VlikeDate=" + VlikeDate + ", VideoCode=" + VideoCode
				+ ", member=" + member + "]";
	}
	
}
