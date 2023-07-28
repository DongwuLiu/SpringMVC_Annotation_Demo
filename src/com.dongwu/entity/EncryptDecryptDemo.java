package com.dongwu.entity;

import com.dongwu.utils.EncryptionAndDecryptionTools;

/**
 * @author liudw
 * @date 2021/4/17 14:25
 * @effect
 */
public class EncryptDecryptDemo {

    public void test() {
        String str = "Hello world!";
        String encryptResult = EncryptionAndDecryptionTools.encryptBASE64(str.getBytes());

        byte[] decryptResult = EncryptionAndDecryptionTools.decryptBASE64(encryptResult);

        System.out.println(str + "的加密结果是：" + encryptResult + ", 解密结果是：" + new String(decryptResult));
    }

    public static void main(String[] args) {
//        EncryptDecryptDemo demo = new EncryptDecryptDemo();
//        demo.test();
        System.out.println(EncryptionAndDecryptionTools.getMD5Str("admin"));
    }
}
