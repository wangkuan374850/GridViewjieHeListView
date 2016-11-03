package com.bwei.bean;

/**
 * Created by wangkuan on 2016/11/3.
 */
public class MyGridView {
    private int tuPian;
    private String biaoTi;

    public int getTuPian() {
        return tuPian;
    }

    public void setTuPian(int tuPian) {
        this.tuPian = tuPian;
    }

    public String getBiaoTi() {
        return biaoTi;
    }

    public void setBiaoTi(String biaoTi) {
        this.biaoTi = biaoTi;
    }

    public MyGridView(int tuPian, String biaoTi) {
        this.tuPian = tuPian;
        this.biaoTi = biaoTi;
    }

    public MyGridView() {
    }
}
