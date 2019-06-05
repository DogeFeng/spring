package com.ytinf.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Item implements Serializable {
    private String title ;
    private Date createtion ;
    private List<String> contents ;

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", createtion=" + createtion +
                ", contents=" + contents +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetion() {
        return createtion;
    }

    public void setCreatetion(Date createtion) {
        this.createtion = createtion;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }
}
