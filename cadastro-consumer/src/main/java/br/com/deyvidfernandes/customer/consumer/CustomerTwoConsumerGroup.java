package br.com.deyvidfernandes.customer.consumer;

import br.com.deyvidfernandes.customer.business.object.CustomerBO;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerTwoConsumerGroup {
    @Autowired
    private CustomerBO customerBO;
    @Value("${kafka.topic.consumergroup1}")
    private String groupId1;
    @Value("${kafka.topic.consumergroup2}")
    private String groupId2;
    @KafkaListener(topics = "${spring.kafka.topic.customer}", groupId = "${kafka.topic.consumergroup2}")
    private void process1(ConsumerRecord<String, String> record){
        customerBO.show(record, "groupId="+groupId1);
    }

    @KafkaListener(topics = "${spring.kafka.topic.customer}", groupId = "${kafka.topic.consumergroup1}")
    private void process2(ConsumerRecord<String, String> record){
        customerBO.show(record, "groupId="+groupId2);
    }
}
