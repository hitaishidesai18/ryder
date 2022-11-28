package com.example.ryderr.ui.main.cabs.request;

import java.sql.Time;
import java.util.ArrayList;

public class RequestCab {

    String from_location;
    String to_location;
    int progress;
    int fare;
    Time departure_time;
    ArrayList<String> riders;

    public RequestCab() {
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

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Time departure_time) {
        this.departure_time = departure_time;
    }

    public ArrayList<String> getRiders() {
        return riders;
    }

    public void setRiders(ArrayList<String> riders) {
        this.riders = riders;
    }

    public RequestCab(String from_location, String to_location, int progress, int fare, Time departure_time, ArrayList<String> riders) {
        this.from_location = from_location;
        this.to_location = to_location;
        this.progress = progress;
        this.fare = fare;
        this.departure_time = departure_time;
        this.riders = riders;
    }
}
