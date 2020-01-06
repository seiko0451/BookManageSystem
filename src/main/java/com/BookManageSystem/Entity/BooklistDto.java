package com.BookManageSystem.Entity;

import java.util.Date;

//BOOKLISTテーブルDTO
public class BooklistDto {
	String Id;               //ID
	String BookName;         //タイトル
	String AuthorName;       //著者名   //今回は正規化していない
	String GenreName;        //ジャンル //今回は正規化していない
	String PublisherName;    //出版社   //今回は正規化していない
	String Memo;             //メモ
	String DelFlg;           //削除フラグ
	Date RegDate;            //登録日
	Date UpdDate;            //更新日
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	
	public String getGenreName() {
		return GenreName;
	}
	public void setGenreName(String genreName) {
		GenreName = genreName;
	}
	
	public String getPublisherName() {
		return PublisherName;
	}
	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}
	
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String memo) {
		Memo = memo;
	}
	
	public String getDelFlg() {
		return DelFlg;
	}
	public void setDelFlg(String delFlg) {
		DelFlg = delFlg;
	}
	
	public Date getRegDate() {
		return RegDate;
	}
	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}
	
	public Date getUpdDate() {
		return UpdDate;
	}
	public void setUpdDate(Date updDate) {
		UpdDate = updDate;
	}

}