package com.jinju.Ramyun.model;

import org.apache.ibatis.type.Alias;

@Alias("recipe")
public class RamyunRecipeDTO {

    private int num;
    private String title;
    private String picture;
    private String content;
    private String postdate;
    private String poster;
    private int visitcount;
    private int commentNum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public int getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(int visitcount) {
        this.visitcount = visitcount;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    @Override
    public String toString() {
        return "RamyunRecipeDTO{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", picture='" + picture + '\'' +
                ", content='" + content + '\'' +
                ", postdate='" + postdate + '\'' +
                ", poster='" + poster + '\'' +
                ", visitcount=" + visitcount +
                ", commentNum=" + commentNum +
                '}';
    }
}
