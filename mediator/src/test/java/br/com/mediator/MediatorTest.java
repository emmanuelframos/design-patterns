package br.com.mediator;

import br.com.mediator.core.MessageMediator;
import br.com.mediator.domain.Android;
import br.com.mediator.domain.IOS;
import br.com.mediator.domain.Smartphone;
import br.com.mediator.domain.Windows;
import org.junit.Test;

public class MediatorTest {

    @Test
    public void test_mediator(){
        MessageMediator mediator = new MessageMediator();

        Smartphone android = new Android(mediator);
        Smartphone ios = new IOS(mediator);
        Smartphone windows = new Windows(mediator);

        mediator
                .addSmartphone(android)
                .addSmartphone(ios)
                .addSmartphone(windows);

        System.out.println("Android talking...");
        android.sendMessage("Hello, I'm Android!");
        System.out.println();

        System.out.println("iOS talking...");
        ios.sendMessage("Hello, I'm iOS!");
        System.out.println();

        System.out.println("Windows talking...");
        windows.sendMessage("Hello, I'm Windows!");

    }
}