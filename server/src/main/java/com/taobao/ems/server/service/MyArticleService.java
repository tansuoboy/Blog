package com.taobao.ems.server.service;

import com.github.pagehelper.Page;
import com.taobao.ems.model.entity.MyArticle;

import java.util.List;

public interface MyArticleService {
    int deleteByPrimaryKey(Integer id);

    int insert(MyArticle record);

    int insertSelective(MyArticle record);

    Page<MyArticle> selectAll();

    MyArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyArticle record);

    int updateByPrimaryKeyWithBLOBs(MyArticle record);

    int updateByPrimaryKey(MyArticle record);
}
