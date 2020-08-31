package br.com.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void test_singleton(){

        DatabaseConnection singleton = DatabaseConnection.getInstance();
        DatabaseConnection singletonToCompare = DatabaseConnection.getInstance();

        assert singleton.equals(singletonToCompare);
    }
}
