package com.family.utils;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 创建时间:2019年6月17日10:41:00 创建者 :ajie 用于Base64解码和编码
 */
@Slf4j
public class Base64Utils {

    //private static Logger log = LoggerFactory.getLogger(Base64Utils.class);

    public static void main(String[] args) {
        String admin = Base64Utils.encode("admin");

        log.info(admin);
    }

    /**
     * Base64加密
     *
     * @param str
     * @return
     */
    public static String encode(String str) {

        byte[] b = null;
        String s = null;

        try {
            b = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            log.error("Base64加密失败！失败原因：{}, {}", e.getMessage(), e);
        }

        if(b != null){
            s = new BASE64Encoder().encode(b);
        }

        return s;
    }

    /**
     * Base64解密
     * @param str
     * @return
     */
    public static String decode(String str){

        byte[] bt = null;

        BASE64Decoder decoder = new BASE64Decoder();

        try {
            bt = decoder.decodeBuffer(str);
        } catch (IOException e) {

            log.error("Base64解密失败！失败原因：{}, {}", e.getMessage(), e);
        }

        return new String(bt);

    }
}