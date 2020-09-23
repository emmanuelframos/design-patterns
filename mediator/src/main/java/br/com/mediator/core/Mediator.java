package br.com.mediator.core;

import br.com.mediator.domain.Smartphone;

public interface Mediator {

    void sendMessage(Smartphone smartphone, String message);

}