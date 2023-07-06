package com.kh.model.vo;

/*
 * 
 * VO(Value Object) / DTO(Data Transfer Object)
 * 
 * */

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private int memberNo;
	
	public Member() {}
	public Member(String id, String password, String name) {
		this.memberId = id;
		this.memberPwd = password;
		this.memberName = name;
	}
	public Member(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getId() {
		return memberId;
	}
	public void setId(String id) {
		this.memberId = id;
	}
	public String getPassword() {
		return memberPwd;
	}
	public void setPassword(String password) {
		this.memberPwd = password;
	}
	public String getName() {
		return memberName;
	}
	public void setName(String name) {
		this.memberName = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + memberId + ", password=" + memberPwd + ", name=" + memberName + "]";
	}

}