package br.com.observer.listener;

public class LogListener implements EventListener {

    private String filePath;

    public LogListener(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Event performed: " + eventType);
        System.out.println("Storing message: " + message + " in log file: " + this.filePath);
        System.out.println();
    }
}