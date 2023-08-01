package com.paul.registrationform.controller;

import com.paul.registrationform.entity.Registration;
import com.paul.registrationform.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    private final RegistrationService service;
    public RegistrationController(RegistrationService service) {
        this.service = service;
    }
    @PostMapping("/addRegistration")
    public Registration addRegistration(@RequestBody Registration registration){
        return service.saveRegistration(registration);
    }
    @PostMapping("/addRegistrations")
    public List<Registration> addRegistrations(@RequestBody List<Registration> registrations){
        return  service.saveAllRegistrations(registrations);
    }
    @GetMapping("/registrations")
    public List<Registration> findAllRegistration(){
        return service.getAllRegistrations();
    }
    @GetMapping("/registration/{firstName}")
    public Registration findRegistrationByFirstName(@PathVariable String firstName){
        return service.getRegistrationByFirstName(firstName);
    }
    @GetMapping("/registration/s/{lastName}")
    public Registration findRegistrationByLastName(@PathVariable String lastName){
        return service.getRegistrationByLastName(lastName);
    }
    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration){
        return service.updateRegistration(registration);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteRegistration(@PathVariable int id){
        return service.deleteRegistration(id);
    }




}
