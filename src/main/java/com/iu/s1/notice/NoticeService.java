package com.iu.s1.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.jdbc.proxy.annotation.SetDelegate;

@Service
public class NoticeService {
	
	
	private NoticeDAO noticeDAO;
	
	
	@Inject
	public NoticeService(NoticeDAO noticeDAO) {
		
		this.noticeDAO = noticeDAO;
	}
	
	//@Inject
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	
	}
	
	
	//글 전체 조회
	public List<NoticeDTO> noticeList() throws Exception{
		List<NoticeDTO> ar = noticeDAO.noticeList();
		return ar;
		
	}
	//글 하나 조회
	public NoticeDTO noticeOne(int num) throws Exception{
		NoticeDTO noticeDTO = noticeDAO.noticeOne(num);
		
		return noticeDTO;
	}
	
	//글 수정
	public int update(NoticeDTO noticeDTO) throws Exception{
		int result = noticeDAO.noticeUpdate(noticeDTO);
		return result;
	}
}
