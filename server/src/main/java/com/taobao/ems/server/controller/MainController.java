package com.taobao.ems.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taobao.ems.model.entity.MyArticle;
import com.taobao.ems.server.request.ArticleRequest;
import com.taobao.ems.server.service.MyArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 主页控制
 * @since 2019.03.10
 * @author Mr.Xu
 */
@RequestMapping("/")
@Controller
public class MainController {
    //注入Sevice
    @Resource
    MyArticleService myArticleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object root(){

        return "redirect:/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "pageSize",defaultValue = "3") int pageSize, Model model){
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<MyArticle> pageInfo = new PageInfo<>(myArticleService.selectAll());
        //MyArticle myArticle = myArticleService.selectByPrimaryKey(4);
        model.addAttribute("myArticle",pageInfo);
        //System.out.println(pageInfo);
        return "index";
    }

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public Object login(@PathVariable int id, Model model){
        MyArticle myArticle = myArticleService.selectByPrimaryKey(id);
        //System.out.println(myArticle);
        model.addAttribute("myArticle",myArticle);
        return "read";
    }



    @RequestMapping(value = "/login-error", method = RequestMethod.GET)
    public Object loginError(Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，用户名或密码错误");
        return "login";

    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public Object register(){
        return "write";
    }


}
