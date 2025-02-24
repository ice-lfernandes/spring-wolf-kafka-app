package br.com.ldf.medium.app.infrastructure;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Publisher {

    private final KafkaTemplate<String, UserPayloadDTO> kafkaTemplate;

    public void publish(UserPayloadDTO userPayloadDTO) {
        kafkaTemplate.send("wolf-topic", userPayloadDTO);
    }
}
