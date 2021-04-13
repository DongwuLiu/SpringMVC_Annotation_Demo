package com.dongwu.entity;

/**
 * @author liudw
 * @date 2021/4/12 11:13
 * @effect
 */
public class Probability {
    private String probabilityKey;
    private String probabilityValue;

    public Probability() {
        super();
    }

    public Probability(String probabilityKey, String probabilityValue) {
        super();
        this.probabilityKey = probabilityKey;
        this.probabilityValue = probabilityValue;
    }

    public String getProbabilityKey() {
        return probabilityKey;
    }

    public void setProbabilityKey(String probabilityKey) {
        this.probabilityKey = probabilityKey;
    }

    public String getProbabilityValue() {
        return probabilityValue;
    }

    public void setProbabilityValue(String probabilityValue) {
        this.probabilityValue = probabilityValue;
    }

    @Override
    public String toString() {
        return "Probability[" + "probabilityKey = " + probabilityKey + ", probabilityValue = " + probabilityValue + "]";
    }
}
