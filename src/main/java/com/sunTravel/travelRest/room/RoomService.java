package com.sunTravel.travelRest.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService  {

    @Autowired
    private RoomRepository roomRepository;


    public List<Room> getAllrooms(){
        //return this.list;
        List<Room> rooms= new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    public Room getRoom(String type){

        // return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return roomRepository.findById(type).get();
    }

    public void addRoom(Room room){
        //this.list.add(topic);
        roomRepository.save(room);
    }

    public void updateRoom(String type, Room room){

        roomRepository.save(room);
    }

    public void deleteRoom(String type) {
        // list.removeIf(t -> t.getId().equals(id));
        roomRepository.deleteById(type);
    }
}
