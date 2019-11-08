package com.hujun.bookshop_ssm.dao;

import com.hujun.bookshop_ssm.entity.Book;

import java.util.List;

public interface IBookDao {
    List<Book> listAll();
}
