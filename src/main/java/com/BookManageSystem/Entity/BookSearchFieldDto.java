package com.BookManageSystem.Entity;

//検索画面入力DTO
public class BookSearchFieldDto{

	String AuthorName;       //著者名   //今回は正規化していない

	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
}