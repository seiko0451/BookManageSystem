package com.BookManageSystem.Logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.BookManageSystem.Dao.BooklistDao;
import com.BookManageSystem.Entity.BookRegisterFieldDto;

@Component("BookRegisterLogicImpl")
public class BookRegisterLogicImpl implements BookRegisterLogic {

	//BOOKlISTテーブル用DAO
	@Autowired
	@Qualifier("BooklistDaoImpl")
    BooklistDao booklistDao;
	
    @Override
    public void register(BookRegisterFieldDto bookRegisterFieldDto){

        Boolean isError = booklistDao.upsert(bookRegisterFieldDto);

        if(isError) {
        	System.out.println("登録処理に失敗しました");
        }
    }
}