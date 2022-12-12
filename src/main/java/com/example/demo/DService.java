package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DService {
    @Autowired
    private DiscoveryClient discoveryClient;

    public List getServices(){
        List<String> services = new ArrayList<String>();

        /** 람다스트림 표현 */
        discoveryClient.getServices().forEach(serviceName -> {
            discoveryClient.getInstances(serviceName).forEach(instance->{
                services.add( String.format("client 서비스 정보들입니다. 현재 쿠버네티스 파드로 서비스 하고 있는 중입니다. %s:%s",serviceName,instance.getUri()));
            });
        });
        return services;
    }

}