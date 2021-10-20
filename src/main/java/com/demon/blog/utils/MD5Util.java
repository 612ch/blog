/*
package com.demon.blog.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.util.UUID;

*/
/**
 * @ClassName MD5Util
 * @Descriotion
 * @Author Demon
 * @Date 2021/6/24 0:05
 **//*


public class MD5Util {

    */
/**
     * 获取MD5密码
     * @param password 明文密码
     * @param salt 盐
     * @return
     *//*

    public static String getMD5Password(String password,String salt){
        if(null==password||null==salt){
            return null;
        }
        ByteSource byteSalt = ByteSource.Util.bytes(salt);
        SimpleHash simpleHash = new SimpleHash("MD5",password, byteSalt, 1024);
        return simpleHash.toString();
    }
    public static String getMD5Password(String password){
        if(null==password){
            return null;
        }
        SimpleHash simpleHash = new SimpleHash("MD5",password, 1024);
        return simpleHash.toString();
    }

    public static void main(String[] args) {
        String password="123456";
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        uuid = "salt";
        ByteSource salt = ByteSource.Util.bytes(uuid);
        SimpleHash simpleHash = new SimpleHash("MD5",password, salt, 1024);
        System.out.println("salt"+uuid);
        System.out.println("pwd"+simpleHash.toString());
    }

}
*/
