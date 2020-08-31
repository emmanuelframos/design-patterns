package br.com.bridge.sender;

import br.com.bridge.message.Message;

public class QueueSender implements MessageSender {

    @Override
    public void sendMessage(Message message) {
        System.out.printf("Sending message: %s to queue...\n", message.getBody());
    }
}