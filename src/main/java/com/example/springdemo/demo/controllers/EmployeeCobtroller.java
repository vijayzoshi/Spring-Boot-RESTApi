package com.example.springdemo.demo.controllers;


import com.example.springdemo.demo.dto.EmployeeDTO;
import com.example.springdemo.demo.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeCobtroller {


    private final EmployeeService employeeService;

    public EmployeeCobtroller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{id}")
    public EmployeeDTO getemployee(@PathVariable("id") Long iddiff) {

        return employeeService.getEmployeeById(iddiff);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteEmployeeByid(@PathVariable("id") Long iddiff) {
        return employeeService.deleteEmployeeById(iddiff);
    }

    /*
    @GetMapping(path = "/employee/new")
    public EmployeeDTO getemployee(){
        return new EmployeeDTO(12L, "vk", LocalDate.of(33,4,1),true);
    }
    */

    /*  @GetMapping(path = "/employee/{id}")
      public String getemployee(@PathVariable("id") Long iddiff){
          return "user id" + iddiff;

      }
    @GetMapping()
    public String getData(@PathParam("sortby") String sortby) {
        return "hellow" + sortby;
    }
     */


}
