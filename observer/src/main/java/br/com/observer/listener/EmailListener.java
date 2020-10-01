package br.com.observer.listener;

public class EmailListener implements EventListener {

    private String email;

    public EmailListener(String email){
        this.email = email;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Event performed: " + eventType);
        System.out.println("Sending mail to: " + this.email + " with message: " + message);
        System.out.println();
    }
}