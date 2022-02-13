package com.atxiaojie.mytomcat.servlet;

import com.atxiaojie.mytomcat.utils.FileUtil;
import com.atxiaojie.mytomcat.utils.HttpUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName: MyResponse
 * @Description: 自定义Response
 * @author: zhouxiaojie
 * @date: 2021/11/5 23:13
 * @Version: V1.0.0
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream){
        this.outputStream = outputStream;
    }

    public void write(String content){
        try {
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHtml(String path) throws FileNotFoundException {
        String resoucePath = FileUtil.getResoucePath(path);
        File file = new File(resoucePath);
        if(file.exists()){
            FileUtil.writeFile(file, outputStream);
        }else{
            write(HttpUtil.getHttpResponseContext404());
        }

    }


}
