package br.com.mediator.domain;

import br.com.mediator.core.Mediator;

public class IOS extends Smartphone {

    public IOS(Mediator mediator){
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("iOS received: " + message);
    }
}