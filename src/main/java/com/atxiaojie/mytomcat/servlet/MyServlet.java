package com.atxiaojie.mytomcat.servlet;

import com.atxiaojie.mytomcat.utils.HttpUtil;

/**
 * @ClassName: MyServlet
 * @Description: MyServlet实现类
 * @author: zhouxiaojie
 * @date: 2021/11/6 0:12
 * @Version: V1.0.0
 */
public class MyServlet extends Servlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) {
        String content = "<h1>this my request GET</h1";
        response.write(HttpUtil.getHttpResponseContext200(content));
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) {
        String content = "<h1>this my request POST</h1";
        response.write(HttpUtil.getHttpResponseContext200(content));
    }
}
