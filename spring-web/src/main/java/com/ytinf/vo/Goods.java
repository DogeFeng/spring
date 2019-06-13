package com.ytinf.vo;

import java.io.Serializable;

public class Goods implements Serializable {
    private Long gid;
    private String name;
    private Double price;
    private String photoName;
    private String note;
    private Long dflag;
    private Long iid;

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", photoName='" + photoName + '\'' +
                ", note='" + note + '\'' +
                ", dflag=" + dflag +
                ", iid=" + iid +
                '}';
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getDflag() {
        return dflag;
    }

    public void setDflag(Long dflag) {
        this.dflag = dflag;
    }

    public Long getIid() {
        return iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }
}
