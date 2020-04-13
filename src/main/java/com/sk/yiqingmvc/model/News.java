package com.sk.yiqingmvc.model;


@SuppressWarnings("unused")
public class News {

    /**
     * id
     */
    private String id;

    /**
     * 新闻事件
     */
    private String date;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * url
     */
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "News{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
