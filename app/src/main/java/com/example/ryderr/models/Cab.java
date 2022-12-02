package com.example.ryderr.models;

import java.util.ArrayList;

public class Cab {

    String live_cab_id;
    String group_chat_id;
    int capacity;
    int count_riders;
    int fare;
    boolean live = false;

    String driver_name;
    String vehicle_number;
    String from_location;
    String to_location;
    String departure_time;
    ArrayList<String> riders_ids;

    public Cab(String live_cab_id, String group_chat_id, int capacity, int count_riders,
            int fare, boolean live,
            String driver_name, String vehicle_number, String from_location,
            String to_location, String departure_time) {
        this.live_cab_id = live_cab_id;
        this.group_chat_id = group_chat_id;
        this.capacity = capacity;
        this.count_riders = count_riders;
        this.fare = fare;
        this.live = live;
        this.driver_name = driver_name;
        this.vehicle_number = vehicle_number;
        this.from_location = from_location;
        this.to_location = to_location;
        this.departure_time = departure_time;
        riders_ids = new ArrayList<>();
    }
    public Cab() {

    }



    public String getFareText(){
        int fare = getFare();
        return Integer.toString(fare);
    }
    public String getLive_cab_id() {
        return live_cab_id;
    }

    public void setLive_cab_id(String live_cab_id) {
        this.live_cab_id = live_cab_id;
    }

    public String getGroup_chat_id() {
        return group_chat_id;
    }

    public void setGroup_chat_id(String group_chat_id) {
        this.group_chat_id = group_chat_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCount_riders() {
        return count_riders;
    }

    public void setCount_riders(int count_riders) {
        this.count_riders = count_riders;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getFrom_location() {
        return from_location;
    }

    public void setFrom_location(String from_location) {
        this.from_location = from_location;
    }

    public String getTo_location() {
        return to_location;
    }

    public void setTo_location(String to_location) {
        this.to_location = to_location;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public ArrayList<String> getRiders() {
        return riders_ids;
    }

    public void setRiders(ArrayList<String> riders_ids) {
        this.riders_ids = riders_ids;
    }
}
