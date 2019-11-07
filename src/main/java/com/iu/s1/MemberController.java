package com.iu.s1;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import com.iu.s1.member.MemberDTO;
@Controller
@RequestMapping("/member/**")
public class MemberController {

	
	//memberlogin-get
	@RequestMapping("memberLogin")
	public void memberLogin() {
		
	}
	
	//memberlogin-post
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO) {
		int result = 1;
		
		String msg = "로그인 실패";
		String path = "memberLogin";
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("common/common_result");
		
		if(result > 0) {
			mv.setViewName("redirect:/");
			
		}
		
		
		
		return mv;
		
	}
	//memberjoin-get
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public void memberJoin() {
		
		
	}
	
	//memberjoin-post
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	
	public ModelAndView memberJoin(MemberDTO memberDTO) {
		int result = 1;
		
		String msg = "가입 실패";
		if(result > 0) {
			msg = "가입 성공";
		}
		String path = "../";
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("/common/common_result");
		
		return mv;
			
	}
}