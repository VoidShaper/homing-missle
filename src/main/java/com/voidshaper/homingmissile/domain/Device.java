package com.voidshaper.homingmissile.domain;

public class Device {
    private String type;
    private String name;
    private Status status;

    public Device(String type, String name, Status status) {
        this.type = type;
        this.name = name;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }
}
