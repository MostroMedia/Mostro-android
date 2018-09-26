package com.mostromedia.mostro.Models;

import android.graphics.Bitmap;

public class MostroService {
    private int ID;
    private String name;
    private String description;
    private Bitmap image;
    private double price;

    public MostroService(){
        super();
    }
    public MostroService(int ID, String name, String description, Bitmap image, double price) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }
}
