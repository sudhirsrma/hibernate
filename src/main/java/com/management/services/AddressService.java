package com.management.services;

import com.management.entity.Address;
import com.management.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddress(long id) {
        return addressRepository.getById(id);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(Address address, long id) {
        addressRepository.save(address);
    }

    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }

}
