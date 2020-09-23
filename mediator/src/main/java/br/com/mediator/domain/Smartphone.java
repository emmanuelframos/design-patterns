package br.com.mediator.domain;

import br.com.mediator.core.Mediator;

public abstract class Smartphone {

    protected Mediator mediator;

    public Smartphone(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    public abstract void receiveMessage(String message);

}