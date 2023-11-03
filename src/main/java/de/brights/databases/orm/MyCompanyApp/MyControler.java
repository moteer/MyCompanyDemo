package de.brights.databases.orm.MyCompanyApp;

import de.brights.databases.orm.MyCompanyApp.entity.Employee;
import de.brights.databases.orm.MyCompanyApp.entity.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyControler {


    @Autowired
    private EmployeeRepository employeeRepository;

    // http://localhost:8080/
    @GetMapping("/")
    public @ResponseBody Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/addOne")
    public @ResponseBody Iterable<Employee> addAnotherEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeNumber(1);
        employee.setName("Otto");
        employee.setJobTitle("Developer");
        employeeRepository.save(employee);

        return employeeRepository.findAll();
    }


    @GetMapping("/so")
    public @ResponseBody String irgendwas() {
        return "Hallo";
    }


}
