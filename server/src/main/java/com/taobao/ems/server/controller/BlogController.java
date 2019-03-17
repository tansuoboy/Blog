package com.taobao.ems.server.controller;

import com.taobao.ems.model.entity.MyArticle;
import com.taobao.ems.server.request.ArticleRequest;
import com.taobao.ems.server.service.MyArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Blog控制
 * @since 2019.03.10
 * @author Mr.Xu
 */
@RequestMapping("/")
@Controller
public class BlogController {
    //注入Sevice
    @Resource
    MyArticleService myArticleService;

    /**
     * 添加信息
     */
    @RequestMapping(value = "/blog",method = RequestMethod.POST)
    public String  insertMyArticle(ArticleRequest articleRequest){
        MyArticle myArticle = new MyArticle();
        BeanUtils.copyProperties(articleRequest,myArticle);
        //调用添加博客的service
        myArticleService.insert(myArticle);
        System.out.println(myArticle);
        return "blog";
    }



}
