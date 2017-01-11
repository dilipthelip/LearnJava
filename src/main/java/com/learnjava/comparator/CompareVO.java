package com.learnjava.comparator;

/**
 * Created by z001qgd on 1/11/17.
 */
public class CompareVO {

    private  Integer compareVal;

    @Override
    public String toString() {
        return "CompareVO{" +
                "compareVal=" + compareVal +
                '}';
    }

    public Integer getCompareVal() {
        return compareVal;
    }

    public void setCompareVal(Integer compareVal) {
        this.compareVal = compareVal;
    }
}
