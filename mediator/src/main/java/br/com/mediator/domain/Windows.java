package br.com.mediator.domain;

import br.com.mediator.core.Mediator;

public class Windows extends Smartphone {

    public Windows(Mediator mediator){
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Windows received: " + message);
    }
}