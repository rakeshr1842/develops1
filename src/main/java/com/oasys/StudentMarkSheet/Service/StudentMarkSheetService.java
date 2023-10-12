package com.oasys.StudentMarkSheet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.StudentMarkSheet.Dao.StudentMarkSheetDao;
import com.oasys.StudentMarkSheet.MarkSheet.MarkSheet;
@Service
public class StudentMarkSheetService {
	@Autowired
	StudentMarkSheetDao stDao;
public String insertmarks(MarkSheet s) {
	int a=s.getSem1theory()+s.getSem1practical();
   int b=s.getSem2theory()+s.getSem2practical();
   s.setSem1total(a);
   s.setSem2total(b);
    return stDao.insertMarks(s);
	}
public MarkSheet addMark(MarkSheet b) {
		return stDao.addMark(b);
}

}
