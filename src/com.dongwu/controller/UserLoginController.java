package com.dongwu.controller;

import com.dongwu.entity.UserLogin;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author liudw
 * @date 2021/4/15 9:16
 * @effect
 */
@Controller
public class UserLoginController {
    private static final Log logger = LogFactory.getLog(UserLoginController.class);
    private String formName = "";

    //SessionLocaleResolver处理方式
//    @RequestMapping(value = "/{formName}")
//    public String loginForm(@PathVariable String formName, String request_locale, Model model, HttpServletRequest request) {
//        logger.info("liudw:UserLoginController------loginForm方法被调用");
//        logger.info("liudw:UserLoginController------request_locale = " + request_locale);
//        this.formName = formName;
//
//        if (request_locale != null) {
//            //设置中文环境
//            if (request_locale.equals("zh_CN")) {
//                Locale locale = new Locale("zh", "CN");
//                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
//            } else if (request_locale.equals("en_US")) {    //设置英文环境
//                Locale locale = new Locale("en", "US");
//                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
//            } else {    //使用之前的语言环境
//                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());
//            }
//        }
//
//        UserLogin userLogin = new UserLogin();
//        model.addAttribute("nationalMsg", userLogin);
//
//        return formName;
//    }

    //CookieLocaleResolver处理方式
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName, String request_locale, Model model, HttpServletRequest request, HttpServletResponse response) {
        logger.info("liudw:UserLoginController------loginForm方法被调用");
        logger.info("liudw:UserLoginController------request_locale = " + request_locale);
        this.formName = formName;

        if (request_locale != null) {
            //设置中文环境
            if (request_locale.equals("zh_CN")) {
                Locale locale = new Locale("zh", "CN");
                (new CookieLocaleResolver()).setLocale(request, response, locale);
            } else if (request_locale.equals("en_US")) {    //设置英文环境
                Locale locale = new Locale("en", "US");
                (new CookieLocaleResolver()).setLocale(request, response, locale);
            } else {    //使用之前的语言环境
                (new CookieLocaleResolver()).setLocale(request, response, LocaleContextHolder.getLocale());
            }
        }

        UserLogin userLogin = new UserLogin();
        model.addAttribute("nationalMsg", userLogin);

        return formName;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute @Validated UserLogin userLogin, Model model, HttpServletRequest request) {
        model.addAttribute("nationalMsg", userLogin);

        //如果登录名是liudw，密码是ldw1230，则验证通过
        if (userLogin.getLoginname() != null && userLogin.getLoginname().equals("liudw")
                &&userLogin.getPassword() != null && userLogin.getPassword().equals("ldw1230")) {
            //从后台代码获取国际化信息username
            RequestContext requestContext = new RequestContext(request);
            String userName = requestContext.getMessage("username");
            //将获取的username信息设置到UserLogin对象，并设置到Model当中
            userLogin.setUsername(userName);

            return "success";
        }

        return formName;
    }
}
