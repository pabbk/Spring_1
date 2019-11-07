package com.iu.s1;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.notice.NoticeDTO;
import com.iu.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Inject
	private NoticeService noticeService;
	

	//noticeUpdate - GET
	@RequestMapping("noticeUpdate")
	public ModelAndView noticeUpdate(int num) throws Exception{
		NoticeDTO noticeDTO = noticeService.noticeOne(num);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", noticeDTO);
		mv.setViewName("/notice/noticeUpdate");
		
		return mv;
		
	}
	
	//noticeUpdate - POST
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public ModelAndView noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		int result = noticeService.update(noticeDTO);
		
		String msg = "수정 실패";
		String path = "noticeList";
		if(result > 0) {
			msg = "수정 성공";
			
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", msg);
		modelAndView.addObject("path", path);
		modelAndView.setViewName("common/common_result");
		
		return modelAndView;
	}
	
	
	//noticeWrite - Get
	@RequestMapping(value =  "noticeWrite", method = RequestMethod.GET)
	public String noticeWrite() {
		
		
		
		return "notice/noticeWrite";
	}
	
	//noticeWrite - Post
	@RequestMapping(value =  "noticeWrite", method = RequestMethod.POST)
	public String noticeWrite(NoticeDTO noticeDTO) {
		
		

		return "notice/noticeList";
	}
	
	//selectone
	@RequestMapping(value = "noticeSelect", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView noticeSelect(int num) throws Exception{
		
		NoticeDTO noticeDTO = new NoticeDTO();
		
		noticeDTO = noticeService.noticeOne(num);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", noticeDTO);
		mv.setViewName("/notice/noticeSelect");
		
		return mv;
	}
	
	
	
	//list
	@RequestMapping("noticeList")
	public ModelAndView noticeList() throws Exception{
		
		List<NoticeDTO> ar = noticeService.noticeList();
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("List", ar);
		mv.setViewName("/notice/noticeList");
		
		return mv;
		
	}
	
	
	
}
