package com.radwan_pc.co_workspace.model;

import java.util.List;

/**
 * Created by Radwan-PC on 02-Mar-18.
 */

public class Manager {

    private List<Integer> placeList;
    private BasicInfo basicInfo;

    public Manager(List<Integer> placrList, BasicInfo basicInfo) {
        this.placeList = placrList;
        this.basicInfo = basicInfo;
    }


    public List<Integer> getPlaceList() {
        return placeList;
    }

    public void setPlaceList(List<Integer> placeList) {
        this.placeList = placeList;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }
}
