package br.com.composite.processor.sender;

import br.com.composite.message.Message;
import br.com.composite.processor.IMessageProcessor;

public class MessageSender implements IMessageProcessor {

    public void process(Message message){
        System.out.printf("Sending message: %s\n", message.getBody());
    }
}