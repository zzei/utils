package com.zei.happy.base;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5工具类
 */
public class Md5Utils {

    /**
     * md5加密
     * @param data
     * @return
     */
    public static String MD5(String data){

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest(data.getBytes("UTF-8"));
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest){
                stringBuilder.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1,3));
            }
            return stringBuilder.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

}
