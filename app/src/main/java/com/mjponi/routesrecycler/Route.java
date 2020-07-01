package com.mjponi.routesrecycler;

public class Route {
    private Trip trip;
    private String description;
    private Integer sequence;

    public Route(Trip trip, String description) {
        this.trip = trip;
        this.description = description;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}
