package br.com.bridge.sender;

import br.com.bridge.message.Message;

public class RestServiceSender  implements MessageSender {

    @Override
    public void sendMessage(Message message) {
        System.out.printf("Sending message: %s to rest service...\n", message.getBody());
    }
}