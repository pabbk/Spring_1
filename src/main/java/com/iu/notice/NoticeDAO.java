package com.iu.notice;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import oracle.jdbc.proxy.annotation.Pre;
@Repository
public class NoticeDAO {
	
	@Inject
	private DataSource datasource;
	
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		int result = 0;
		Connection con = datasource.getConnection();
		String sql = "update notice set title=? , contents=? "
				+ "where num = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getTitle()); //title
		st.setString(2, noticeDTO.getContents()); //contents
		st.setInt(3, noticeDTO.getNum()); //num
		System.out.println(noticeDTO.getNum());
		System.out.println(noticeDTO.getTitle());
		System.out.println(noticeDTO.getContents());
		result = st.executeUpdate();
		return result;
	}
	
	public List<NoticeDTO> noticeList() throws Exception{
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		
		
		
		

		return ar;
	}
	
	public NoticeDTO noticeOne(int num) throws Exception{
		NoticeDTO noticeDTO = null;
		
		Connection con = datasource.getConnection();
		
		String sql = "select * from notice "
				+ "where num = ?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, num);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setNum(rs.getInt(1));
			noticeDTO.setTitle(rs.getString(2));
			noticeDTO.setWriter(rs.getString(3));
			noticeDTO.setContents(rs.getString(4));
			noticeDTO.setReg_date(rs.getDate(5));
			noticeDTO.setHit(rs.getInt(6));
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		return noticeDTO;
	}
}
