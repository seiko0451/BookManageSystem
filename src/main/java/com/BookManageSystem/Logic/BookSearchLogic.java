package com.BookManageSystem.Logic;

import java.util.List;

import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

public interface BookSearchLogic {

	public List<BooklistDto> search(BookSearchFieldDto bookSearchFieldDto);
	
}
