package com.cgi.tennis;

public class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }
    // No setters. Speaking name, since manipulation
    public void addPoint() {
        points++;
    }

    // Need getters, since no manipulation
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
