package br.com.singleton;

public final class DatabaseConnection {

    private static DatabaseConnection INSTANCE = new DatabaseConnection();

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        return INSTANCE;
    }
}