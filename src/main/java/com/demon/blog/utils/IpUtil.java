package com.demon.blog.utils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;

/**
 * @ClassName IpUtil
 * @Descriotion
 * @Author Demon
 * @Date 2021/7/1 14:26
 **/

public class IpUtil {

    public static String getIpAddr(HttpServletRequest request) {
        if (null == request) {
            return null;
        } else {
            String ipAddress = "";

            try {
                ipAddress = request.getHeader("x-forwarded-for");
                if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                    ipAddress = request.getHeader("Proxy-Client-IP");
                }

                if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                    ipAddress = request.getHeader("WL-Proxy-Client-IP");
                }

                if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                    ipAddress = request.getRemoteAddr();
                    if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
                        InetAddress inet = null;

                        try {
                            inet = InetAddress.getLocalHost();
                        } catch (Exception var4) {
                        }

                        ipAddress = inet.getHostAddress();
                    }
                }

                if (ipAddress != null && ipAddress.length() > 15 && ipAddress.indexOf(",") > 0) {
                    ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
                }

                return ipAddress;
            } catch (Exception var5) {
                return null;
            }
        }
    }
}
