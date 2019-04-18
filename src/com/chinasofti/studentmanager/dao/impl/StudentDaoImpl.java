package com.chinasofti.studentmanager.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.chinasofti.studentmanager.dao.StudentDao;
import com.chinasofti.studentmanager.domain.Clazz;
import com.chinasofti.studentmanager.domain.Student;
import com.chinasofti.studentmanager.util.DBUtil;

public class StudentDaoImpl implements StudentDao {
	private DBUtil db;
	@Override
	public boolean addStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student selectById(int id) {
		this.db=new DBUtil();
		//创建sql 语句
		String sql="select * from student where stuid="+id;
		//执行sql语句
		try {
			ResultSet rs = this.db.query(sql);
			if(rs.next()){
				Student s=new Student();
				s.setStuId(rs.getInt("stuId"));
				s.setStuName(rs.getString("stuName"));
				s.setSex(rs.getString("sex"));
				//获取日期
				String str = rs.getString("birth");
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				s.setBirth(sdf.parse(str));
				s.setCl(new Clazz(rs.getInt("clid"), null));
				return s;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			this.db.closed();
		}
		return null;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
