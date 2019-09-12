package com.sunTravel.travelRest.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("/rooms")
    public List<Room> getAllRooms(){
        return this.roomService.getAllrooms();
    }

    @RequestMapping("/rooms/{type}")
    public Room getRoom(@PathVariable("type") String type){
        return this.roomService.getRoom(type);
    }

    @RequestMapping(method = RequestMethod.POST, value = "rooms")
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "rooms/{type}")
    public void roomContract(@RequestBody Room room, @PathVariable("type") String type){
        roomService.updateRoom(type, room);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "rooms/{type}")
    public void deleteRoom(@PathVariable("type") String type){
        roomService.deleteRoom(type);
    }
}
