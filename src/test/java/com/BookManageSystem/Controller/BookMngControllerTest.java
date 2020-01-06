package com.BookManageSystem.Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class BookMngControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
    private BookMngController bookMngController;

	//メニュー画面レスポンスチェック
	@Test
	public void menuTest() throws Exception{

	    mockMvc = MockMvcBuilders.standaloneSetup(bookMngController).build();
		mockMvc.perform(get("/menu"))
		.andExpect(status().isOk())
		.andExpect(view().name("menu.html"));
	}	
	
	//検索画面レスポンスチェック
	@Test
	public void seachTest() throws Exception{

	    mockMvc = MockMvcBuilders.standaloneSetup(bookMngController).build();		
		mockMvc.perform(get("/seach"))
		.andExpect(status().isOk())
		.andExpect(view().name("seach.html"));
	}
	
	//結果画面レスポンスチェック
	@Test
	public void seachActionTest() throws Exception{

	    mockMvc = MockMvcBuilders.standaloneSetup(bookMngController).build();		
		mockMvc.perform(get("/seachAction"))
		.andExpect(status().isOk())
		.andExpect(view().name("result.html"));
	}

	//登録画面レスポンスチェック
	@Test
	public void registerTest() throws Exception{
		
	    mockMvc = MockMvcBuilders.standaloneSetup(bookMngController).build();		
		mockMvc.perform(get("/register"))
		.andExpect(status().isOk())
		.andExpect(view().name("register.html"));
	}

	//登録画面（結果）レスポンスチェック
	@Test
	public void registerActionTest() throws Exception{
		
	    mockMvc = MockMvcBuilders.standaloneSetup(bookMngController).build();		
		mockMvc.perform(get("/registerAction"))
		.andExpect(status().isOk())
		.andExpect(view().name("register.html"));
	}
}
