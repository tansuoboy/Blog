package com.taobao.ems.model.mapper;

import com.github.pagehelper.Page;
import com.taobao.ems.model.entity.MyArticle;

import java.util.List;

public interface MyArticleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MyArticle record);

    MyArticle selectByPrimaryKey(Integer id);

    Page<MyArticle> selectAll();

    int updateByPrimaryKeySelective(MyArticle record);

    int updateByPrimaryKeyWithBLOBs(MyArticle record);

    int updateByPrimaryKey(MyArticle record);
}