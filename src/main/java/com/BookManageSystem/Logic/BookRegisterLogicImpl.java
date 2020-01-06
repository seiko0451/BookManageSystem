package com.BookManageSystem.Logic;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.BookManageSystem.Dao.BooklistDao;
import com.BookManageSystem.Entity.BookRegisterFieldDto;

//登録処理ロジック（実装クラス）
@Component("BookRegisterLogicImpl")
public class BookRegisterLogicImpl implements BookRegisterLogic {

	@Autowired
	@Qualifier("BooklistDaoImpl")
    BooklistDao booklistDao;
	
    @Override
    public void register(BookRegisterFieldDto bookRegisterFieldDto) throws SQLException{

        Boolean isError;
        try {
            isError = booklistDao.upsert(bookRegisterFieldDto);
        }catch(SQLException e){
        	throw new SQLException();
        }       
        if(isError) {
        	throw new SQLException();
        }
    }
}