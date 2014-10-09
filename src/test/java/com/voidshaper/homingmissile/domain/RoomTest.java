package com.voidshaper.homingmissile.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RoomTest {

    @Test
    public void addsADevice() {
        // given
        Room room = new Room("room1");

        // when
        Device device = new Device("termometer", "MyTermometer", Status.WORKING);
        room.withDevice(device);

        // then
        assertThat(room.devices()).containsOnly(device);
    }

    @Test(expected = NullPointerException.class)
    public void throwsExceptionWhenAddingANullDevice() {
        // given
        Room room = new Room("room1");

        // when
        room.withDevice(null);
    }

}