package br.com.observer;

import br.com.observer.listener.EmailListener;
import br.com.observer.listener.EventListener;
import br.com.observer.listener.LogListener;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test_observer(){
        EventListener emailListener = new EmailListener("john.doe@acme.com");
        EventListener logListener = new LogListener("/log/message.log");

        EventManager eventManager = new EventManager()
                .subscribe(MessageSender.SEND_MESSAGE, emailListener)
                .subscribe(MessageSender.SEND_MESSAGE, logListener);

        MessageSender messageSender = new MessageSender(eventManager);
        messageSender.sendMessage("Message #1.");

        eventManager.unsubscribe(MessageSender.SEND_MESSAGE, logListener);

        messageSender.sendMessage("Message #2.");
    }
}