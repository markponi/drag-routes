package com.mjponi.routesrecycler;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    private String name;
    private List<Route> routes;

    public Trip(String name) {
        this.name = name;
        routes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRoute(Route route){
        routes.add(route);
        route.setSequence(routes.indexOf(route));
    }

    public List<Route> getRoutes() {
        return routes;
    }
}
