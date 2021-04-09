package com.dongwu.entity;

/**
 * @author liudw
 * @date 2021/4/9 16:49
 * @effect
 */
public class Attitude {
    private String attitudeKey;
    private String attitudeValue;

    public Attitude() {
        super();
    }

    public Attitude(String attitudeValue,String attitudeKey) {
        super();
        this.attitudeValue = attitudeValue;
        this.attitudeKey = attitudeKey;
    }

    public String getAttitudeKey() {
        return attitudeKey;
    }

    public void setAttitudeKey(String attitudeKey) {
        this.attitudeKey = attitudeKey;
    }

    public String getAttitudeValue() {
        return attitudeValue;
    }

    public void setAttitudeValue(String attitudeValue) {
        this.attitudeValue = attitudeValue;
    }

    @Override
    public String toString() {
        return "Attitude[" + "attitudeKey = " + attitudeKey + ", attitudeValue = " + attitudeValue + "]";
    }
}
