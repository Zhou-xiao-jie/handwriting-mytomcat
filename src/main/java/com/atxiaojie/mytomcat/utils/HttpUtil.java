package com.atxiaojie.mytomcat.utils;

/**
 * @ClassName: HttpUtil
 * @Description: 封装请求头
 * @author: zhouxiaojie
 * @date: 2021/11/5 22:31
 * @Version: V1.0.0
 */
public class HttpUtil {

    public static String getHttpResponseContext(int code, String content, String errorMsa){
        if(code == 200){
            return "HTTP/1.1 200 OK \n"+
                    "Content-Type: text/html\n" +
                    "\r\n" + content;
        }else if(code == 500){
            return "HTTP/1.1 500 Internal Error ="+ errorMsa + " \n" +
                    "Content-Type: text/html\n" +
                    "\r\n";
        }
        return "HTTP/1.1 404 NOT Found \n"+
                "Content-Type: text/html\n" +
                "\r\n" +
                "<h1>404 not found</h1>";
    }

    public static String getHttpResponseContext200(String content){
        return "HTTP/1.1 200 OK \n"+
                "Content-Type: text/html\n" +
                "\r\n" + content;
    }

    public static String getHttpResponseContext500(){
        return "HTTP/1.1 500 Internal Error =" + " \n" +
                "Content-Type: text/html\n" +
                "\r\n";
    }

    public static String getHttpResponseContext404(){
        return "HTTP/1.1 404 NOT Found \n"+
                "Content-Type: text/html\n" +
                "\r\n" +
                "<h1>404 not found</h1>";
    }
}
