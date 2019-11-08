package com.hujun.bookshop_ssm.web;


import com.hujun.bookshop_ssm.entity.Book;
import com.hujun.bookshop_ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
    public class BookController {

        @Autowired
        private BookService bookService;

        //    请求url
        @RequestMapping(value = "/books")
        public ModelAndView getList(){
//        页面的名字
            ModelAndView mv = new ModelAndView("list");
//        获取数据
            List<Book> list = bookService.listAll();
            mv.addObject("book",list);
            return mv;
        }

    }

