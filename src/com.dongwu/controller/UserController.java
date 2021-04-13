package com.dongwu.controller;

import com.dongwu.entity.Attitude;
import com.dongwu.entity.Dept;
import com.dongwu.entity.Probability;
import com.dongwu.entity.User;
import com.dongwu.validator.UserValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liudw
 * @date 2021/4/8 16:43
 * @effect
 */

@Controller
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm(Model model) {
        logger.info("liudw:UserController------registerForm方法被调用");

        //课程表单要选择的值
        List<String> courses = new ArrayList<String>();
        courses.add("JAVAEE");
        courses.add("Spring");
        //爱好表单要选择的值
        List<String> hobby = new ArrayList<String>();
        hobby.add("football");
        hobby.add("baseball");
        //学历表单要选择的值
        List<String> education = new ArrayList<String>();
        education.add("1");
        education.add("3");
        //职位表单要选择的值
        List<Dept> depts = new ArrayList<Dept>();
        depts.add(new Dept(1,"开发部"));
        depts.add(new Dept(3, "财务部"));
        //态度表单要选择的值
        List<Attitude> attitudes = new ArrayList<Attitude>();
        attitudes.add(new Attitude("disagree", "不同意"));

        User user = new User("jack", "女", 23, "jack1230", "Greet everyday with love in my heart.", "逆风的方向，更适合飞翔；我不怕万人阻挡，只怕自己投降！", courses, true, hobby, education, depts, "错", "small", attitudes);        //model中添加JavaBean对象，默认的属性为command，值是user对象；
        //也可以自定义其他名称（如regs），form表单中也通过modelAttribute或commandName属性指定该名称即可
        model.addAttribute("regs", user);

        //界面上爱好表单可供选择的值
        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("football");
        hobbyList.add("basketball");
        hobbyList.add("baseball");
        model.addAttribute("hobbyList", hobbyList);

        //界面上学位表单可供选择的值
        Map<String, String> educationMap = new HashMap<String, String>();
        educationMap.put("1", "学士");
        educationMap.put("2", "硕士");
        educationMap.put("3", "博士");
        model.addAttribute("educationMap", educationMap);

        //界面上职位表单可供选择的值
        List<Dept> deptList = new ArrayList<Dept>();
        deptList.add(new Dept(1, "开发部"));
        deptList.add(new Dept(2, "销售部"));
        deptList.add(new Dept(3, "财务部"));
        model.addAttribute("deptList", deptList);

        //界面上结果表单可供选择的值
        List<String> resultList = new ArrayList<String>();
        resultList.add("对");
        resultList.add("错");
        model.addAttribute("resultList", resultList);

        //界面上大小表单可供选择的值
        Map<String, String> sizeMap = new HashMap<String, String>();
        sizeMap.put("big", "大");
        sizeMap.put("small", "小");
        model.addAttribute("sizeMap", sizeMap);

        //界面上态度表单可供选择的值
        List<Attitude> attitudeList = new ArrayList<Attitude>();
        attitudeList.add(new Attitude("agree", "同意"));
        attitudeList.add(new Attitude("disagree", "不同意"));
        model.addAttribute("attitudeList", attitudeList);

        logger.info(user);

        return "registerForm";
    }

    @RequestMapping(value = "/labelForm", method = RequestMethod.GET)
    public String labelForm(Model model) {
        logger.info("liudw:UserController------labelForm方法被调用");

        User user = new User();

        user.setColor("蓝");
        user.setProbabilityId("impossible");
        user.setMotion("baseball");

        model.addAttribute("formlable", user);

        List<String> colorList = new ArrayList<String>();
        colorList.add("红");
        colorList.add("绿");
        colorList.add("蓝");
        model.addAttribute("colorList", colorList);

        List<Probability> probabilityList = new ArrayList<Probability>();
        probabilityList.add(new Probability("不可能", "impossible"));
        probabilityList.add(new Probability("可能", "possible"));
        probabilityList.add(new Probability("一定", "must"));
        model.addAttribute("probabilityList", probabilityList);

        Map<String, String> motionMap = new HashMap<String, String>();
        motionMap.put("football", "足球");
        motionMap.put("basketball", "篮球");
        motionMap.put("baseball", "棒球");
        model.addAttribute("motionMap", motionMap);

        return "labelform";
    }

    @InitBinder
    public void initBinder(DataBinder binder) {
        logger.info("liudw:UserController------initBinder方法被调用");

        //设置验证的类为UserValidator
        binder.setValidator(new UserValidator());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Validated User user, Errors errors, Model model) {
        logger.info("liudw:UserController------register方法被调用");

        //如果Errors对象有Field错误时，重新跳回注册页面，否则正常提交
        if (errors.hasFieldErrors()) {
            model.addAttribute("formlable", user);
            return "labelform";
        }
        return "submit";
    }
}
