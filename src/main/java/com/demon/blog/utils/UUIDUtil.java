package com.demon.blog.utils;

import java.util.UUID;

/**
 * @ClassName UUIDUtil
 * @Descriotion UUID工具类
 * @Author Demon
 * @Date 2021/6/17 23:44
 **/

public class UUIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
