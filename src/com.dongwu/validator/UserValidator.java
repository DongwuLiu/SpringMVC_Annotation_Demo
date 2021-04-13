package com.dongwu.validator;

import com.dongwu.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author liudw
 * @date 2021/4/13 10:48
 * @effect
 */
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //验证username、sex和age属性是否为空
        ValidationUtils.rejectIfEmpty(errors, "userName", null, "用户名不能为空！");
        ValidationUtils.rejectIfEmpty(errors, "sex", null, "性别不能为空！");
        ValidationUtils.rejectIfEmpty(errors, "age", null, "年龄不能为空！");
    }
}
