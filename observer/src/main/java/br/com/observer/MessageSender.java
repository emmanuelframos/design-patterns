package br.com.observer;

public class MessageSender {

    public static final String SEND_MESSAGE = "sendMessage";

    private EventManager eventManager;

    public MessageSender(EventManager eventManager){
        this.eventManager = eventManager;
    }

    public void sendMessage(String message){
        eventManager.notify(SEND_MESSAGE, message);
    }
}