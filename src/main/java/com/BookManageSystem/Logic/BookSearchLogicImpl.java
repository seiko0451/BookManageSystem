package com.BookManageSystem.Logic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.BookManageSystem.Dao.BooklistDao;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

//検索処理ロジック（実装クラス）
@Component("BookSearchLogicImpl")
public class BookSearchLogicImpl implements BookSearchLogic {

	@Autowired
	@Qualifier("BooklistDaoImpl")
    BooklistDao booklistDao;

	@Override
    public List<BooklistDto> search(BookSearchFieldDto bookSearchFieldDto) throws SQLException{

		List<BooklistDto> booklistDtoList = new ArrayList<BooklistDto>();		
		try {
		    booklistDtoList = booklistDao.selAuthor(bookSearchFieldDto);	
		}catch(SQLException e) {
			throw new SQLException();
		}
		return booklistDtoList;
    }
}
