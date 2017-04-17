package com.keshav.inmobi;

/**
 * Created by keshav.p on 4/8/17.
 */

public class DataModel {

    String name;
    String response;
    int image;

    public DataModel(String name, int image, String response) {
        this.name = name;
        this.image = image;
        this.response = response;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getResponse() {
        return response;
    }
}
