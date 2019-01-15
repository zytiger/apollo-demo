package com.zytiger.apollo.demo.service.dal.local.dataobject;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The table TOKEN
 */
public class TokenDO {

    /**
     * num NUM.
     */
    private String num;
    /**
     * uid UID.
     */
    private String uid;
    /**
     * time TIME.
     */
    private String time;
    /**
     * money MONEY.
     */
    private String money;

    /**
     * Set num NUM.
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * Get num NUM.
     *
     * @return the string
     */
    public String getNum() {
        return num;
    }

    /**
     * Set uid UID.
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Get uid UID.
     *
     * @return the string
     */
    public String getUid() {
        return uid;
    }

    /**
     * Set time TIME.
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Get time TIME.
     *
     * @return the string
     */
    public String getTime() {
        return time;
    }

    /**
     * Set money MONEY.
     */
    public void setMoney(String money) {
        this.money = money;
    }

    /**
     * Get money MONEY.
     *
     * @return the string
     */
    public String getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
