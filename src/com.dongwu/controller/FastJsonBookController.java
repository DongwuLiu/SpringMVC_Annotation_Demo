package com.dongwu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongwu.entity.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author liudw
 * @date 2021/4/7 10:08
 * @effect
 */
@Controller
@RequestMapping(value = "/json")
public class FastJsonBookController {
    private static final Log logger = LogFactory.getLog(FastJsonBookController.class);

    @RequestMapping(value = "/testRequestBodyFastjson")
    public void setJson(@RequestBody Book book,
                        HttpServletResponse response) throws Exception {
        logger.info("liudw:FastJsonBookController------setJson方法被调用");
        //JSONObject-lib包是一个beans,collections,maps,java arrays和xml和JSON互相转换的包
        //使用JSONObject将book对象转换成json输出
        logger.info(JSONObject.toJSONString(book));
        book.setAuthor("艾尔莎·史卡蕾特");
        book.setName("《妖精的尾巴》");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转换成json写出客户端
        response.getWriter().println(JSONObject.toJSONString(book));
    }

    @RequestMapping(value = "/bookinfobyfastjson")
    public String bookInfo(Model model) {
        logger.info("liudw:FastJsonBookController------bookInfo方法被调用");

        return "fastjsonreceiveJSON";
    }
}
