package com.dongwu.controller;

import com.dongwu.entity.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author liudw
 * @date 2021/3/25 10:43
 * @effect
 */
@Controller
@RequestMapping(value = "/json")
public class BookController {
    private static final Log logger = LogFactory.getLog(BookController.class);

    //@RequestBody根据json数据，转换成对应的Object
    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book,
                        HttpServletResponse response) throws Exception {
        logger.info("liudw:BookController------setJson方法被调用");
        //ObjectMapper类是Jackson库的主要类。它提供一些功能将Java对象转换成对应的JSON格式数据
        ObjectMapper mapper = new ObjectMapper();

        //将book对象转换成json输出
        logger.info(mapper.writeValueAsString(book));
        book.setAuthor("独孤修");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转换成json写出到客户端
        response.getWriter().println(mapper.writeValueAsString(book));
    }

    @RequestMapping(value = "/bookinfo")
    public String bookInfo(Model model) {
        logger.info("liudw:BookController------bookInfo方法被调用");

        return "receiveJSON";
    }
}
