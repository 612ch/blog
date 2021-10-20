package com.demon.blog.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GeneratorKeyUtil
 * @Descriotion 生成分布式主键工具类
 * @Author Demon
 * @Date 2021/10/17 20:49
 **/

public class GeneratorKeyUtil {

    public GeneratorKeyUtil() {

    }
    private static GeneratorKeyUtil instance = null;
    private static DefaultKeyGenerator key = null;
    static {
        key = new DefaultKeyGenerator();
    }
    /**
     * 单例模式
     *
     * @return
     */
    public static GeneratorKeyUtil getInstance() {
        if (instance == null) {
            synchronized (GeneratorKeyUtil.class) {
                if (instance == null) {
                    instance = new GeneratorKeyUtil();
                }
            }
        }
        if(null == key){
            key = new DefaultKeyGenerator();
        }
        return instance;
    }

    /**
     * 获取分布式主键key
     * @return
     */
    public Long getKey(){
        Number orderIdKey = key.generateKey();
        try{
            Long primaryKey = orderIdKey.longValue();

            return primaryKey;
        }catch (Exception e){

        }
        return null;
    }

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println(start);
        Map<Long,Long> map = new HashMap<>();
        for(int i=0;i<1000000;i++){
            Long id = GeneratorKeyUtil.getInstance().getKey();
            map.put(id,id);
            System.out.println(id);
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(map.size());
        System.out.println(end-start);
    }
}
