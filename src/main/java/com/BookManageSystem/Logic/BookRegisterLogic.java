package com.BookManageSystem.Logic;

import java.sql.SQLException;

import com.BookManageSystem.Entity.BookRegisterFieldDto;

//登録処理ロジック
public interface BookRegisterLogic {
	//登録
	public void register(BookRegisterFieldDto bookRegisterFieldDto) throws SQLException;
}
