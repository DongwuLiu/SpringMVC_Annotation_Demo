package com.dongwu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liudw
 * @date 2021/3/19 16:26
 * @effect 用于处理注册登录相关请求业务
 */
@Controller
@RequestMapping(value = "/user")
public class RegisterAndLoginController {
    private static final Log logger = LogFactory.getLog(RegisterAndLoginController.class);

    //userModel()方法由@ModelAttribute修饰，因此该方法会在userLogin()方法被调用前先自动执行，执行结束后调用userLogin()方法
    @ModelAttribute
    public void userModel(String userName, String password, Model model) {
        //方法声明中的形参定义，必须跟jsp页面中组件的定义的name属性一致才行，否则无法传递参数值，跟id属性可不一致
        logger.info("liudw:RegisterAndLoginController------userModel方法被调用");

        model.addAttribute("userName", userName);
        model.addAttribute("password", password);
    }

    @RequestMapping(value = "/login")
    public String userLogin(Model model) {
        logger.info("liudw:RegisterAndLoginController------userLogin方法被调用");

        String userName = (String)model.asMap().get("userName");
        String password = (String)model.asMap().get("password");

        if ("8888".equals(userName) && "888888".equals(password)) {
            model.addAttribute("msg", userName);

            return "home";
        } else {
            model.addAttribute("msg", "用户名或者密码错误！");
        }
        return "login";
    }
}
