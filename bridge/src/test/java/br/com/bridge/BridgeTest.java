package br.com.bridge;

import br.com.bridge.message.Message;
import br.com.bridge.message.SystemMessage;
import br.com.bridge.message.UserMessage;
import br.com.bridge.sender.MailSender;
import br.com.bridge.sender.MessageSender;
import br.com.bridge.sender.QueueSender;
import br.com.bridge.sender.RestServiceSender;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void test_bridge(){
        Message userMessage = new UserMessage();
        userMessage.setBody("An user message.");

        Message systemMessage = new SystemMessage();
        systemMessage.setBody("A system message.");

        MessageSender queueSender = new QueueSender();
        queueSender.sendMessage(systemMessage);

        MailSender mailSender = new MailSender();
        mailSender.sendMessage(userMessage);

        RestServiceSender restServiceSender = new RestServiceSender();
        restServiceSender.sendMessage(userMessage);
        restServiceSender.sendMessage(systemMessage);

    }
}
