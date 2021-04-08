package com.dongwu.controller;

import com.dongwu.entity.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liudw
 * @date 2021/4/7 15:26
 * @effect
 */

@Controller
@RequestMapping("/json")
public class ResponseBodyBookController {
    private static final Log logger = LogFactory.getLog(ResponseBodyBookController.class);

    @RequestMapping(value = "/testRequestBodyResponseBody")
    //@ResponseBody会将集合数据转换为json格式并将其返回客户端
    @ResponseBody
    public Object getJson() {
        logger.info("liudw:ResponseBodyBookController------getJson方法被调用");

        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1, "Spring MVC企业应用实战", "肖文吉"));
        list.add(new Book(2, "轻量级JavaEE企业应用实战", "李刚"));

        return list;
    }

    @RequestMapping(value = "/bookinfobyresponsebody")
    public String bookInfo(Model model) {
        logger.info("liudw:ResponseBodyBookController------bookInfo");

        return "responsebodyreceiveJSON";
    }
}
