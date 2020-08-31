package br.com.composite;

import br.com.composite.message.Message;
import br.com.composite.processor.IMessageProcessor;
import br.com.composite.processor.sender.MessageSender;
import br.com.composite.processor.storage.CloudStorage;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void test_composite(){
        Message message = new Message();
        message.setBody("A simple message.");

        IMessageProcessor cloudProcessor = new CloudStorage();
        cloudProcessor.process(message);

        IMessageProcessor messageSender = new MessageSender();
        messageSender.process(message);

    }
}