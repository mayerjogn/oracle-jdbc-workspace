package com.youtube.model.VO;

import java.util.Date;

public class VideoComment {

	private int commentCode;
	private String commentDesc;
	private Date commentDate;
	private int commentParent;
	private Video videoCode;
	private Member member;
	
	public VideoComment() {}

	public VideoComment(int commentCode, String commentDesc, Date commentDate, int commentParent, Video videoCode,
			Member member) {
		super();
		this.commentCode = commentCode;
		this.commentDesc = commentDesc;
		this.commentDate = commentDate;
		this.commentParent = commentParent;
		this.videoCode = videoCode;
		this.member = member;
	}

	public int getCommentCode() {
		return commentCode;
	}

	public void setCommentCode(int commentCode) {
		this.commentCode = commentCode;
	}

	public String getCommentDesc() {
		return commentDesc;
	}

	public void setCommentDesc(String commentDesc) {
		this.commentDesc = commentDesc;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public int getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(int commentParent) {
		this.commentParent = commentParent;
	}

	public Video getVideoCode() {
		return videoCode;
	}

	public void setVideoCode(Video videoCode) {
		this.videoCode = videoCode;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Video_Comment [commentCode=" + commentCode + ", commentDesc=" + commentDesc + ", commentDate="
				+ commentDate + ", commentParent=" + commentParent + ", videoCode=" + videoCode + ", member=" + member
				+ "]";
	}
	
	
	
}
