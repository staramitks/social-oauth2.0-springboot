package home.amit.springboot.oauth2.app.model;
/*
User :- AmitSingh
Date :- 7/28/2023
Time :- 12:14 PM
Year :- 2023
*/

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private String name;
    private int age;
    private String city;

}
