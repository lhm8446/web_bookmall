package com.bit2016.bookmall.dao.test;

import com.bit2016.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		insertTest();
	}
	
	public static void insertTest(){
		CategoryDao dao = new CategoryDao();
		
		CategoryVo vo= new CategoryVo();
		
		vo.setNo(1L);
		vo.setName("컴퓨터/IT");
		
		dao.insert(vo);
	}
}
