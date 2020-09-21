package br.com.proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void test_proxy(){
        Image image = new ImageProxy("test_10mb.jpg");
        image.display();
        image.display();
    }
}