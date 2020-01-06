package com.BookManageSystem.Dao;

import java.util.List;

import com.BookManageSystem.Entity.BookRegisterFieldDto;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

public interface BooklistDao {

	public List<BooklistDto> selAuthor(BookSearchFieldDto bookSearchFieldDto);

	public boolean upsert(BookRegisterFieldDto bookRegisterFieldDto);

}
