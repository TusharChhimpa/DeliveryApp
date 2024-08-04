package com.chhimpa.DeliveryBoy.KafkaService;

import com.chhimpa.DeliveryBoy.Config.AppConstants;
import com.chhimpa.DeliveryBoy.Config.KafkaConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    public KafkaConfig kafkaConfig;


    private Logger l=LoggerFactory.getLogger(Service.class);

    public boolean updateLocation(String location)
    {
        kafkaTemplate.send(AppConstants.Location_Topic_Name,location);

        return true;
    }
}
