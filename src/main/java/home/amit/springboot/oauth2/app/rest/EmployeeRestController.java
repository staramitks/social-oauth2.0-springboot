package home.amit.springboot.oauth2.app.rest;
import home.amit.springboot.oauth2.app.model.Employee;
import home.amit.springboot.oauth2.app.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }

@GetMapping("/")
public ResponseEntity<List<Employee>> getEmployees()
{
    List<Employee> employees = employeeService.getEmployees();
    ResponseEntity responseEntity=new ResponseEntity<>(employees, HttpStatus.OK);
    return responseEntity;
}


}
