package home.amit.springboot.oauth2.app.service;
/*
User :- AmitSingh
Date :- 7/28/2023
Time :- 12:14 PM
Year :- 2023
*/

import home.amit.springboot.oauth2.app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees()
    {
        Employee employee= new Employee(1,"Test",34,"Pune");
        Employee employee2= new Employee(2,"Test1",34,"MUmbai");
        Employee employee3= new Employee(3,"Test2",35,"Bangalore");
        Employee employee4= new Employee(4,"Test3",34,"Chennai");

        List<Employee> list= new ArrayList<>();
        list.add(employee);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        return  list;




    }

}
