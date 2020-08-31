package br.com.composite.processor.storage;

import br.com.composite.message.Message;

public class DatabaseStorage implements IStorage {

    @Override
    public void process(Message message) {
        System.out.printf("Storing message: %s on database\n", message.getBody());
    }
}
