package com.dongwu.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 * @author liudw
 * @date 2021/4/17 14:15
 * @effect BASE64加解密工具类
 */
public class EncryptionAndDecryptionTools {

    /**
     *
     * BASE64 加密
     * @param key
     * @return
     *
     * */
    public static String encryptBASE64(byte[] key) {
        String encryptResult = "";
        try {
            encryptResult = (new BASE64Encoder()).encode(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("加密结果：" + encryptResult);

        return encryptResult;
    }

    /**
     *
     * BASE64 解密
     * @param key
     * @return
     *
     * */
    public static byte[] decryptBASE64(String key) {
        byte[] decryptResult = null;
        try {
            decryptResult = (new BASE64Decoder()).decodeBuffer(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("解密结果：" + decryptResult);

        return decryptResult;
    }

    /**
     *
     * MD5 加密
     * @param key
     * @return
     *
     * */
    public static String getMD5Str(String key) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        try {
            byte[] inputByte = key.getBytes();

            //获取MD5摘要算法的MessageDigest对象
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //使用指定的字节更新摘要
            messageDigest.update(inputByte);
            //获得密文
            byte[] encryptByte = messageDigest.digest();
            //把密文转换成十六进制的字符串形式
            int len = encryptByte.length;
            char[] str = new char[len * 2];
            int k = 0;
            for (int i = 0; i < len; i++) {
                byte byte0 = encryptByte[i];
                //byte0是字节类型数组元素，由8位二进制数组成，>>>是让该8位二进制数集体右移，‘4’代表移动4位，高位补0，再跟‘f’作&操作，即取高四位的值
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                //byte0是字节类型数组元素，由8位二进制数组成，0xf转为二进制为1111，运算时位数不同前置补0，因此byte0与00001111进行运算，所以是取byte0的低四位的值
                str[k++] = hexDigits[byte0 & 0xf];
            }

            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
