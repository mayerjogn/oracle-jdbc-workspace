package com.youtube.model.VO;

import java.util.Date;

public class CommentLike {

	private int commLikeCode;
	private Date commLikeDate;
	private Video commentCode;
	private Member member;
	
	public CommentLike() {}
	public CommentLike(int commLikeCode, Date commLikeDate, Video commentCode, Member member) {
		super();
		this.commLikeCode = commLikeCode;
		this.commLikeDate = commLikeDate;
		this.commentCode = commentCode;
		this.member = member;
	}
	public int getCommLikeCode() {
		return commLikeCode;
	}
	public void setCommLikeCode(int commLikeCode) {
		this.commLikeCode = commLikeCode;
	}
	public Date getCommLikeDate() {
		return commLikeDate;
	}
	public void setCommLikeDate(Date commLikeDate) {
		this.commLikeDate = commLikeDate;
	}
	public Video getCommentCode() {
		return commentCode;
	}
	public void setCommentCode(Video commentCode) {
		this.commentCode = commentCode;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "Comment_Like [commLikeCode=" + commLikeCode + ", commLikeDate=" + commLikeDate + ", commentCode="
				+ commentCode + ", member=" + member + "]";
	}
		
}
