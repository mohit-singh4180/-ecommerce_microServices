package com.order;

import com.order.domain.EmployeeInfo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class DataInitializer {
    public static List<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();

    public DataInitializer() {
        super();
        System.out.println("Initializing data...");
        initializeData();
        // TODO Auto-generated constructor stub
    }

    public void initializeData() {
        EmployeeInfo employeeInfo1 = new EmployeeInfo(2L, "Rohit", "Singh", "Male", 1000, "abc@mohit.com", false);
        EmployeeInfo employeeInfo2 = new EmployeeInfo(3L, "Amit", "Singh", "Male", 333, "abc@Rohit.com", true);
        EmployeeInfo employeeInfo3 = new EmployeeInfo(4L, "Rohit", "Gupta", "Male", 3333, "abc@gupta.com", false);
        employeeInfo1.addService("dropToOffice");
        employeeInfo1.addService("orderProduct");
        employeeInfo2.addService("dropToOffice");
        employeeInfo3.addService("orderProduct");
        employees.add(employeeInfo1);
        employees.add(employeeInfo2);

        employees.add(employeeInfo3);
        System.out.println("Number of employees:" + employees.size());

    }
}
