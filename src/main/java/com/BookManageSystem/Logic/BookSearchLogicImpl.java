package com.BookManageSystem.Logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.BookManageSystem.Dao.BooklistDao;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

@Component("BookSearchLogicImpl")
public class BookSearchLogicImpl implements BookSearchLogic {

	//BOOKlISTテーブル用DAO
	@Autowired
	@Qualifier("BooklistDaoImpl")
    BooklistDao booklistDao;

	@Override
    public List<BooklistDto> search(BookSearchFieldDto bookSearchFieldDto){

    	return booklistDao.selAuthor(bookSearchFieldDto);
    }
}
