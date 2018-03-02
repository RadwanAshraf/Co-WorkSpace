package com.radwan_pc.co_workspace.model;

/**
 * Created by Radwan-PC on 02-Mar-18.
 */

public class Room {


    private int roomID;
    private int maxUser;
    private int priceHour;

    public Room(int roomID, int maxUser, int priceHour) {
        this.roomID = roomID;
        this.maxUser = maxUser;
        this.priceHour = priceHour;
    }


    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getMaxUser() {
        return maxUser;
    }

    public void setMaxUser(int maxUser) {
        this.maxUser = maxUser;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }
}
