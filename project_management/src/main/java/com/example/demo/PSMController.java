package com.example.demo; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller 
public class PSMController {
	
    //로그인 성공후 이동페이지
    @RequestMapping(value = { "psm/psmList" })
	public String welcome() { 
		System.out.println("f");
		return "psmMgrList"; 
	} 
	
}

