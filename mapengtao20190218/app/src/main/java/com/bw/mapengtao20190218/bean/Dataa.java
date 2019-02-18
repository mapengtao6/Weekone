package com.bw.mapengtao20190218.bean;

public class Dataa {

//              "alias": "headline",
//              "comment_amount": 0,
//              "comment_amount_label": "0",
//              "id": 3697740,
//              "inner_news": 1,
//              "link": "lsapp://cn.ahurls.news/news?id=3697740",
//              "pic_amount": 0,
//              "pics": [
//              "appletrecommend/201902/5c69f50abaaa1.jpg"
//              ],
//              "source": "",
//              "style": "single_right",
//              "t": "url",
//              "title": "鍚堣偉涓€鎵瑰叕鍏卞仠杞﹀満灏嗗惎鐢� 浠婂勾榧撳姳绀句細璧勬湰鍙備笌寤鸿鍙幏濂栬ˉ",
//              "type": "normal",
//              "type_sign": "",
//              "views": 135,
//              "views_label": "135"

    private String alias;
    private String comment_amount;
    private String comment_amount_label;
    private String id;
    private String inner_news;
    private String link;
    private String pic_amount;
    private String pics;
    private String source;
    private String style;
    private String t;
    private String title;
    private String type;
    private String type_sign;
    private String views;
    private String views_label;

    @Override
    public String toString() {
        return "Dataa{" +
                "alias='" + alias + '\'' +
                ", comment_amount='" + comment_amount + '\'' +
                ", comment_amount_label='" + comment_amount_label + '\'' +
                ", id='" + id + '\'' +
                ", inner_news='" + inner_news + '\'' +
                ", link='" + link + '\'' +
                ", pic_amount='" + pic_amount + '\'' +
                ", pics='" + pics + '\'' +
                ", source='" + source + '\'' +
                ", style='" + style + '\'' +
                ", t='" + t + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", type_sign='" + type_sign + '\'' +
                ", views='" + views + '\'' +
                ", views_label='" + views_label + '\'' +
                '}';
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getComment_amount() {
        return comment_amount;
    }

    public void setComment_amount(String comment_amount) {
        this.comment_amount = comment_amount;
    }

    public String getComment_amount_label() {
        return comment_amount_label;
    }

    public void setComment_amount_label(String comment_amount_label) {
        this.comment_amount_label = comment_amount_label;
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

    public String getPic_amount() {
        return pic_amount;
    }

    public void setPic_amount(String pic_amount) {
        this.pic_amount = pic_amount;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getViews_label() {
        return views_label;
    }

    public void setViews_label(String views_label) {
        this.views_label = views_label;
    }

    public Dataa() {
    }

    public Dataa(String alias, String comment_amount, String comment_amount_label, String id, String inner_news, String link, String pic_amount, String pics, String source, String style, String t, String title, String type, String type_sign, String views, String views_label) {
        this.alias = alias;
        this.comment_amount = comment_amount;
        this.comment_amount_label = comment_amount_label;
        this.id = id;
        this.inner_news = inner_news;
        this.link = link;
        this.pic_amount = pic_amount;
        this.pics = pics;
        this.source = source;
        this.style = style;
        this.t = t;
        this.title = title;
        this.type = type;
        this.type_sign = type_sign;
        this.views = views;
        this.views_label = views_label;
    }
}
