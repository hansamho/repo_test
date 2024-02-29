package com.example.demo.infra.code;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
//	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/codeXdmList")
	public String codeXdmList(Model model) throws Exception{
//		List<CodeGroupDto> list = service.selectList();
		
//		List<CodeGroupDto> codeGroupDtos = service.selectList();
		
//		for(CodeGroupDto a:codeGroupDtos) {
//			System.out.println(a.getName());
//		}
		
		model.addAttribute("list", service.selectList());
		
		return "codeXdmList";
	}
}