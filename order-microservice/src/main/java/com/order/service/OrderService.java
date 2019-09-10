package com.order.service;

import com.order.DataInitializer;
import com.order.domain.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    DataInitializer initializer;

    public OrderService() {
        super();
        // this.initializer = initializer;
    }

    public List<String> findVolunteers(String id) {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        List<String> volnames = new ArrayList<String>();
        List<EmployeeInfo> vols = initializer.employees;
        for (EmployeeInfo vol : vols) {
            System.out.println(vol.getEmployeeId() + ":" + vol.getFirstName());
            if (Long.toString(vol.getEmployeeId()).contains(id) ) {
                volnames.add(vol.getFirstName() + " " + vol.getLastName());
            }
        }
        System.out.println("FFFFFFFFFFFFFFFFFF");
        return volnames;
    }

}
