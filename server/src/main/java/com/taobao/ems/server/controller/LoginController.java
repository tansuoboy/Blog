package com.taobao.ems.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taobao.ems.model.entity.MyArticle;
import com.taobao.ems.server.request.LoginRequest;
import com.taobao.ems.server.service.MyArticleService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;



@RequestMapping("/")
@Controller
public class LoginController {

    private final Logger logger = Logger.getLogger(this.getClass());
    /**
     * 跳转登录
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login() {
        return "login";
    }

    /**
     * 登陆校验
     * @return
     */
    @RequestMapping(value = "/login/up", method = RequestMethod.POST)
    public Object loginUp(LoginRequest loginRequest, Model model){
        String obj = "/login";
        try {
            //System.out.println(loginRequest);
            if ("123".equals(loginRequest.getPassword()) && "admin".equals(loginRequest.getUsername())) {
                obj = "/manager";

            } else {
                model.addAttribute("info","用户名或密码错误");
            }
        } catch (Exception e) {
            logger.error("登陆校验出错",e);
        }
        return obj;
    }


}
