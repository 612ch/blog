package com.demon.blog.utils;


import java.util.regex.Pattern;

/**
 * @ClassName ChickUtil
 * @Descriotion 检查工具类
 * @Author Demon
 * @Date 2021/2/2 23:08
 **/

public class CheckUtil {

    /**
     * 检查是否为空
     *
     * @param str String
     * @return boolean
     */
    public static boolean isNull(String... str) {
        boolean flog = false;
        try {
            if (null == str) {
                flog = true;
            }
            for (String text : str) {
                if (null == text || "".equals(text) || "null".equals(text) || "NULL".equals(text)
                        || "" == text || "" == text.trim() || "".equals(text.trim())) {
                    flog = true;
                    break;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return flog;
    }

    /**
     * 检查是否为有效URL
     * @param url url
     * @return boolean
     */
    public static boolean isUrl(String url){
        Pattern pattern = Pattern.compile("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+$");
        return pattern.matcher(url).matches();
    }

}
