package com.BookManageSystem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.BookManageSystem.Entity.BookRegisterFieldDto;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

//BOOKLISTテーブル用DAO（実装クラス）
@Component("BooklistDaoImpl")
public class BooklistDaoImpl implements BooklistDao{

    @Override
    public List<BooklistDto> selAuthor(BookSearchFieldDto bookSearchFieldDto) throws SQLException{

    	//検索結果保持リスト
        List<BooklistDto> booklistDtoList = new ArrayList<BooklistDto>();

        //本来はこのあたりで検索条件をセットしてDBアクセス

        //今回はDBからselectしたつもりで固定の値を入れる
        BooklistDto booklistDto = new BooklistDto();
        booklistDto.setAuthorName("清宮佑太");
        booklistDto.setBookName("サッカー練習法");
        booklistDto.setGenreName("スポーツ");
        booklistDto.setPublisherName("清宮社");
        booklistDto.setMemo("在庫不明");
        booklistDtoList.add(booklistDto);
        BooklistDto booklistDto2 = new BooklistDto();
        booklistDto2.setAuthorName("清宮佑太");
        booklistDto2.setBookName("フットサル上達メソッド");
        booklistDto2.setPublisherName("佑太社");
        booklistDtoList.add(booklistDto2);

        return booklistDtoList;
    }

    @Override
    public boolean upsert(BookRegisterFieldDto bookRegisterFieldDto) throws SQLException{

        //本来はこのあたりで検索条件をセットしてDBアクセス
    	
    	//今回はupsertしたつもりで固定の値を返す
        boolean isError = false;
        
        return isError;
    }
}