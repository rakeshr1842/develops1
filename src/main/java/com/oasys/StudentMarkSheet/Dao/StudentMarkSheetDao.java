package com.oasys.StudentMarkSheet.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.StudentMarkSheet.MarkSheet.MarkSheet;
import com.oasys.StudentMarkSheet.Repository.StudentMarkSheetRepository;

@Repository
public class StudentMarkSheetDao {
	@Autowired
	StudentMarkSheetRepository stRepo;
public String insertMarks(MarkSheet s) {
	stRepo.save(s);
		return "saved success";
	}
public MarkSheet addMark(MarkSheet b) {
	stRepo.save(b);	
	return b;
}
}

