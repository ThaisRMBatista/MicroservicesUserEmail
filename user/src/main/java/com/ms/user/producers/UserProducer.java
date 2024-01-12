package com.ms.user.producers;

import com.ms.user.dtos.EmailDTO;
import com.ms.user.models.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(UserModel userModel) {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setUserId(userModel.getUserId());
        emailDTO.setEmailTo(userModel.getEmail());
        emailDTO.setSubject("Cadastro realizado com sucesso!");
        emailDTO.setText(userModel.getName() + ", seja Bem-vindo(a)! \nAgradeçemos seu cadastro, aproveite agora todos os recursos da nossa plataforma.");

        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }
}
