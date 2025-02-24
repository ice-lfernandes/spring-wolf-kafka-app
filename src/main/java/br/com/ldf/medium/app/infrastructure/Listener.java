package br.com.ldf.medium.app.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Listener {

    @KafkaListener(topics = "wolf-topic", groupId = "wolf-group")
    public void consume(UserPayloadDTO userPayloadDTO) {
      log.info("Consuming message: {}", userPayloadDTO);
    }
}
