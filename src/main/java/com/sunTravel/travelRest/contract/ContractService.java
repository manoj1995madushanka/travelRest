package com.sunTravel.travelRest.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;


    public List<Contract> getAllContracts(){
        //return this.list;
        List<Contract> contracts= new ArrayList<>();
        contractRepository.findAll().forEach(contracts::add);
        return contracts;
    }

    public Contract getContract(int id){

        // return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return contractRepository.findById(id).get();
    }

    public void addContract(Contract topic){
        //this.list.add(topic);
        contractRepository.save(topic);
    }

    public void updateContract(int id, Contract contract){

        contractRepository.save(contract);
    }

    public void deleteContract(int id) {
        // list.removeIf(t -> t.getId().equals(id));
        contractRepository.deleteById(id);
    }
}
