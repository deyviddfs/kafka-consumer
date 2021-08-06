package br.com.deyvidfernandes.customer.business.object;

import br.com.deyvidfernandes.customer.util.LogUtil;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerBO {
    @Autowired
    private LogUtil logUtil;
    public void show(ConsumerRecord<String, String> record, String process) {
        logUtil.showLogTopic(record, process);
    }
}
