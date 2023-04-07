package com.driver.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private Date pubDate;

    @ManyToOne
    @JoinColumn
    User user;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    List<Image> images;

    public Blog(){

    }

    public Blog(int id, String title, String content, Date pubDate, User user, List<Image> images) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pubDate = pubDate;
        this.user = user;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}

