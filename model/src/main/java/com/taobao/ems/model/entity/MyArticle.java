package com.taobao.ems.model.entity;

import java.io.Serializable;

public class MyArticle implements Serializable {
    private Integer id;

    private String title;

    private String summary;

    private String smallContent;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getSmallContent() {
        return smallContent;
    }

    public void setSmallContent(String smallContent) {
        this.smallContent = smallContent == null ? null : smallContent.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "MyArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", smallContent='" + smallContent + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}