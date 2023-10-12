package com.oasys.StudentMarkSheet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.StudentMarkSheet.MarkSheet.MarkSheet;

import com.oasys.StudentMarkSheet.Service.StudentMarkSheetService;

@RestController
@RequestMapping(value="/student")
public class StudentMarkSheetController {
	@Autowired
	StudentMarkSheetService stser;
	@PostMapping(value="/add")
	public String insertmarks(@RequestBody MarkSheet s) {
	return stser.insertmarks(s);
	}
	@PostMapping(value ="/sadd")
	public MarkSheet addMark(@RequestBody MarkSheet b) {
		return stser.addMark(b);
	}
	
	
	

}
