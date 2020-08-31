package br.com.composite.processor;

import br.com.composite.message.Message;

public interface IMessageProcessor {

   void process(Message message);

}