package com.kh.controller;

import java.sql.SQLException;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class MemberController {

	private MemberDAO dao = new MemberDAO();

	public boolean joinMembership(Member m) {

		
		try {
			if(dao.getMember(m.getId()) == null) {
				dao.registerMember(m);
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public String login(String id, String password) {
		// 로그인 성공하면 이름 반환
		// 실패하면 null 반환
		try {
			if (dao.getMember(id) != null) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {

	
			
			if(login(id,oldPw)!=null){
				try {
					dao.updatePassword(new Member(dao.getMember(id).getId(),newPw, dao.getMember(id).getName())	);
				} catch (SQLException e) {
					e.printStackTrace();
				}
	
			return true;	
		}else {
		
			return false;
		}
		// 로그인 했을 때 null이 아닌 경우
		// 비밀번호 변경 후 true 반환, 아니라면 false 반환

		
	}

	public void changeName(String id, String name) {

		try {
			dao.updateName(new Member(dao.getMember(id).getId(),name, dao.getMember(id).getName()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 이름 변경!

	}

}