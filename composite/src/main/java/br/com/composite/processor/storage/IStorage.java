package br.com.composite.processor.storage;


import br.com.composite.message.Message;
import br.com.composite.processor.IMessageProcessor;

public interface IStorage extends IMessageProcessor {

    void process(Message message);

}
