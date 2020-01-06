package com.BookManageSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BookManageSystem.Entity.BookRegisterFieldDto;
import com.BookManageSystem.Entity.BookSearchFieldDto;
import com.BookManageSystem.Entity.BooklistDto;
import com.BookManageSystem.Logic.BookRegisterLogic;
import com.BookManageSystem.Logic.BookSearchLogic;

@Controller
public class BookMngController {

	//検索ロジック
	@Autowired
    @Qualifier("BookSearchLogicImpl")
	BookSearchLogic bookSearchLogic;

    //登録ロジック
    @Autowired
    @Qualifier("BookRegisterLogicImpl")
	BookRegisterLogic bookRegisterLogic;

    //メニュー画面
    @RequestMapping("/menu.html")
    public String Menu() {
        return "menu.html";
    }
    
    //検索画面
    @RequestMapping("/seach.html")
    public String Search() {
        return "seach.html";
    }
    
    //検索処理    
    @RequestMapping("/seachAction.html")
    public String SeachAction(@ModelAttribute BookSearchFieldDto bookSearchFieldDto,Model model) {

    	List<BooklistDto> booklistDtoList;
    	try {
    	    booklistDtoList = bookSearchLogic.search(bookSearchFieldDto);
        }catch(Exception e){
        	model.addAttribute("message","検索に失敗しました");
        	return "seach.html";
        }
    	model.addAttribute("booklistDtoList",booklistDtoList);
    	return "result.html";
    }
    
    //登録画面
    @RequestMapping("/register.html")
    public String Register() {
        return "register.html";
    }

    //登録処理
    //今回はバリデーションは実装しない
    @RequestMapping("/registerAction.html")
    public String ReqisterAction(@ModelAttribute BookRegisterFieldDto bookRegisterFieldDto,Model model) {
        try {
            bookRegisterLogic.register(bookRegisterFieldDto);
        }catch(Exception e) {
            model.addAttribute("message","登録に失敗しました");	
}
        model.addAttribute("message","登録が完了しました");

        return "register.html";
    }
}