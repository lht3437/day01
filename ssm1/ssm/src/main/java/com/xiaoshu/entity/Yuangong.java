package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Yuangong implements Serializable {
    @Id
    private Integer yid;

    private String yname;

    private String sex;

    private Integer bid;

    private static final long serialVersionUID = 1L;

    /**
     * @return yid
     */
    public Integer getYid() {
        return yid;
    }

    /**
     * @param yid
     */
    public void setYid(Integer yid) {
        this.yid = yid;
    }

    /**
     * @return yname
     */
    public String getYname() {
        return yname;
    }

    /**
     * @param yname
     */
    public void setYname(String yname) {
        this.yname = yname == null ? null : yname.trim();
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * @param bid
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yid=").append(yid);
        sb.append(", yname=").append(yname);
        sb.append(", sex=").append(sex);
        sb.append(", bid=").append(bid);
        sb.append("]");
        return sb.toString();
    }
}