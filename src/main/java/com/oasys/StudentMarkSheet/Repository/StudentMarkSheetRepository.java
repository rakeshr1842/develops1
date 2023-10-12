package com.oasys.StudentMarkSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.StudentMarkSheet.MarkSheet.MarkSheet;

public interface StudentMarkSheetRepository extends JpaRepository<MarkSheet,Integer> {

}
