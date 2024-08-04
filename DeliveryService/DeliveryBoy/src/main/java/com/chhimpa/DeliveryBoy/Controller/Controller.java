package com.chhimpa.DeliveryBoy.Controller;

import com.chhimpa.DeliveryBoy.KafkaService.Service;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Location")
public class Controller {

    @Autowired
    public Service service;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation()
    {
        for(int i=0;i<200000;i++)
        service.updateLocation(Math.random()%100+", "+Math.random()%100);
        return new ResponseEntity<>(Map.of("Message","New Locatioin updated"), HttpStatus.OK);
    }
}
