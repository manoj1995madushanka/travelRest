package com.sunTravel.travelRest.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ContractController {

    @Autowired
    private ContractService contractService;

    @RequestMapping("/contracts")
    public List<Contract> getAllHotels(){
        return this.contractService.getAllContracts();
    }

    @RequestMapping("/contracts/{id}")
    public Contract getContract(@PathVariable("id") int id){
        return this.contractService.getContract(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "contracts")
    public void addContract(@RequestBody Contract contract){
        contractService.addContract(contract);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "contracts/{id}")
    public void updateContract(@RequestBody Contract contract, @PathVariable("id") int id){
        contractService.updateContract(id, contract);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "contracts/{id}")
    public void deleteContract(@PathVariable("id") int id){
        contractService.deleteContract(id);
    }
}
