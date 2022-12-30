package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DController {
    @Autowired
    DService discoveryService;

    @GetMapping(value = "/client")
    public List<String> services() {
        System.out.println("What the fuck");
        System.out.println(discoveryService.getServices());

        return discoveryService.getServices();
    }

    @PostMapping(value = "/services")
    public List<String> services2() {
        System.out.println("localhost:8015로 부터 요청이 들어왔습니다!");
        System.out.println(discoveryService.getServices());

        return discoveryService.getServices();
    }

}
