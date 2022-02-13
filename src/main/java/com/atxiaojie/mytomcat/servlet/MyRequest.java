package com.atxiaojie.mytomcat.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MyRequest
 * @Description: 自定义request
 * @author: zhouxiaojie
 * @date: 2021/11/5 23:00
 * @Version: V1.0.0
 */
public class MyRequest {

    private String url;
    private String method;
    private InputStream inputStream;
    private Map<String, Object> param;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }

    public MyRequest(InputStream inputStream) throws IOException {
        this.inputStream = inputStream;
        int count = 0;
        while (count == 0){
            count = inputStream.available();
        }
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
        extractFileds(new String(bytes));
    }

    private void extractFileds(String content){
        if (content == null || "".equals(content)) {
            System.out.println("content is empty");
        }else{
            String firstLine = content.split("\\n")[0];
            String[] split = firstLine.split("\\s");
            String urlAndParam = split[1];
            String[] urlParam = urlAndParam.split("\\?");
            String paramStr = urlParam[1];
            String[] param = paramStr.split("\\&");
            Map<String, Object> map = new HashMap<String, Object>();
            for(String p : param){
                String[] keyValue = p.split("\\=");
                String key = keyValue[0];
                String value = keyValue[1];
                map.put(key,value);
            }
            setParam(map);
            setUrl(urlParam[0]);
            setMethod(split[0]);
        }
    }



}
