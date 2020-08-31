package br.com.bridge.sender;

import br.com.bridge.message.Message;

public class MailSender implements MessageSender {

    @Override
    public void sendMessage(Message message) {
        System.out.printf("Sending message: %s by mail...\n", message.getBody());
    }
}
