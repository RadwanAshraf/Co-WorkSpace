package com.radwan_pc.co_workspace.model;

import java.util.List;
import java.util.Map;

/**
 * Created by Radwan-PC on 02-Mar-18.
 */

public class WorkSpace {
    private String Name;
    private int id;
    private Map<String,String> features;
    private String address;
    private Map<Integer,Float>userRate;
    private String description;
    private List<Integer> roomList;

    public WorkSpace(int id, Map<String, String> features, String address, Map<Integer, Float> userRate, String description, List<Integer> roomList , String Name) {
        this.id = id;
        this.features = features;
        this.address = address;
        this.userRate = userRate;
        this.description = description;
        this.roomList = roomList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, String> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, String> features) {
        this.features = features;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Integer, Float> getUserRate() {
        return userRate;
    }

    public void setUserRate(Map<Integer, Float> userRate) {
        this.userRate = userRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Integer> roomList) {
        this.roomList = roomList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
