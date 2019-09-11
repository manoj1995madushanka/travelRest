package com.sunTravel.travelRest.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping("/hotels")
    public List<Hotel> getAllHotels(){
        return this.hotelService.getAllHotels();
    }

    @RequestMapping("/hotels/{id}")
    public Hotel getTopic(@PathVariable("id") int id){
        return this.hotelService.getHotel(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "hotels")
    public void addHotel(@RequestBody Hotel hotel){
        hotelService.addHotel(hotel);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "hotels/{id}")
    public void updateHotel(@RequestBody Hotel hotel, @PathVariable("id") int id){
        hotelService.updateHotel(id, hotel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "hotels/{id}")
    public void deleteHotel(@PathVariable("id") int id){
        hotelService.deleteHotel(id);
    }
}
