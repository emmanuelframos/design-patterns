package br.com.mediator.core;

import br.com.mediator.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class MessageMediator implements Mediator {

    private List<Smartphone> smartphones;

    public MessageMediator(){
        this.smartphones = new ArrayList<>();
    }

    public MessageMediator addSmartphone(Smartphone smartphone){
        this.smartphones.add(smartphone);
        return this;
    }

    @Override
    public void sendMessage(Smartphone sender, String message) {
        for (Smartphone smartphone : smartphones)
            if (smartphone != sender)
                smartphone.receiveMessage(message);
    }
}