package com.BookManageSystem.Dao;

import java.sql.SQLException;
import java.util.List;

import com.BookManageSystem.Entity.BookRegisterFieldDto;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

//BOOKLISTテーブル用DAO
public interface BooklistDao {

    //検索（著者名）
	public List<BooklistDto> selAuthor(BookSearchFieldDto bookSearchFieldDto) throws SQLException;

    //登録
	public boolean upsert(BookRegisterFieldDto bookRegisterFieldDto) throws SQLException;

}
