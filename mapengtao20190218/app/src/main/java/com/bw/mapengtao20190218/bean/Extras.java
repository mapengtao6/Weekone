package com.bw.mapengtao20190218.bean;

import java.util.ArrayList;

public class Extras {

    private ArrayList<Slider> slider;

    @Override
    public String toString() {
        return "Extras{" +
                "slider=" + slider +
                '}';
    }

    public ArrayList<Slider> getSlider() {
        return slider;
    }

    public void setSlider(ArrayList<Slider> slider) {
        this.slider = slider;
    }

    public Extras() {
    }

    public Extras(ArrayList<Slider> slider) {
        this.slider = slider;
    }
}
