package com.example.administrator.trello.bean;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import static com.example.administrator.hundredtimes.util.AppUtilKt.getRandomColor;

@Entity
public class Project {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String imgPath;

    public Project(String title){
        this.title = title;
        this.imgPath = getRandomColor();
    }
    @Ignore
    public Project(String title,String imgPath){
        this.title = title;
        this.imgPath = imgPath;
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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

}
