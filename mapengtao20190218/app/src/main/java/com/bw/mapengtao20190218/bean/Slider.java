package com.bw.mapengtao20190218.bean;

public class Slider {

//             "id": 3697335,
//            "inner_news": 1,
//            "link": "lsapp://cn.ahurls.news/news?id=3697335",
//            "pic": "19/0217/5c6929696a9fd.jpg",
//            "t": "url",
//            "title": "鍚堣偉鑺傚悗閿欏嘲娓告満绁ㄤ綆鑷�2鎶�",
//            "type": "nomal",
//            "type_sign": ""

    private String id;
    private String inner_news;
    private String link;
    private String pic;
    private String t;
    private String title;
    private String type;
    private String type_sign;

    public Slider(String id, String inner_news, String link, String pic, String t, String title, String type, String type_sign) {
        this.id = id;
        this.inner_news = inner_news;
        this.link = link;
        this.pic = pic;
        this.t = t;
        this.title = title;
        this.type = type;
        this.type_sign = type_sign;
    }

    public Slider() {
    }

    @Override
    public String toString() {
        return "Slider{" +
                "id='" + id + '\'' +
                ", inner_news='" + inner_news + '\'' +
                ", link='" + link + '\'' +
                ", pic='" + pic + '\'' +
                ", t='" + t + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", type_sign='" + type_sign + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInner_news() {
        return inner_news;
    }

    public void setInner_news(String inner_news) {
        this.inner_news = inner_news;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_sign() {
        return type_sign;
    }

    public void setType_sign(String type_sign) {
        this.type_sign = type_sign;
    }
}
