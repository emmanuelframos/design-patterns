package br.com.mediator.domain;

import br.com.mediator.core.Mediator;

public class Android extends Smartphone {

    public Android(Mediator mediator){
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Android received: " + message);
    }
}