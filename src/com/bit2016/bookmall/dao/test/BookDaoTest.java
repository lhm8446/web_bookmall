package com.bit2016.bookmall.dao.test;

import com.bit2016.bookmall.dao.BookDao;
import com.bit2016.bookmall.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
		insertTest();
	}
	
	public static void insertTest(){
		BookDao dao = new BookDao();
		
		BookVo vo= new BookVo();
		
		vo.setTitle("토지");
		vo.setPrice(10000L);
		vo.setCategory_no(1L);
		
		dao.insert(vo);
	}
}
