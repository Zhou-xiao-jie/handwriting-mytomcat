package com.atxiaojie.mytomcat.config;

/**
 * @ClassName: ServletConfig
 * @Description: ServletConfig
 * @author: zhouxiaojie
 * @date: 2021/11/6 0:17
 * @Version: V1.0.0
 */
public class ServletConfig {

    private String name;
    private String urlMapping;
    private String clazz;

    public ServletConfig(String name, String urlMapping, String clazz) {
        this.name = name;
        this.urlMapping = urlMapping;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlMapping() {
        return urlMapping;
    }

    public void setUrlMapping(String urlMapping) {
        this.urlMapping = urlMapping;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
