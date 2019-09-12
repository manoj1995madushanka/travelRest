package com.sunTravel.travelRest.room;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T475_Room")
public class Room {
    @Id
    private String roomType;
    private int roomCount;
    private int maxAdults;
    private double price;

    public Room(){}

    public Room(String roomType, int roomCount, int maxAdults, double price) {
        this.roomType = roomType;
        this.roomCount = roomCount;
        this.maxAdults = maxAdults;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getMaxAdults() {
        return maxAdults;
    }

    public void setMaxAdults(int maxAdults) {
        this.maxAdults = maxAdults;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
