package com.zei.happy.base;

import java.util.UUID;

/**
 * 获取uuid
 */
public class UUIDUtils {

    //长度32位
    private static final int LENGTH = 32;

    /**
     * 获取32位长度的uuid
     * @return
     */
    public static String createUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, LENGTH);
        return uuid;
    }

    /**
     * 获取指定长度的uuid
     * @param length
     * @return
     */
    public static String createUUID(int length){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, length);
        return uuid;
    }

}
