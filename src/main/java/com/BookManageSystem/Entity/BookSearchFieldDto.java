package com.BookManageSystem.Entity;

public class BookSearchFieldDto{

	String AuthorName;       //著者名   //今回は正規化していない

	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
}