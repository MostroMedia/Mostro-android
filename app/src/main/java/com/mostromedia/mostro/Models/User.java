package com.mostromedia.mostro.Models;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.mostromedia.mostro.MainActivity;

public class User extends MainActivity {
    private int ID;
    private String name;
    private String email;
    private int image;
    private String job;
    private String description;

    public User(){
        super();
    }

    public User(String name, String email, int image, String job, String description) {
        this.name = name;
        this.email = email;
        this.image = image;
        this.job = job;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
