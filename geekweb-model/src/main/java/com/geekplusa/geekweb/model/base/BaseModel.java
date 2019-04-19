package com.geekplusa.geekweb.model.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: geekweb
 * @description: 系统中万物的父类
 * @author: weixd
 * @createTime: 2019-04-19 16:20
 **/
public abstract class BaseModel implements Serializable{
    private static final long serialVersionUID = -2010334250316407855L;
    /**
     * id
     */
    protected Long id;
    /**
     * 创建人
     */
    protected Long createBy;
    /**
     * 创建时间
     */
    protected String createTime;
    /**
     * 修改人
     */
    protected Long updateBy;
    /**
     * 修改时间
     */
    protected String updateTime;

    protected Long version;

    protected Integer pageSize;

    protected Page page;
    /**
     * 状态：表示实体是否启用
     */
    protected boolean state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
