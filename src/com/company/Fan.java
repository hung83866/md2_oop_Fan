package com.company;

public class Fan {
    private final byte slow = 1;
    private final byte medium = 2;
    private final byte fast = 3;
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public byte getSlow() {
        return slow;
    }

    public byte getMedium() {
        return medium;
    }

    public byte getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isStatus()) {
            return "Fan{" +
                    "fan is on" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    "fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


}
