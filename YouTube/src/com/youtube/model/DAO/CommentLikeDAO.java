package com.youtube.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.youtube.model.VO.CommentLike;
import com.youtube.model.VO.Video;
import com.youtube.model.VO.VideoComment;

public class CommentLikeDAO implements CommentLikeDAOTemplate {

	@Override
	public Connection getConnect() throws SQLException {
		return null;
	}

	@Override
	public void closeAll(PreparedStatement st, Connection conn) throws SQLException {
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement st, Connection conn) throws SQLException {
	}

	@Override
	public int addLike(Video like) throws SQLException {
		return 0;
	}

	@Override
	public int deleteLike(int likeCode) throws SQLException {
		return 0;
	}

	@Override
	public int addComment(VideoComment comment) throws SQLException {
		return 0;
	}

	@Override
	public int updateComment(VideoComment comment) throws SQLException {
		return 0;
	}

	@Override
	public int dleleteComment(int commentCode) throws SQLException {
		return 0;
	}

	@Override
	public ArrayList<VideoComment> videoCommentList(int videoCode) throws SQLException {
		return null;
	}

	@Override
	public int addCommentLike(CommentLike like) throws SQLException {
		return 0;
	}

	@Override
	public int deleteCommentLike(int likeCode) throws SQLException {
		return 0;
	}

}
