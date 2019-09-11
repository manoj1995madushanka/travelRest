package com.sunTravel.travelRest.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    /*private List<Topics> list = new ArrayList<>(Arrays.asList(
            new Topics("senuri","science","face cute"),
            new Topics("sachini","science","too fat"),
            new Topics("helani","codegen","too crazy")
    ));*/

    public List<Hotel> getAllHotels(){
        //return this.list;
        List<Hotel> hotels= new ArrayList<>();
        hotelRepository.findAll().forEach(hotels::add);
        return hotels;
    }

    public Hotel getHotel(int id){

        // return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return hotelRepository.findById(id).get();
    }

    public void addHotel(Hotel topic){
        //this.list.add(topic);
        hotelRepository.save(topic);
    }

    public void updateHotel(int id, Hotel hotel){
        /*for(int i=0; i< list.size();i++){
            Topics t = list.get(i);
            if(t.getId().equals(id)){
                list.set(i,topic);
                return;
            }
        }*/
        hotelRepository.save(hotel);
    }

    public void deleteHotel(int id) {
        // list.removeIf(t -> t.getId().equals(id));
        hotelRepository.deleteById(id);
    }
}
