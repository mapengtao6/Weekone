package com.bw.mapengtao20190218.bean;

import java.util.ArrayList;

public class Data {

    private String bindtips;
    private ArrayList<Dataa> data;
    private Extras extras;
    private String max_page;
    private String page;
    private String perpage;
    private String total;

    @Override
    public String toString() {
        return "Data{" +
                "bindtips='" + bindtips + '\'' +
                ", data=" + data +
                ", extras=" + extras +
                ", max_page='" + max_page + '\'' +
                ", page='" + page + '\'' +
                ", perpage='" + perpage + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    public String getBindtips() {
        return bindtips;
    }

    public void setBindtips(String bindtips) {
        this.bindtips = bindtips;
    }

    public ArrayList<Dataa> getData() {
        return data;
    }

    public void setData(ArrayList<Dataa> data) {
        this.data = data;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    public String getMax_page() {
        return max_page;
    }

    public void setMax_page(String max_page) {
        this.max_page = max_page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPerpage() {
        return perpage;
    }

    public void setPerpage(String perpage) {
        this.perpage = perpage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Data() {
    }

    public Data(String bindtips, ArrayList<Dataa> data, Extras extras, String max_page, String page, String perpage, String total) {
        this.bindtips = bindtips;
        this.data = data;
        this.extras = extras;
        this.max_page = max_page;
        this.page = page;
        this.perpage = perpage;
        this.total = total;
    }
}
