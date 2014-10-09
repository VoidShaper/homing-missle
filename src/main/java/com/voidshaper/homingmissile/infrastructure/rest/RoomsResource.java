package com.voidshaper.homingmissile.infrastructure.rest;

import com.voidshaper.homingmissile.domain.Device;
import com.voidshaper.homingmissile.domain.Room;
import com.voidshaper.homingmissile.domain.Status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rooms")
@Produces(MediaType.APPLICATION_JSON)
public class RoomsResource {

    @GET
    @Path("/{roomName}")
    public Room getRoom(@PathParam("roomName") String roomName) {
        Device device1 = new Device("Robot", "Hanky", Status.IDLE);
        Device device2 = new Device("Fridge", "Berta", Status.FAILED);
        return new Room(roomName)
                .withDevice(device1)
                .withDevice(device2);
    }

}
