package com.dongwu.controller;

import com.dongwu.entity.XMLBook;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

/**
 * @author liudw
 * @date 2021/4/8 10:52
 * @effect
 */

@Controller
public class XMLBookController {
    private static final Log logger = LogFactory.getLog(XMLBookController.class);

    //@RequestBody XMLBook book: 将界面传递过来的xml数据自动绑定到book对象中
    @RequestMapping(value = "/sendxml", method = RequestMethod.POST)
    public void sendXml(@RequestBody XMLBook book) {
        logger.info("liudw:XMLBookController------sendXml方法被调用");

        logger.info("接收前端XML数据成功：" + book);
    }

    //@ResponseBody会将Book自动转成XML数据返回
    @RequestMapping(value = "/getxml", method = RequestMethod.POST)
    public @ResponseBody XMLBook getXml() throws Exception {
        logger.info("liudw:XMLBookController------getXml方法被调用");

        //通过JAXBContext的newInstance方法，传递一个class就可以获得一个上下文
        JAXBContext context = JAXBContext.newInstance(XMLBook.class);
        //创建一个Unmarshall对象
        Unmarshaller unmar = context.createUnmarshaller();
        InputStream is = this.getClass().getResourceAsStream("/../bookinfo.xml");
        //Unmarshall对象的unmarshal方法可以进行xml到Java对象的转换
        XMLBook book = (XMLBook)unmar.unmarshal(is);
        logger.info(book);
        return book;
    }

    @RequestMapping(value = "/xmlbookinfo")
    public String jumpXMLBookInfo(Model model) {
        logger.info("liudw:XMLBookController------jumpXMLBookInfo方法被调用");

        return "sendandgetXml";
    }
}
