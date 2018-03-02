package com.radwan_pc.co_workspace.model;

import android.media.Image;

import java.net.URL;

/**
 * Created by Radwan-PC on 02-Mar-18.
 */

class BasicInfo {


    private int id;
    private String name;
    private String password;
    private String phone;
    private String email;
    private String city;
    private URL image;



    public BasicInfo(int id, String name, String password, String phone, String email, String city, URL image) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }





}
