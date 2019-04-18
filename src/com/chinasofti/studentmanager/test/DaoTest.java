package com.chinasofti.studentmanager.test;

import java.util.List;

import org.junit.Test;

import com.chinasofti.studentmanager.dao.ClazzDao;
import com.chinasofti.studentmanager.dao.impl.ClazzDaoImpl;
import com.chinasofti.studentmanager.domain.Clazz;

public class DaoTest {
	@Test
	public void addClazz(){
		ClazzDao c=new ClazzDaoImpl();
		System.out.println(c.addClazz(new Clazz(3, "高一三班")));
	}
	@Test
	public void selectAllClazz(){
		ClazzDao c=new ClazzDaoImpl();
		List<Clazz> list = c.selectAll();
		for (Clazz clazz : list) {
			System.out.println(clazz.getClid()+"---"+clazz.getClname());
		}
	}
}
