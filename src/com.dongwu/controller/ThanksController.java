package com.dongwu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liudw
 * @date 2021/3/18 16:51
 * @effect
 */
@Controller
@RequestMapping(value = "/user")
public class ThanksController {
    private static final Log logger = LogFactory.getLog(ThanksController.class);

    @RequestMapping(value = "/thanks")
    public String thanks(Model model) {
        logger.info("liudw:ThanksController------thanks被调用（通过拼接jsp地址方式）");
        model.addAttribute("message", "I'm fine! Thank you!");

        return "thanks";
    }

    @RequestMapping(value = "/thankyou")
    public String thankYou(Model model) {
        logger.info("liudw:ThanksController------thankYou被调用（通过拼接jsp地址方式）");
        model.addAttribute("msgs", "Thank you very much!");

        return "thanks";
    }
}
