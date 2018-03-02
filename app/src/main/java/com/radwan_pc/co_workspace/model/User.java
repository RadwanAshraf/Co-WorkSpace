package com.radwan_pc.co_workspace.model;

import java.util.Map;

/**
 * Created by Radwan-PC on 20-Feb-18.
 */

public class User {


    private Map<String,Integer> favList;
    private BasicInfo basicInfo;


    public User(Map<String, Integer> favList, BasicInfo basicInfo) {
        this.favList = favList;
        this.basicInfo = basicInfo;
    }

    public User(Map<String, Integer> favList) {
        this.favList = favList;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }



    public Map<String, Integer> getFavList() {
        return favList;
    }

    public void setFavList(Map<String, Integer> favList) {
        this.favList = favList;
    }



}
