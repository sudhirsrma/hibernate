package com.management.controllers;

import com.management.entity.Address;
import com.management.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getAddresses")
    public List<Address> getAddresses() {
        return addressService.getAddresses();
    }

    @GetMapping("/getAddress/{id}")
    public Address getAddress(@PathVariable long id) {
        return addressService.getAddress(id);
    }

    @PostMapping ("/addAddress")
    public String addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return "successfully added"+address ;
    }

    @PutMapping("/updateAddress/{id}")
    public String updateAddress(@RequestBody Address address,@PathVariable long id){
        addressService.updateAddress(address,id);
        return "successfully updated at "+id ;
    }

    @DeleteMapping ("/deleteAddress/{id}")
    public String deleteAddress(@PathVariable long id ){
        addressService.deleteAddress(id);
        return "successfully deleted with an id "+id ;
    }
}
