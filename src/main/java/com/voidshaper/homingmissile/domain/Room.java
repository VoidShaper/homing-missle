package com.voidshaper.homingmissile.domain;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class Room {

    private final List<Device> deviceList = new ArrayList<>();
    private final String name;

    public Room(String name) {
        this.name = name;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public String getName() {
        return name;
    }

    public Room withDevice(Device device) {
        checkNotNull(device);
        deviceList.add(device);
        return this;
    }

    public List<Device> devices() {
        return ImmutableList.copyOf(deviceList);
    }
}
