package com.BookManageSystem.Entity;

//登録画面出力DTO
public class BookResultFieldDto{

	String BookName;         //タイトル
	String AuthorName;       //著者名   //今回は正規化していない
	String GenreName;        //ジャンル //今回は正規化していない
	String PublisherName;    //出版社   //今回は正規化していない
	String Memo;             //メモ

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
	
}