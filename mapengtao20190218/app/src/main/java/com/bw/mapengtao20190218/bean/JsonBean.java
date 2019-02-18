package com.bw.mapengtao20190218.bean;

public class JsonBean {

    private String code;
    private Data data;
    private String httpStatusCode;

    @Override
    public String toString() {
        return "JsonBean{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", httpStatusCode='" + httpStatusCode + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public JsonBean() {
    }

    public JsonBean(String code, Data data, String httpStatusCode) {
        this.code = code;
        this.data = data;
        this.httpStatusCode = httpStatusCode;
    }
}
