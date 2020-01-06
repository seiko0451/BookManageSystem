package com.BookManageSystem.Dao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.BookManageSystem.Entity.BookRegisterFieldDto;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;

class BooklistDaoImplTest {

	private BooklistDaoImpl booklistDaoImpl = new BooklistDaoImpl();
	
	//検索処理レスポンスチェック
	@Test
	void selAuthorTest() throws SQLException {
		BooklistDto booklistDto = new BooklistDto();
        booklistDto.setAuthorName("清宮佑太");
        booklistDto.setBookName("サッカー練習法");
        booklistDto.setGenreName("スポーツ");
        booklistDto.setPublisherName("清宮社");
        booklistDto.setMemo("在庫不明");

        BooklistDto booklistDto2 = new BooklistDto();
        booklistDto2.setAuthorName("清宮佑太");
        booklistDto2.setBookName("フットサル上達メソッド");
        booklistDto2.setPublisherName("佑太社");

		BookSearchFieldDto bookSearchFieldDto = new BookSearchFieldDto();
		
        assertThat(booklistDto,is(samePropertyValuesAs(booklistDaoImpl.selAuthor(bookSearchFieldDto).get(0))));
        assertThat(booklistDto2,is(samePropertyValuesAs(booklistDaoImpl.selAuthor(bookSearchFieldDto).get(1))));
	}

	//登録処理レスポンスチェック
	@Test
	void upsertTest() throws SQLException {
		BookRegisterFieldDto bookRegisterFieldDto = new BookRegisterFieldDto();

		assertFalse(booklistDaoImpl.upsert(bookRegisterFieldDto));
	}
}
