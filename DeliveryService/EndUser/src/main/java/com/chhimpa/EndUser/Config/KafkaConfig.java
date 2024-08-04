package com.chhimpa.EndUser.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
@Configuration
public class KafkaConfig {


    @KafkaListener(topics = AppConstant.Location_Update,groupId = AppConstant.Group_ID)
    public void UpdateLocation(String s)
    {
        System.out.println(s+"  ---");
    }
}
