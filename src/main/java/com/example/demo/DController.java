package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DController {
    @Autowired
    DService discoveryService;

    @GetMapping(value = "/client")
    public List<String> services() {
        return discoveryService.getServices();
    }

    @GetMapping (value = "/services")
    public String services2() {
        String string= "gateway - service1 - demo 호출";
        return string;
    }

}
