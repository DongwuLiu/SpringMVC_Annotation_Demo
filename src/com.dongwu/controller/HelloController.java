package com.dongwu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liudw
 * @date 2021/3/18 10:27
 * @effect HelloController是一个实现Controller接口的控制器，可以处理一个单一的请求动作
 */

/**
 *
 * HelloController是一个基于注解的控制器
 * 可以同时处理多个请求动作，并且无需实现任何接口
 * org.springframework.stereotype.Controller注解用于指示该类时一个控制器
 *
 * */
@Controller
@RequestMapping(value = "/user")
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping(value = "/hello")
    public String helloWorld(Model model) {
        logger.info("liudw:HelloController------helloWorld被调用（通过拼接jsp地址方式）");
        //添加返回给页面的信息
        model.addAttribute("message", "Hello world! Hello dongwu!");
        model.addAttribute("msg", "hello everybody!");

        //返回将要跳转的页面名称，结合springmvc-config.xml中的视图解析器中的前缀、后缀配置，最后会拼接成“/WEB-INF/content/jsp-page/welcome.jsp”
        return "welcome";
    }

    @RequestMapping(value = "/hi")
    public String hiWorld(Model model) {
        logger.info("liudw:HelloController------hiWorld被调用（通过拼接jsp地址方式）");
        model.addAttribute("message", "hi world!");

        return "world";
    }
}
