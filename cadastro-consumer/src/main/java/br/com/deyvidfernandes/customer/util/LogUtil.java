package br.com.deyvidfernandes.customer.util;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

@Component
public class LogUtil {
    public void showLogTopic(ConsumerRecord<String, String> record, String process) {
        System.out.println("process: " + process + ", topic: " + record.topic() + ", value: " + record.value());
    }
}
