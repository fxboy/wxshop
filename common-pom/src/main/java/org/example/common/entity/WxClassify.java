package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:21
 */
public class WxClassify implements Serializable {
    private static final long serialVersionUID = -81911060719945268L;
    
    private Integer classifyId;
    /**
    * 分类名称
    */
    private String classifyName;
    /**
    * 上级分类
    */
    private String classifyTop;

        
    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }
        
    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }
        
    public String getClassifyTop() {
        return classifyTop;
    }

    public void setClassifyTop(String classifyTop) {
        this.classifyTop = classifyTop;
    }

}