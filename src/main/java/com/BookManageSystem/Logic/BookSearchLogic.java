package com.BookManageSystem.Logic;

import java.sql.SQLException;
import java.util.List;

import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

//検索処理ロジック
public interface BookSearchLogic {
    //検索
	public List<BooklistDto> search(BookSearchFieldDto bookSearchFieldDto) throws SQLException;
}
