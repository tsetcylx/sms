package com.chinasofti.studentmanager.biz.impl;

import com.chinasofti.studentmanager.biz.StudentBiz;
import com.chinasofti.studentmanager.dao.StudentDao;
import com.chinasofti.studentmanager.dao.impl.StudentDaoImpl;
import com.chinasofti.studentmanager.domain.Student;

public class StudentBizImpl implements StudentBiz {
	//创建dao层的变量
	private StudentDao dao;
	
	public StudentBizImpl() {
		this.dao=new StudentDaoImpl();
	}

	@Override
	public Student selectId(int id) {
		
		return this.dao.selectById(id);
	}

}
